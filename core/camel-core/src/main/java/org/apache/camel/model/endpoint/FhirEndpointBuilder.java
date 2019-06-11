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
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The fhir component is used for working with the FHIR protocol (health care).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FhirEndpointBuilder {


    public static class FhirCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        FhirCommonBuilder(String path) {
            super("fhir", path);
        }
        /**
         * What kind of operation to perform. The option is a
         * <code>org.apache.camel.component.fhir.internal.FhirApiName</code>
         * type.
         */
        public T apiName(FhirApiName apiName) {
            this.properties.put("apiName", apiName);
            return (T) this;
        }
        /**
         * What kind of operation to perform. The option will be converted to a
         * <code>org.apache.camel.component.fhir.internal.FhirApiName</code>
         * type.
         */
        public T apiName(String apiName) {
            this.properties.put("apiName", apiName);
            return (T) this;
        }
        /**
         * What sub operation to use for the selected operation. The option is a
         * <code>java.lang.String</code> type.
         */
        public T methodName(String methodName) {
            this.properties.put("methodName", methodName);
            return (T) this;
        }
        /**
         * Encoding to use for all request. The option is a
         * <code>ca.uhn.fhir.rest.api.EncodingEnum</code> type.
         */
        public T encoding(EncodingEnum encoding) {
            this.properties.put("encoding", encoding);
            return (T) this;
        }
        /**
         * Encoding to use for all request. The option will be converted to a
         * <code>ca.uhn.fhir.rest.api.EncodingEnum</code> type.
         */
        public T encoding(String encoding) {
            this.properties.put("encoding", encoding);
            return (T) this;
        }
        /**
         * The FHIR Version to use. The option is a
         * <code>ca.uhn.fhir.context.FhirVersionEnum</code> type.
         */
        public T fhirVersion(FhirVersionEnum fhirVersion) {
            this.properties.put("fhirVersion", fhirVersion);
            return (T) this;
        }
        /**
         * The FHIR Version to use. The option will be converted to a
         * <code>ca.uhn.fhir.context.FhirVersionEnum</code> type.
         */
        public T fhirVersion(String fhirVersion) {
            this.properties.put("fhirVersion", fhirVersion);
            return (T) this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * The option is a <code>java.lang.String</code> type.
         */
        public T inBody(String inBody) {
            this.properties.put("inBody", inBody);
            return (T) this;
        }
        /**
         * Will log every requests and responses. The option is a
         * <code>boolean</code> type.
         */
        public T log(boolean log) {
            this.properties.put("log", log);
            return (T) this;
        }
        /**
         * Will log every requests and responses. The option will be converted
         * to a <code>boolean</code> type.
         */
        public T log(String log) {
            this.properties.put("log", log);
            return (T) this;
        }
        /**
         * Pretty print all request. The option is a <code>boolean</code> type.
         */
        public T prettyPrint(boolean prettyPrint) {
            this.properties.put("prettyPrint", prettyPrint);
            return (T) this;
        }
        /**
         * Pretty print all request. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T prettyPrint(String prettyPrint) {
            this.properties.put("prettyPrint", prettyPrint);
            return (T) this;
        }
        /**
         * The FHIR server base URL. The option is a
         * <code>java.lang.String</code> type.
         */
        public T serverUrl(String serverUrl) {
            this.properties.put("serverUrl", serverUrl);
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
         * Compresses outgoing (POST/PUT) contents to the GZIP format. The
         * option is a <code>boolean</code> type.
         */
        public T compress(boolean compress) {
            this.properties.put("compress", compress);
            return (T) this;
        }
        /**
         * Compresses outgoing (POST/PUT) contents to the GZIP format. The
         * option will be converted to a <code>boolean</code> type.
         */
        public T compress(String compress) {
            this.properties.put("compress", compress);
            return (T) this;
        }
        /**
         * How long to try and establish the initial TCP connection (in ms). The
         * option is a <code>java.lang.Integer</code> type.
         */
        public T connectionTimeout(Integer connectionTimeout) {
            this.properties.put("connectionTimeout", connectionTimeout);
            return (T) this;
        }
        /**
         * How long to try and establish the initial TCP connection (in ms). The
         * option will be converted to a <code>java.lang.Integer</code> type.
         */
        public T connectionTimeout(String connectionTimeout) {
            this.properties.put("connectionTimeout", connectionTimeout);
            return (T) this;
        }
        /**
         * When this option is set, model classes will not be scanned for
         * children until the child list for the given type is actually
         * accessed. The option is a <code>boolean</code> type.
         */
        public T deferModelScanning(boolean deferModelScanning) {
            this.properties.put("deferModelScanning", deferModelScanning);
            return (T) this;
        }
        /**
         * When this option is set, model classes will not be scanned for
         * children until the child list for the given type is actually
         * accessed. The option will be converted to a <code>boolean</code>
         * type.
         */
        public T deferModelScanning(String deferModelScanning) {
            this.properties.put("deferModelScanning", deferModelScanning);
            return (T) this;
        }
        /**
         * FhirContext is an expensive object to create. To avoid creating
         * multiple instances, it can be set directly. The option is a
         * <code>ca.uhn.fhir.context.FhirContext</code> type.
         */
        public T fhirContext(Object fhirContext) {
            this.properties.put("fhirContext", fhirContext);
            return (T) this;
        }
        /**
         * FhirContext is an expensive object to create. To avoid creating
         * multiple instances, it can be set directly. The option will be
         * converted to a <code>ca.uhn.fhir.context.FhirContext</code> type.
         */
        public T fhirContext(String fhirContext) {
            this.properties.put("fhirContext", fhirContext);
            return (T) this;
        }
        /**
         * Force conformance check. The option is a <code>boolean</code> type.
         */
        public T forceConformanceCheck(boolean forceConformanceCheck) {
            this.properties.put("forceConformanceCheck", forceConformanceCheck);
            return (T) this;
        }
        /**
         * Force conformance check. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T forceConformanceCheck(String forceConformanceCheck) {
            this.properties.put("forceConformanceCheck", forceConformanceCheck);
            return (T) this;
        }
        /**
         * HTTP session cookie to add to every request. The option is a
         * <code>java.lang.String</code> type.
         */
        public T sessionCookie(String sessionCookie) {
            this.properties.put("sessionCookie", sessionCookie);
            return (T) this;
        }
        /**
         * How long to block for individual read/write operations (in ms). The
         * option is a <code>java.lang.Integer</code> type.
         */
        public T socketTimeout(Integer socketTimeout) {
            this.properties.put("socketTimeout", socketTimeout);
            return (T) this;
        }
        /**
         * How long to block for individual read/write operations (in ms). The
         * option will be converted to a <code>java.lang.Integer</code> type.
         */
        public T socketTimeout(String socketTimeout) {
            this.properties.put("socketTimeout", socketTimeout);
            return (T) this;
        }
        /**
         * Request that the server modify the response using the _summary param.
         * The option is a <code>ca.uhn.fhir.rest.api.SummaryEnum</code> type.
         */
        public T summary(SummaryEnum summary) {
            this.properties.put("summary", summary);
            return (T) this;
        }
        /**
         * Request that the server modify the response using the _summary param.
         * The option will be converted to a
         * <code>ca.uhn.fhir.rest.api.SummaryEnum</code> type.
         */
        public T summary(String summary) {
            this.properties.put("summary", summary);
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
        /**
         * When should Camel validate the FHIR Server's conformance statement.
         * The option is a
         * <code>ca.uhn.fhir.rest.client.api.ServerValidationModeEnum</code>
         * type.
         */
        public T validationMode(ServerValidationModeEnum validationMode) {
            this.properties.put("validationMode", validationMode);
            return (T) this;
        }
        /**
         * When should Camel validate the FHIR Server's conformance statement.
         * The option will be converted to a
         * <code>ca.uhn.fhir.rest.client.api.ServerValidationModeEnum</code>
         * type.
         */
        public T validationMode(String validationMode) {
            this.properties.put("validationMode", validationMode);
            return (T) this;
        }
        /**
         * The proxy host. The option is a <code>java.lang.String</code> type.
         */
        public T proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (T) this;
        }
        /**
         * The proxy password. The option is a <code>java.lang.String</code>
         * type.
         */
        public T proxyPassword(String proxyPassword) {
            this.properties.put("proxyPassword", proxyPassword);
            return (T) this;
        }
        /**
         * The proxy port. The option is a <code>java.lang.Integer</code> type.
         */
        public T proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
        /**
         * The proxy port. The option will be converted to a
         * <code>java.lang.Integer</code> type.
         */
        public T proxyPort(String proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
        /**
         * The proxy username. The option is a <code>java.lang.String</code>
         * type.
         */
        public T proxyUser(String proxyUser) {
            this.properties.put("proxyUser", proxyUser);
            return (T) this;
        }
        /**
         * OAuth access token. The option is a <code>java.lang.String</code>
         * type.
         */
        public T accessToken(String accessToken) {
            this.properties.put("accessToken", accessToken);
            return (T) this;
        }
        /**
         * Username to use for basic authentication. The option is a
         * <code>java.lang.String</code> type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Username to use for basic authentication. The option is a
         * <code>java.lang.String</code> type.
         */
        public T username(String username) {
            this.properties.put("username", username);
            return (T) this;
        }
    }

    public static class FhirConsumerBuilder
            extends
                FhirCommonBuilder<FhirConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public FhirConsumerBuilder(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a <code>boolean</code> type.
         */
        public FhirConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (FhirConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option will be converted to a <code>boolean</code> type.
         */
        public FhirConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (FhirConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public FhirConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (FhirConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public FhirConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (FhirConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public FhirConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (FhirConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public FhirConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (FhirConsumerBuilder) this;
        }
    }

    public static class FhirProducerBuilder
            extends
                FhirCommonBuilder<FhirProducerBuilder>
            implements
                EndpointProducerBuilder {
        public FhirProducerBuilder(String path) {
            super(path);
        }
    }

    public static enum FhirApiName {
        CAPABILITIES, CREATE, DELETE, HISTORY, LOAD_PAGE, META, OPERATION, PATCH, READ, SEARCH, TRANSACTION, UPDATE, VALIDATE;
    }

    public static enum EncodingEnum {
        JSON, XML;
    }

    public static enum FhirVersionEnum {
        DSTU2, DSTU2_HL7ORG, DSTU2_1, DSTU3, R4;
    }

    public static enum SummaryEnum {
        COUNT, TEXT, DATA, TRUE, FALSE;
    }

    public static enum ServerValidationModeEnum {
        NEVER, ONCE;
    }
    public default FhirConsumerBuilder fromFhir(String path) {
        return new FhirConsumerBuilder(path);
    }
    public default FhirProducerBuilder toFhir(String path) {
        return new FhirProducerBuilder(path);
    }
}