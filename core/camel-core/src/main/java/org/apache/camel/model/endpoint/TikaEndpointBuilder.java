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
package org.apache.camel.model.endpoint;

import javax.annotation.Generated;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;

/**
 * This component integrates with Apache Tika to extract content and metadata
 * from thousands of file types.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface TikaEndpointBuilder {


    public static class TikaCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        TikaCommonBuilder(String path) {
            super("tika", path);
        }
        /**
         * Tika Operation. parse or detect. The option is a
         * <code>org.apache.camel.component.tika.TikaOperation</code> type.
         */
        public T operation(TikaOperation operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Tika Operation. parse or detect. The option will be converted to a
         * <code>org.apache.camel.component.tika.TikaOperation</code> type.
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Tika Config. The option is a
         * <code>org.apache.tika.config.TikaConfig</code> type.
         */
        public T tikaConfig(Object tikaConfig) {
            this.properties.put("tikaConfig", tikaConfig);
            return (T) this;
        }
        /**
         * Tika Config. The option will be converted to a
         * <code>org.apache.tika.config.TikaConfig</code> type.
         */
        public T tikaConfig(String tikaConfig) {
            this.properties.put("tikaConfig", tikaConfig);
            return (T) this;
        }
        /**
         * Tika Config Uri: The URI of tika-config.xml. The option is a
         * <code>java.lang.String</code> type.
         */
        public T tikaConfigUri(String tikaConfigUri) {
            this.properties.put("tikaConfigUri", tikaConfigUri);
            return (T) this;
        }
        /**
         * Tika Parse Output Encoding - Used to specify the character encoding
         * of the parsed output. Defaults to Charset.defaultCharset() . The
         * option is a <code>java.lang.String</code> type.
         */
        public T tikaParseOutputEncoding(String tikaParseOutputEncoding) {
            this.properties.put("tikaParseOutputEncoding", tikaParseOutputEncoding);
            return (T) this;
        }
        /**
         * Tika Output Format. Supported output formats. xml: Returns Parsed
         * Content as XML. html: Returns Parsed Content as HTML. text: Returns
         * Parsed Content as Text. textMain: Uses the boilerpipe library to
         * automatically extract the main content from a web page. The option is
         * a <code>org.apache.camel.component.tika.TikaParseOutputFormat</code>
         * type.
         */
        public T tikaParseOutputFormat(
                TikaParseOutputFormat tikaParseOutputFormat) {
            this.properties.put("tikaParseOutputFormat", tikaParseOutputFormat);
            return (T) this;
        }
        /**
         * Tika Output Format. Supported output formats. xml: Returns Parsed
         * Content as XML. html: Returns Parsed Content as HTML. text: Returns
         * Parsed Content as Text. textMain: Uses the boilerpipe library to
         * automatically extract the main content from a web page. The option
         * will be converted to a
         * <code>org.apache.camel.component.tika.TikaParseOutputFormat</code>
         * type.
         */
        public T tikaParseOutputFormat(String tikaParseOutputFormat) {
            this.properties.put("tikaParseOutputFormat", tikaParseOutputFormat);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a <code>boolean</code> type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * will be converted to a <code>boolean</code> type.
         */
        public T basicPropertyBinding(String basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a <code>boolean</code> type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * will be converted to a <code>boolean</code> type.
         */
        public T synchronous(String synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    public static class TikaProducerBuilder
            extends
                TikaCommonBuilder<TikaProducerBuilder>
            implements
                EndpointProducerBuilder {
        public TikaProducerBuilder(String path) {
            super(path);
        }
    }

    public static enum TikaOperation {
        parse, detect;
    }

    public static enum TikaParseOutputFormat {
        xml, html, text, textMain;
    }
    public default TikaProducerBuilder toTika(String path) {
        return new TikaProducerBuilder(path);
    }
}