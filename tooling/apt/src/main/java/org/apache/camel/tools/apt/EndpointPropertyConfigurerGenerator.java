/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.tools.apt;

import java.io.Writer;
import java.util.Set;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

import org.apache.camel.tools.apt.helper.IOHelper;
import org.apache.camel.tools.apt.model.EndpointOption;
import org.apache.camel.tools.apt.model.EndpointPath;

import static org.apache.camel.tools.apt.AnnotationProcessorHelper.dumpExceptionToErrorFile;

public final class EndpointPropertyConfigurerGenerator {

    private EndpointPropertyConfigurerGenerator() {
    }

    public static void generatePropertyConfigurer(ProcessingEnvironment processingEnv, TypeElement parent,
                                                  String pn, String cn, String fqn, String en, String fqen,
                                                  Set<EndpointPath> paths, Set<EndpointOption> options) {

        Writer w = null;
        try {
            JavaFileObject src = processingEnv.getFiler().createSourceFile(fqn, parent);
            w = src.openWriter();

            int size = paths.size() + options.size();

            w.write("/* Generated by org.apache.camel:apt */\n");
            w.write("package " + pn + ";\n");
            w.write("\n");
            w.write("import java.util.HashMap;\n");
            w.write("import java.util.Map;\n");
            w.write("import java.util.function.Consumer;\n");
            w.write("import java.util.function.Supplier;\n");
            w.write("\n");
            w.write("import org.apache.camel.CamelContext;\n");
            w.write("import " + fqen + ";\n");
            w.write("import org.apache.camel.spi.EndpointPropertyConfigurer;\n");
            w.write("\n");
            w.write("/**\n");
            w.write(" * Source code generated by org.apache.camel:apt\n");
            w.write(" */\n");
            w.write("public class " + cn + " implements EndpointPropertyConfigurer {\n");
            w.write("\n");
            w.write("    private final Map<String, Supplier<Object>> readPlaceholders = new HashMap<>(" + size + ");\n");
            w.write("    private final Map<String, Consumer<Object>> writePlaceholders = new HashMap<>(" + size + ");\n");
            w.write("\n");

            // add constructor
            w.write("    public void configure(Object object, CamelContext camelContext) {\n");
            w.write("        " + en + " endpoint = (" + en + ") object;\n");
            w.write("\n");

            // only include string types as they are the only ones we can use for property placeholders
            for (EndpointPath option : paths) {
                String getOrSet = option.getName();
                getOrSet = Character.toUpperCase(getOrSet.charAt(0)) + getOrSet.substring(1);
                String getterLambda = getterLambda(getOrSet, option.getName(), option.getType());
                String setterLambda = setterLambda(getOrSet, option.getName(), option.getType());
                w.write("        readPlaceholders.put(\"" + option.getName() + "\", " + getterLambda + ");\n");
                w.write("        writePlaceholders.put(\"" + option.getName() + "\", " + setterLambda + ");\n");
            }
            for (EndpointOption option : options) {
                String getOrSet = option.getName();
                getOrSet = Character.toUpperCase(getOrSet.charAt(0)) + getOrSet.substring(1);
                String getterLambda = getterLambda(getOrSet, option.getName(), option.getType());
                String setterLambda = setterLambda(getOrSet, option.getName(), option.getType());
                w.write("        readPlaceholders.put(\"" + option.getName() + "\", " + getterLambda + ");\n");
                w.write("        writePlaceholders.put(\"" + option.getName() + "\", " + setterLambda + ");\n");
            }

            w.write("    }\n");
            w.write("\n");
            w.write("    @Override\n");
            w.write("    public Map<String, Supplier<Object>> getReadPropertyPlaceholderOptions(CamelContext camelContext) {\n");
            w.write("        return readPlaceholders;\n");
            w.write("    }\n");
            w.write("\n");
            w.write("    @Override\n");
            w.write("    public Map<String, Consumer<Object>> getWritePropertyPlaceholderOptions(CamelContext camelContext) {\n");
            w.write("        return writePlaceholders;\n");
            w.write("    }\n");
            w.write("\n");
            w.write("}\n");
            w.write("\n");
        } catch (Exception e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Unable to generate source code file: " + fqn + ": " + e.getMessage());
            dumpExceptionToErrorFile("camel-apt-error.log", "Unable to generate source code file: " + fqn, e);
        } finally {
            IOHelper.close(w);
        }
    }

    private static String getterLambda(String getOrSet, String name, String type) {
        String getPrefix = "boolean".equals(type) ? "is" : "get";
        return "endpoint::" + getPrefix + getOrSet;
    }

    private static String setterLambda(String getOrSet, String name, String type) {
        // type may contain generics so remove those
        if (type.indexOf('<') != -1) {
            type = type.substring(0, type.indexOf('<'));
        }

        //  writePlaceholders.put("groupSize", o -> endpoint.setGroupSize(camelContext.getTypeConverter().convertTo(Integer.class, o)));
        StringBuilder sb = new StringBuilder();
        sb.append("o -> endpoint.set").append(getOrSet).append("(camelContext.getTypeConverter().convertTo(").append(type).append(".class, o))");
        return sb.toString();
    }

}
