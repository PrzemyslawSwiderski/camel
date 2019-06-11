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
 * The atmos component is used for integrating with EMC's Atomos Storage.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AtmosEndpointBuilder {


    public static class AtmosCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        AtmosCommonBuilder(String path) {
            super("atmos", path);
        }
        /**
         * Atmos name. The option is a <code>java.lang.String</code> type.
         */
        public T name(String name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * Operation to perform. The option is a
         * <code>org.apache.camel.component.atmos.util.AtmosOperation</code>
         * type.
         */
        public T operation(AtmosOperation operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Operation to perform. The option will be converted to a
         * <code>org.apache.camel.component.atmos.util.AtmosOperation</code>
         * type.
         */
        public T operation(String operation) {
            this.properties.put("operation", operation);
            return (T) this;
        }
        /**
         * Atmos SSL validation. The option is a <code>boolean</code> type.
         */
        public T enableSslValidation(boolean enableSslValidation) {
            this.properties.put("enableSslValidation", enableSslValidation);
            return (T) this;
        }
        /**
         * Atmos SSL validation. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T enableSslValidation(String enableSslValidation) {
            this.properties.put("enableSslValidation", enableSslValidation);
            return (T) this;
        }
        /**
         * Atmos client fullTokenId. The option is a
         * <code>java.lang.String</code> type.
         */
        public T fullTokenId(String fullTokenId) {
            this.properties.put("fullTokenId", fullTokenId);
            return (T) this;
        }
        /**
         * Local path to put files. The option is a
         * <code>java.lang.String</code> type.
         */
        public T localPath(String localPath) {
            this.properties.put("localPath", localPath);
            return (T) this;
        }
        /**
         * New path on Atmos when moving files. The option is a
         * <code>java.lang.String</code> type.
         */
        public T newRemotePath(String newRemotePath) {
            this.properties.put("newRemotePath", newRemotePath);
            return (T) this;
        }
        /**
         * Search query on Atmos. The option is a <code>java.lang.String</code>
         * type.
         */
        public T query(String query) {
            this.properties.put("query", query);
            return (T) this;
        }
        /**
         * Where to put files on Atmos. The option is a
         * <code>java.lang.String</code> type.
         */
        public T remotePath(String remotePath) {
            this.properties.put("remotePath", remotePath);
            return (T) this;
        }
        /**
         * Atmos shared secret. The option is a <code>java.lang.String</code>
         * type.
         */
        public T secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (T) this;
        }
        /**
         * Atomos server uri. The option is a <code>java.lang.String</code>
         * type.
         */
        public T uri(String uri) {
            this.properties.put("uri", uri);
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

    public static class AtmosConsumerBuilder
            extends
                AtmosCommonBuilder<AtmosConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public AtmosConsumerBuilder(String path) {
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
        public AtmosConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (AtmosConsumerBuilder) this;
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
        public AtmosConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (AtmosConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public AtmosConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (AtmosConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public AtmosConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (AtmosConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public AtmosConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (AtmosConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public AtmosConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (AtmosConsumerBuilder) this;
        }
    }

    public static class AtmosProducerBuilder
            extends
                AtmosCommonBuilder<AtmosProducerBuilder>
            implements
                EndpointProducerBuilder {
        public AtmosProducerBuilder(String path) {
            super(path);
        }
    }

    public static enum AtmosOperation {
        put, del, search, get, move;
    }
    public default AtmosConsumerBuilder fromAtmos(String path) {
        return new AtmosConsumerBuilder(path);
    }
    public default AtmosProducerBuilder toAtmos(String path) {
        return new AtmosProducerBuilder(path);
    }
}