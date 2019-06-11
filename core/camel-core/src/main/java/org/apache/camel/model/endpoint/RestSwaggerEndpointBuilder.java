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

import java.net.URI;
import javax.annotation.Generated;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;

/**
 * An awesome REST endpoint backed by Swagger specifications.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestSwaggerEndpointBuilder {


    public static class RestSwaggerCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        RestSwaggerCommonBuilder(String path) {
            super("rest-swagger", path);
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

    public static class RestSwaggerProducerBuilder
            extends
                RestSwaggerCommonBuilder<RestSwaggerProducerBuilder>
            implements
                EndpointProducerBuilder {
        public RestSwaggerProducerBuilder(String path) {
            super(path);
        }
        /**
         * Path to the Swagger specification file. The scheme, host base path
         * are taken from this specification, but these can be overridden with
         * properties on the component or endpoint level. If not given the
         * component tries to load swagger.json resource from the classpath.
         * Note that the host defined on the component and endpoint of this
         * Component should contain the scheme, hostname and optionally the port
         * in the URI syntax (i.e. http://api.example.com:8080). Overrides
         * component configuration. The Swagger specification can be loaded from
         * different sources by prefixing with file: classpath: http: https:.
         * Support for https is limited to using the JDK installed UrlHandler,
         * and as such it can be cumbersome to setup TLS/SSL certificates for
         * https (such as setting a number of javax.net.ssl JVM system
         * properties). How to do that consult the JDK documentation for
         * UrlHandler. The option is a <code>java.net.URI</code> type.
         */
        public RestSwaggerProducerBuilder specificationUri(URI specificationUri) {
            this.properties.put("specificationUri", specificationUri);
            return (RestSwaggerProducerBuilder) this;
        }
        /**
         * Path to the Swagger specification file. The scheme, host base path
         * are taken from this specification, but these can be overridden with
         * properties on the component or endpoint level. If not given the
         * component tries to load swagger.json resource from the classpath.
         * Note that the host defined on the component and endpoint of this
         * Component should contain the scheme, hostname and optionally the port
         * in the URI syntax (i.e. http://api.example.com:8080). Overrides
         * component configuration. The Swagger specification can be loaded from
         * different sources by prefixing with file: classpath: http: https:.
         * Support for https is limited to using the JDK installed UrlHandler,
         * and as such it can be cumbersome to setup TLS/SSL certificates for
         * https (such as setting a number of javax.net.ssl JVM system
         * properties). How to do that consult the JDK documentation for
         * UrlHandler. The option will be converted to a
         * <code>java.net.URI</code> type.
         */
        public RestSwaggerProducerBuilder specificationUri(
                String specificationUri) {
            this.properties.put("specificationUri", specificationUri);
            return (RestSwaggerProducerBuilder) this;
        }
        /**
         * ID of the operation from the Swagger specification. The option is a
         * <code>java.lang.String</code> type.
         */
        public RestSwaggerProducerBuilder operationId(String operationId) {
            this.properties.put("operationId", operationId);
            return (RestSwaggerProducerBuilder) this;
        }
        /**
         * API basePath, for example /v2. Default is unset, if set overrides the
         * value present in Swagger specification and in the component
         * configuration. The option is a <code>java.lang.String</code> type.
         */
        public RestSwaggerProducerBuilder basePath(String basePath) {
            this.properties.put("basePath", basePath);
            return (RestSwaggerProducerBuilder) this;
        }
        /**
         * Name of the Camel component that will perform the requests. The
         * compnent must be present in Camel registry and it must implement
         * RestProducerFactory service provider interface. If not set CLASSPATH
         * is searched for single component that implements RestProducerFactory
         * SPI. Overrides component configuration. The option is a
         * <code>java.lang.String</code> type.
         */
        public RestSwaggerProducerBuilder componentName(String componentName) {
            this.properties.put("componentName", componentName);
            return (RestSwaggerProducerBuilder) this;
        }
        /**
         * What payload type this component capable of consuming. Could be one
         * type, like application/json or multiple types as application/json,
         * application/xml; q=0.5 according to the RFC7231. This equates to the
         * value of Accept HTTP header. If set overrides any value found in the
         * Swagger specification and. in the component configuration. The option
         * is a <code>java.lang.String</code> type.
         */
        public RestSwaggerProducerBuilder consumes(String consumes) {
            this.properties.put("consumes", consumes);
            return (RestSwaggerProducerBuilder) this;
        }
        /**
         * Scheme hostname and port to direct the HTTP requests to in the form
         * of https://hostname:port. Can be configured at the endpoint,
         * component or in the correspoding REST configuration in the Camel
         * Context. If you give this component a name (e.g. petstore) that REST
         * configuration is consulted first, rest-swagger next, and global
         * configuration last. If set overrides any value found in the Swagger
         * specification, RestConfiguration. Overrides all other configuration.
         * The option is a <code>java.lang.String</code> type.
         */
        public RestSwaggerProducerBuilder host(String host) {
            this.properties.put("host", host);
            return (RestSwaggerProducerBuilder) this;
        }
        /**
         * What payload type this component is producing. For example
         * application/json according to the RFC7231. This equates to the value
         * of Content-Type HTTP header. If set overrides any value present in
         * the Swagger specification. Overrides all other configuration. The
         * option is a <code>java.lang.String</code> type.
         */
        public RestSwaggerProducerBuilder produces(String produces) {
            this.properties.put("produces", produces);
            return (RestSwaggerProducerBuilder) this;
        }
    }
    public default RestSwaggerProducerBuilder toRestSwagger(String path) {
        return new RestSwaggerProducerBuilder(path);
    }
}