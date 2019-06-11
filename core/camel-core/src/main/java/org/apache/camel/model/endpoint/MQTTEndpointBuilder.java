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
import java.util.concurrent.Executor;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Component for communicating with MQTT M2M message brokers using FuseSource
 * MQTT Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MQTTEndpointBuilder {


    public static class MQTTCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        MQTTCommonBuilder(String path) {
            super("mqtt", path);
        }
        /**
         * A logical name to use which is not the topic name. The option is a
         * <code>java.lang.String</code> type.
         */
        public T name(String name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * SSL connections perform blocking operations against internal thread
         * pool unless you call the setBlockingExecutor method to configure that
         * executor they will use instead. The option is a
         * <code>java.util.concurrent.Executor</code> type.
         */
        public T blockingExecutor(Executor blockingExecutor) {
            this.properties.put("blockingExecutor", blockingExecutor);
            return (T) this;
        }
        /**
         * SSL connections perform blocking operations against internal thread
         * pool unless you call the setBlockingExecutor method to configure that
         * executor they will use instead. The option will be converted to a
         * <code>java.util.concurrent.Executor</code> type.
         */
        public T blockingExecutor(String blockingExecutor) {
            this.properties.put("blockingExecutor", blockingExecutor);
            return (T) this;
        }
        /**
         * The default retain policy to be used on messages sent to the MQTT
         * broker. The option is a <code>boolean</code> type.
         */
        public T byDefaultRetain(boolean byDefaultRetain) {
            this.properties.put("byDefaultRetain", byDefaultRetain);
            return (T) this;
        }
        /**
         * The default retain policy to be used on messages sent to the MQTT
         * broker. The option will be converted to a <code>boolean</code> type.
         */
        public T byDefaultRetain(String byDefaultRetain) {
            this.properties.put("byDefaultRetain", byDefaultRetain);
            return (T) this;
        }
        /**
         * Set to false if you want the MQTT server to persist topic
         * subscriptions and ack positions across client sessions. Defaults to
         * true. The option is a <code>boolean</code> type.
         */
        public T cleanSession(boolean cleanSession) {
            this.properties.put("cleanSession", cleanSession);
            return (T) this;
        }
        /**
         * Set to false if you want the MQTT server to persist topic
         * subscriptions and ack positions across client sessions. Defaults to
         * true. The option will be converted to a <code>boolean</code> type.
         */
        public T cleanSession(String cleanSession) {
            this.properties.put("cleanSession", cleanSession);
            return (T) this;
        }
        /**
         * Use to set the client Id of the session. This is what an MQTT server
         * uses to identify a session where setCleanSession(false); is being
         * used. The id must be 23 characters or less. Defaults to auto
         * generated id (based on your socket address, port and timestamp). The
         * option is a <code>java.lang.String</code> type.
         */
        public T clientId(String clientId) {
            this.properties.put("clientId", clientId);
            return (T) this;
        }
        /**
         * The maximum number of reconnect attempts before an error is reported
         * back to the client on the first attempt by the client to connect to a
         * server. Set to -1 to use unlimited attempts. Defaults to -1. The
         * option is a <code>long</code> type.
         */
        public T connectAttemptsMax(long connectAttemptsMax) {
            this.properties.put("connectAttemptsMax", connectAttemptsMax);
            return (T) this;
        }
        /**
         * The maximum number of reconnect attempts before an error is reported
         * back to the client on the first attempt by the client to connect to a
         * server. Set to -1 to use unlimited attempts. Defaults to -1. The
         * option will be converted to a <code>long</code> type.
         */
        public T connectAttemptsMax(String connectAttemptsMax) {
            this.properties.put("connectAttemptsMax", connectAttemptsMax);
            return (T) this;
        }
        /**
         * Delay in seconds the Component will wait for a connection to be
         * established to the MQTT broker. The option is a <code>int</code>
         * type.
         */
        public T connectWaitInSeconds(int connectWaitInSeconds) {
            this.properties.put("connectWaitInSeconds", connectWaitInSeconds);
            return (T) this;
        }
        /**
         * Delay in seconds the Component will wait for a connection to be
         * established to the MQTT broker. The option will be converted to a
         * <code>int</code> type.
         */
        public T connectWaitInSeconds(String connectWaitInSeconds) {
            this.properties.put("connectWaitInSeconds", connectWaitInSeconds);
            return (T) this;
        }
        /**
         * The number of seconds the Component will wait for a valid disconnect
         * on stop() from the MQTT broker. The option is a <code>int</code>
         * type.
         */
        public T disconnectWaitInSeconds(int disconnectWaitInSeconds) {
            this.properties.put("disconnectWaitInSeconds", disconnectWaitInSeconds);
            return (T) this;
        }
        /**
         * The number of seconds the Component will wait for a valid disconnect
         * on stop() from the MQTT broker. The option will be converted to a
         * <code>int</code> type.
         */
        public T disconnectWaitInSeconds(String disconnectWaitInSeconds) {
            this.properties.put("disconnectWaitInSeconds", disconnectWaitInSeconds);
            return (T) this;
        }
        /**
         * A HawtDispatch dispatch queue is used to synchronize access to the
         * connection. If an explicit queue is not configured via the
         * setDispatchQueue method, then a new queue will be created for the
         * connection. Setting an explicit queue might be handy if you want
         * multiple connection to share the same queue for synchronization. The
         * option is a <code>org.fusesource.hawtdispatch.DispatchQueue</code>
         * type.
         */
        public T dispatchQueue(Object dispatchQueue) {
            this.properties.put("dispatchQueue", dispatchQueue);
            return (T) this;
        }
        /**
         * A HawtDispatch dispatch queue is used to synchronize access to the
         * connection. If an explicit queue is not configured via the
         * setDispatchQueue method, then a new queue will be created for the
         * connection. Setting an explicit queue might be handy if you want
         * multiple connection to share the same queue for synchronization. The
         * option will be converted to a
         * <code>org.fusesource.hawtdispatch.DispatchQueue</code> type.
         */
        public T dispatchQueue(String dispatchQueue) {
            this.properties.put("dispatchQueue", dispatchQueue);
            return (T) this;
        }
        /**
         * The URI of the MQTT broker to connect too - this component also
         * supports SSL - e.g. ssl://127.0.0.1:8883. The option is a
         * <code>java.lang.String</code> type.
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * Configures the Keep Alive timer in seconds. Defines the maximum time
         * interval between messages received from a client. It enables the
         * server to detect that the network connection to a client has dropped,
         * without having to wait for the long TCP/IP timeout. The option is a
         * <code>short</code> type.
         */
        public T keepAlive(short keepAlive) {
            this.properties.put("keepAlive", keepAlive);
            return (T) this;
        }
        /**
         * Configures the Keep Alive timer in seconds. Defines the maximum time
         * interval between messages received from a client. It enables the
         * server to detect that the network connection to a client has dropped,
         * without having to wait for the long TCP/IP timeout. The option will
         * be converted to a <code>short</code> type.
         */
        public T keepAlive(String keepAlive) {
            this.properties.put("keepAlive", keepAlive);
            return (T) this;
        }
        /**
         * The local InetAddress and port to use. The option is a
         * <code>java.net.URI</code> type.
         */
        public T localAddress(URI localAddress) {
            this.properties.put("localAddress", localAddress);
            return (T) this;
        }
        /**
         * The local InetAddress and port to use. The option will be converted
         * to a <code>java.net.URI</code> type.
         */
        public T localAddress(String localAddress) {
            this.properties.put("localAddress", localAddress);
            return (T) this;
        }
        /**
         * Sets the maximum bytes per second that this transport will receive
         * data at. This setting throttles reads so that the rate is not
         * exceeded. Defaults to 0 which disables throttling. The option is a
         * <code>int</code> type.
         */
        public T maxReadRate(int maxReadRate) {
            this.properties.put("maxReadRate", maxReadRate);
            return (T) this;
        }
        /**
         * Sets the maximum bytes per second that this transport will receive
         * data at. This setting throttles reads so that the rate is not
         * exceeded. Defaults to 0 which disables throttling. The option will be
         * converted to a <code>int</code> type.
         */
        public T maxReadRate(String maxReadRate) {
            this.properties.put("maxReadRate", maxReadRate);
            return (T) this;
        }
        /**
         * Sets the maximum bytes per second that this transport will send data
         * at. This setting throttles writes so that the rate is not exceeded.
         * Defaults to 0 which disables throttling. The option is a
         * <code>int</code> type.
         */
        public T maxWriteRate(int maxWriteRate) {
            this.properties.put("maxWriteRate", maxWriteRate);
            return (T) this;
        }
        /**
         * Sets the maximum bytes per second that this transport will send data
         * at. This setting throttles writes so that the rate is not exceeded.
         * Defaults to 0 which disables throttling. The option will be converted
         * to a <code>int</code> type.
         */
        public T maxWriteRate(String maxWriteRate) {
            this.properties.put("maxWriteRate", maxWriteRate);
            return (T) this;
        }
        /**
         * The property name to look for on an Exchange for an individual
         * published message. If this is set (one of AtMostOnce, AtLeastOnce or
         * ExactlyOnce ) - then that QoS will be set on the message sent to the
         * MQTT message broker. The option is a <code>java.lang.String</code>
         * type.
         */
        public T mqttQosPropertyName(String mqttQosPropertyName) {
            this.properties.put("mqttQosPropertyName", mqttQosPropertyName);
            return (T) this;
        }
        /**
         * The property name to look for on an Exchange for an individual
         * published message. If this is set (expects a Boolean value) - then
         * the retain property will be set on the message sent to the MQTT
         * message broker. The option is a <code>java.lang.String</code> type.
         */
        public T mqttRetainPropertyName(String mqttRetainPropertyName) {
            this.properties.put("mqttRetainPropertyName", mqttRetainPropertyName);
            return (T) this;
        }
        /**
         * These a properties that are looked for in an Exchange - to publish
         * to. The option is a <code>java.lang.String</code> type.
         */
        public T mqttTopicPropertyName(String mqttTopicPropertyName) {
            this.properties.put("mqttTopicPropertyName", mqttTopicPropertyName);
            return (T) this;
        }
        /**
         * The default Topic to publish messages on. The option is a
         * <code>java.lang.String</code> type.
         */
        public T publishTopicName(String publishTopicName) {
            this.properties.put("publishTopicName", publishTopicName);
            return (T) this;
        }
        /**
         * Quality of service level to use for topics. The option is a
         * <code>java.lang.String</code> type.
         */
        public T qualityOfService(String qualityOfService) {
            this.properties.put("qualityOfService", qualityOfService);
            return (T) this;
        }
        /**
         * Sets the size of the internal socket receive buffer. Defaults to
         * 65536 (64k). The option is a <code>int</code> type.
         */
        public T receiveBufferSize(int receiveBufferSize) {
            this.properties.put("receiveBufferSize", receiveBufferSize);
            return (T) this;
        }
        /**
         * Sets the size of the internal socket receive buffer. Defaults to
         * 65536 (64k). The option will be converted to a <code>int</code> type.
         */
        public T receiveBufferSize(String receiveBufferSize) {
            this.properties.put("receiveBufferSize", receiveBufferSize);
            return (T) this;
        }
        /**
         * The maximum number of reconnect attempts before an error is reported
         * back to the client after a server connection had previously been
         * established. Set to -1 to use unlimited attempts. Defaults to -1. The
         * option is a <code>long</code> type.
         */
        public T reconnectAttemptsMax(long reconnectAttemptsMax) {
            this.properties.put("reconnectAttemptsMax", reconnectAttemptsMax);
            return (T) this;
        }
        /**
         * The maximum number of reconnect attempts before an error is reported
         * back to the client after a server connection had previously been
         * established. Set to -1 to use unlimited attempts. Defaults to -1. The
         * option will be converted to a <code>long</code> type.
         */
        public T reconnectAttemptsMax(String reconnectAttemptsMax) {
            this.properties.put("reconnectAttemptsMax", reconnectAttemptsMax);
            return (T) this;
        }
        /**
         * The Exponential backoff be used between reconnect attempts. Set to 1
         * to disable exponential backoff. Defaults to 2. The option is a
         * <code>double</code> type.
         */
        public T reconnectBackOffMultiplier(double reconnectBackOffMultiplier) {
            this.properties.put("reconnectBackOffMultiplier", reconnectBackOffMultiplier);
            return (T) this;
        }
        /**
         * The Exponential backoff be used between reconnect attempts. Set to 1
         * to disable exponential backoff. Defaults to 2. The option will be
         * converted to a <code>double</code> type.
         */
        public T reconnectBackOffMultiplier(String reconnectBackOffMultiplier) {
            this.properties.put("reconnectBackOffMultiplier", reconnectBackOffMultiplier);
            return (T) this;
        }
        /**
         * How long to wait in ms before the first reconnect attempt. Defaults
         * to 10. The option is a <code>long</code> type.
         */
        public T reconnectDelay(long reconnectDelay) {
            this.properties.put("reconnectDelay", reconnectDelay);
            return (T) this;
        }
        /**
         * How long to wait in ms before the first reconnect attempt. Defaults
         * to 10. The option will be converted to a <code>long</code> type.
         */
        public T reconnectDelay(String reconnectDelay) {
            this.properties.put("reconnectDelay", reconnectDelay);
            return (T) this;
        }
        /**
         * The maximum amount of time in ms to wait between reconnect attempts.
         * Defaults to 30,000. The option is a <code>long</code> type.
         */
        public T reconnectDelayMax(long reconnectDelayMax) {
            this.properties.put("reconnectDelayMax", reconnectDelayMax);
            return (T) this;
        }
        /**
         * The maximum amount of time in ms to wait between reconnect attempts.
         * Defaults to 30,000. The option will be converted to a
         * <code>long</code> type.
         */
        public T reconnectDelayMax(String reconnectDelayMax) {
            this.properties.put("reconnectDelayMax", reconnectDelayMax);
            return (T) this;
        }
        /**
         * Sets the size of the internal socket send buffer. Defaults to 65536
         * (64k). The option is a <code>int</code> type.
         */
        public T sendBufferSize(int sendBufferSize) {
            this.properties.put("sendBufferSize", sendBufferSize);
            return (T) this;
        }
        /**
         * Sets the size of the internal socket send buffer. Defaults to 65536
         * (64k). The option will be converted to a <code>int</code> type.
         */
        public T sendBufferSize(String sendBufferSize) {
            this.properties.put("sendBufferSize", sendBufferSize);
            return (T) this;
        }
        /**
         * The maximum time the Component will wait for a receipt from the MQTT
         * broker to acknowledge a published message before throwing an
         * exception. The option is a <code>int</code> type.
         */
        public T sendWaitInSeconds(int sendWaitInSeconds) {
            this.properties.put("sendWaitInSeconds", sendWaitInSeconds);
            return (T) this;
        }
        /**
         * The maximum time the Component will wait for a receipt from the MQTT
         * broker to acknowledge a published message before throwing an
         * exception. The option will be converted to a <code>int</code> type.
         */
        public T sendWaitInSeconds(String sendWaitInSeconds) {
            this.properties.put("sendWaitInSeconds", sendWaitInSeconds);
            return (T) this;
        }
        /**
         * To configure security using SSLContext configuration. The option is a
         * <code>javax.net.ssl.SSLContext</code> type.
         */
        public T sslContext(Object sslContext) {
            this.properties.put("sslContext", sslContext);
            return (T) this;
        }
        /**
         * To configure security using SSLContext configuration. The option will
         * be converted to a <code>javax.net.ssl.SSLContext</code> type.
         */
        public T sslContext(String sslContext) {
            this.properties.put("sslContext", sslContext);
            return (T) this;
        }
        /**
         * These are set on the Endpoint - together with properties inherited
         * from MQTT. The option is a <code>java.lang.String</code> type.
         */
        @Deprecated
        public T subscribeTopicName(String subscribeTopicName) {
            this.properties.put("subscribeTopicName", subscribeTopicName);
            return (T) this;
        }
        /**
         * A comma-delimited list of Topics to subscribe to for messages. Note
         * that each item of this list can contain MQTT wildcards ( and/or #),
         * in order to subscribe to topics matching a certain pattern within a
         * hierarchy. For example, is a wildcard for all topics at a level
         * within the hierarchy, so if a broker has topics topics/one and
         * topics/two, then topics/ can be used to subscribe to both. A caveat
         * to consider here is that if the broker adds topics/three, the route
         * would also begin to receive messages from that topic. The option is a
         * <code>java.lang.String</code> type.
         */
        public T subscribeTopicNames(String subscribeTopicNames) {
            this.properties.put("subscribeTopicNames", subscribeTopicNames);
            return (T) this;
        }
        /**
         * Sets traffic class or type-of-service octet in the IP header for
         * packets sent from the transport. Defaults to 8 which means the
         * traffic should be optimized for throughput. The option is a
         * <code>int</code> type.
         */
        public T trafficClass(int trafficClass) {
            this.properties.put("trafficClass", trafficClass);
            return (T) this;
        }
        /**
         * Sets traffic class or type-of-service octet in the IP header for
         * packets sent from the transport. Defaults to 8 which means the
         * traffic should be optimized for throughput. The option will be
         * converted to a <code>int</code> type.
         */
        public T trafficClass(String trafficClass) {
            this.properties.put("trafficClass", trafficClass);
            return (T) this;
        }
        /**
         * Set to 3.1.1 to use MQTT version 3.1.1. Otherwise defaults to the 3.1
         * protocol version. The option is a <code>java.lang.String</code> type.
         */
        public T version(String version) {
            this.properties.put("version", version);
            return (T) this;
        }
        /**
         * The Will message to send. Defaults to a zero length message. The
         * option is a <code>java.lang.String</code> type.
         */
        public T willMessage(String willMessage) {
            this.properties.put("willMessage", willMessage);
            return (T) this;
        }
        /**
         * Sets the quality of service to use for the Will message. Defaults to
         * AT_MOST_ONCE. The option is a
         * <code>org.fusesource.mqtt.client.QoS</code> type.
         */
        public T willQos(QoS willQos) {
            this.properties.put("willQos", willQos);
            return (T) this;
        }
        /**
         * Sets the quality of service to use for the Will message. Defaults to
         * AT_MOST_ONCE. The option will be converted to a
         * <code>org.fusesource.mqtt.client.QoS</code> type.
         */
        public T willQos(String willQos) {
            this.properties.put("willQos", willQos);
            return (T) this;
        }
        /**
         * Set to true if you want the Will to be published with the retain
         * option. The option is a <code>org.fusesource.mqtt.client.QoS</code>
         * type.
         */
        public T willRetain(QoS willRetain) {
            this.properties.put("willRetain", willRetain);
            return (T) this;
        }
        /**
         * Set to true if you want the Will to be published with the retain
         * option. The option will be converted to a
         * <code>org.fusesource.mqtt.client.QoS</code> type.
         */
        public T willRetain(String willRetain) {
            this.properties.put("willRetain", willRetain);
            return (T) this;
        }
        /**
         * If set the server will publish the client's Will message to the
         * specified topics if the client has an unexpected disconnection. The
         * option is a <code>java.lang.String</code> type.
         */
        public T willTopic(String willTopic) {
            this.properties.put("willTopic", willTopic);
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

    public static class MQTTConsumerBuilder
            extends
                MQTTCommonBuilder<MQTTConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public MQTTConsumerBuilder(String path) {
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
        public MQTTConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (MQTTConsumerBuilder) this;
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
        public MQTTConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (MQTTConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public MQTTConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (MQTTConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public MQTTConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (MQTTConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public MQTTConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (MQTTConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public MQTTConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (MQTTConsumerBuilder) this;
        }
    }

    public static class MQTTProducerBuilder
            extends
                MQTTCommonBuilder<MQTTProducerBuilder>
            implements
                EndpointProducerBuilder {
        public MQTTProducerBuilder(String path) {
            super(path);
        }
        /**
         * Sessions can be lazily created to avoid exceptions, if the remote
         * server is not up and running when the Camel producer is started. The
         * option is a <code>boolean</code> type.
         */
        public MQTTProducerBuilder lazySessionCreation(
                boolean lazySessionCreation) {
            this.properties.put("lazySessionCreation", lazySessionCreation);
            return (MQTTProducerBuilder) this;
        }
        /**
         * Sessions can be lazily created to avoid exceptions, if the remote
         * server is not up and running when the Camel producer is started. The
         * option will be converted to a <code>boolean</code> type.
         */
        public MQTTProducerBuilder lazySessionCreation(
                String lazySessionCreation) {
            this.properties.put("lazySessionCreation", lazySessionCreation);
            return (MQTTProducerBuilder) this;
        }
    }

    public static enum QoS {
        AT_MOST_ONCE, AT_LEAST_ONCE, EXACTLY_ONCE;
    }
    public default MQTTConsumerBuilder fromMQTT(String path) {
        return new MQTTConsumerBuilder(path);
    }
    public default MQTTProducerBuilder toMQTT(String path) {
        return new MQTTProducerBuilder(path);
    }
}