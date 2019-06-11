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
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The coap component is used for sending and receiving messages from COAP
 * capable devices.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CoAPEndpointBuilder {


    public static class CoAPCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        CoAPCommonBuilder(String path) {
            super("coap", path);
        }
        /**
         * The URI for the CoAP endpoint. The option is a
         * <code>java.net.URI</code> type.
         */
        public T uri(URI uri) {
            this.properties.put("uri", uri);
            return (T) this;
        }
        /**
         * The URI for the CoAP endpoint. The option will be converted to a
         * <code>java.net.URI</code> type.
         */
        public T uri(String uri) {
            this.properties.put("uri", uri);
            return (T) this;
        }
        /**
         * Sets the alias used to query the KeyStore for the private key and
         * certificate. This parameter is used when we are enabling TLS with
         * certificates on the service side, and similarly on the client side
         * when TLS is used with certificates and client authentication. If the
         * parameter is not specified then the default behavior is to use the
         * first alias in the keystore that contains a key entry. This
         * configuration parameter does not apply to configuring TLS via a Raw
         * Public Key or a Pre-Shared Key. The option is a
         * <code>java.lang.String</code> type.
         */
        public T alias(String alias) {
            this.properties.put("alias", alias);
            return (T) this;
        }
        /**
         * Sets the cipherSuites String. This is a comma separated String of
         * ciphersuites to configure. If it is not specified, then it falls back
         * to getting the ciphersuites from the sslContextParameters object. The
         * option is a <code>java.lang.String</code> type.
         */
        public T cipherSuites(String cipherSuites) {
            this.properties.put("cipherSuites", cipherSuites);
            return (T) this;
        }
        /**
         * Sets the configuration options for server-side client-authentication
         * requirements. The value must be one of NONE, WANT, REQUIRE. If this
         * value is not specified, then it falls back to checking the
         * sslContextParameters.getServerParameters().getClientAuthentication()
         * value. The option is a <code>java.lang.String</code> type.
         */
        public T clientAuthentication(String clientAuthentication) {
            this.properties.put("clientAuthentication", clientAuthentication);
            return (T) this;
        }
        /**
         * Set the configured private key for use with Raw Public Key. The
         * option is a <code>java.security.PrivateKey</code> type.
         */
        public T privateKey(PrivateKey privateKey) {
            this.properties.put("privateKey", privateKey);
            return (T) this;
        }
        /**
         * Set the configured private key for use with Raw Public Key. The
         * option will be converted to a <code>java.security.PrivateKey</code>
         * type.
         */
        public T privateKey(String privateKey) {
            this.properties.put("privateKey", privateKey);
            return (T) this;
        }
        /**
         * Set the PskStore to use for pre-shared key. The option is a
         * <code>org.eclipse.californium.scandium.dtls.pskstore.PskStore</code>
         * type.
         */
        public T pskStore(Object pskStore) {
            this.properties.put("pskStore", pskStore);
            return (T) this;
        }
        /**
         * Set the PskStore to use for pre-shared key. The option will be
         * converted to a
         * <code>org.eclipse.californium.scandium.dtls.pskstore.PskStore</code>
         * type.
         */
        public T pskStore(String pskStore) {
            this.properties.put("pskStore", pskStore);
            return (T) this;
        }
        /**
         * Set the configured public key for use with Raw Public Key. The option
         * is a <code>java.security.PublicKey</code> type.
         */
        public T publicKey(PublicKey publicKey) {
            this.properties.put("publicKey", publicKey);
            return (T) this;
        }
        /**
         * Set the configured public key for use with Raw Public Key. The option
         * will be converted to a <code>java.security.PublicKey</code> type.
         */
        public T publicKey(String publicKey) {
            this.properties.put("publicKey", publicKey);
            return (T) this;
        }
        /**
         * Set the SSLContextParameters object for setting up TLS. This is
         * required for coapstcp, and for coaps when we are using certificates
         * for TLS (as opposed to RPK or PKS). The option is a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         */
        public T sslContextParameters(Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
        /**
         * Set the SSLContextParameters object for setting up TLS. This is
         * required for coapstcp, and for coaps when we are using certificates
         * for TLS (as opposed to RPK or PKS). The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         */
        public T sslContextParameters(String sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
        /**
         * Set the TrustedRpkStore to use to determine trust in raw public keys.
         * The option is a
         * <code>org.eclipse.californium.scandium.dtls.rpkstore.TrustedRpkStore</code> type.
         */
        public T trustedRpkStore(Object trustedRpkStore) {
            this.properties.put("trustedRpkStore", trustedRpkStore);
            return (T) this;
        }
        /**
         * Set the TrustedRpkStore to use to determine trust in raw public keys.
         * The option will be converted to a
         * <code>org.eclipse.californium.scandium.dtls.rpkstore.TrustedRpkStore</code> type.
         */
        public T trustedRpkStore(String trustedRpkStore) {
            this.properties.put("trustedRpkStore", trustedRpkStore);
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

    public static class CoAPConsumerBuilder
            extends
                CoAPCommonBuilder<CoAPConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public CoAPConsumerBuilder(String path) {
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
        public CoAPConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CoAPConsumerBuilder) this;
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
        public CoAPConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (CoAPConsumerBuilder) this;
        }
        /**
         * Comma separated list of methods that the CoAP consumer will bind to.
         * The default is to bind to all methods (DELETE, GET, POST, PUT). The
         * option is a <code>java.lang.String</code> type.
         */
        public CoAPConsumerBuilder coapMethodRestrict(String coapMethodRestrict) {
            this.properties.put("coapMethodRestrict", coapMethodRestrict);
            return (CoAPConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public CoAPConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CoAPConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public CoAPConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (CoAPConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public CoAPConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CoAPConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public CoAPConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (CoAPConsumerBuilder) this;
        }
    }

    public static class CoAPProducerBuilder
            extends
                CoAPCommonBuilder<CoAPProducerBuilder>
            implements
                EndpointProducerBuilder {
        public CoAPProducerBuilder(String path) {
            super(path);
        }
    }
    public default CoAPConsumerBuilder fromCoAP(String path) {
        return new CoAPConsumerBuilder(path);
    }
    public default CoAPProducerBuilder toCoAP(String path) {
        return new CoAPProducerBuilder(path);
    }
}