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
 * The camel Endpoint to access Hazelcast distributed set.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HazelcastSetEndpointBuilder {


    public static class HazelcastSetCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        HazelcastSetCommonBuilder(String path) {
            super("hazelcast-set", path);
        }
        /**
         * The name of the cache. The option is a <code>java.lang.String</code>
         * type.
         */
        public T cacheName(String cacheName) {
            this.properties.put("cacheName", cacheName);
            return (T) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided. The option is a
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         */
        public T defaultOperation(HazelcastOperation defaultOperation) {
            this.properties.put("defaultOperation", defaultOperation);
            return (T) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided. The option will be converted to a
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         */
        public T defaultOperation(String defaultOperation) {
            this.properties.put("defaultOperation", defaultOperation);
            return (T) this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint. The option is a
         * <code>com.hazelcast.core.HazelcastInstance</code> type.
         */
        public T hazelcastInstance(Object hazelcastInstance) {
            this.properties.put("hazelcastInstance", hazelcastInstance);
            return (T) this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint. The option will be converted to a
         * <code>com.hazelcast.core.HazelcastInstance</code> type.
         */
        public T hazelcastInstance(String hazelcastInstance) {
            this.properties.put("hazelcastInstance", hazelcastInstance);
            return (T) this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance. The
         * option is a <code>java.lang.String</code> type.
         */
        public T hazelcastInstanceName(String hazelcastInstanceName) {
            this.properties.put("hazelcastInstanceName", hazelcastInstanceName);
            return (T) this;
        }
        /**
         * Define if the endpoint will use a reliable Topic struct or not. The
         * option is a <code>boolean</code> type.
         */
        public T reliable(boolean reliable) {
            this.properties.put("reliable", reliable);
            return (T) this;
        }
        /**
         * Define if the endpoint will use a reliable Topic struct or not. The
         * option will be converted to a <code>boolean</code> type.
         */
        public T reliable(String reliable) {
            this.properties.put("reliable", reliable);
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
        /**
         * To use concurrent consumers polling from the SEDA queue. The option
         * is a <code>int</code> type.
         */
        public T concurrentConsumers(int concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (T) this;
        }
        /**
         * To use concurrent consumers polling from the SEDA queue. The option
         * will be converted to a <code>int</code> type.
         */
        public T concurrentConsumers(String concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (T) this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred. The option is a <code>int</code> type.
         */
        public T onErrorDelay(int onErrorDelay) {
            this.properties.put("onErrorDelay", onErrorDelay);
            return (T) this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred. The option will be converted to a <code>int</code> type.
         */
        public T onErrorDelay(String onErrorDelay) {
            this.properties.put("onErrorDelay", onErrorDelay);
            return (T) this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown. The option is a <code>int</code> type.
         */
        public T pollTimeout(int pollTimeout) {
            this.properties.put("pollTimeout", pollTimeout);
            return (T) this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown. The option will be converted to a
         * <code>int</code> type.
         */
        public T pollTimeout(String pollTimeout) {
            this.properties.put("pollTimeout", pollTimeout);
            return (T) this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete. The option is
         * a <code>boolean</code> type.
         */
        public T transacted(boolean transacted) {
            this.properties.put("transacted", transacted);
            return (T) this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete. The option
         * will be converted to a <code>boolean</code> type.
         */
        public T transacted(String transacted) {
            this.properties.put("transacted", transacted);
            return (T) this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped. The
         * option is a <code>boolean</code> type.
         */
        public T transferExchange(boolean transferExchange) {
            this.properties.put("transferExchange", transferExchange);
            return (T) this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped. The
         * option will be converted to a <code>boolean</code> type.
         */
        public T transferExchange(String transferExchange) {
            this.properties.put("transferExchange", transferExchange);
            return (T) this;
        }
    }

    public static class HazelcastSetConsumerBuilder
            extends
                HazelcastSetCommonBuilder<HazelcastSetConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public HazelcastSetConsumerBuilder(String path) {
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
        public HazelcastSetConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (HazelcastSetConsumerBuilder) this;
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
        public HazelcastSetConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (HazelcastSetConsumerBuilder) this;
        }
        /**
         * Define the polling timeout of the Queue consumer in Poll mode. The
         * option is a <code>long</code> type.
         */
        public HazelcastSetConsumerBuilder pollingTimeout(long pollingTimeout) {
            this.properties.put("pollingTimeout", pollingTimeout);
            return (HazelcastSetConsumerBuilder) this;
        }
        /**
         * Define the polling timeout of the Queue consumer in Poll mode. The
         * option will be converted to a <code>long</code> type.
         */
        public HazelcastSetConsumerBuilder pollingTimeout(String pollingTimeout) {
            this.properties.put("pollingTimeout", pollingTimeout);
            return (HazelcastSetConsumerBuilder) this;
        }
        /**
         * Define the Pool size for Queue Consumer Executor. The option is a
         * <code>int</code> type.
         */
        public HazelcastSetConsumerBuilder poolSize(int poolSize) {
            this.properties.put("poolSize", poolSize);
            return (HazelcastSetConsumerBuilder) this;
        }
        /**
         * Define the Pool size for Queue Consumer Executor. The option will be
         * converted to a <code>int</code> type.
         */
        public HazelcastSetConsumerBuilder poolSize(String poolSize) {
            this.properties.put("poolSize", poolSize);
            return (HazelcastSetConsumerBuilder) this;
        }
        /**
         * Define the Queue Consumer mode: Listen or Poll. The option is a
         * <code>org.apache.camel.component.hazelcast.queue.HazelcastQueueConsumerMode</code> type.
         */
        public HazelcastSetConsumerBuilder queueConsumerMode(
                HazelcastQueueConsumerMode queueConsumerMode) {
            this.properties.put("queueConsumerMode", queueConsumerMode);
            return (HazelcastSetConsumerBuilder) this;
        }
        /**
         * Define the Queue Consumer mode: Listen or Poll. The option will be
         * converted to a
         * <code>org.apache.camel.component.hazelcast.queue.HazelcastQueueConsumerMode</code> type.
         */
        public HazelcastSetConsumerBuilder queueConsumerMode(
                String queueConsumerMode) {
            this.properties.put("queueConsumerMode", queueConsumerMode);
            return (HazelcastSetConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public HazelcastSetConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (HazelcastSetConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public HazelcastSetConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (HazelcastSetConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public HazelcastSetConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (HazelcastSetConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public HazelcastSetConsumerBuilder exchangePattern(
                String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (HazelcastSetConsumerBuilder) this;
        }
    }

    public static class HazelcastSetProducerBuilder
            extends
                HazelcastSetCommonBuilder<HazelcastSetProducerBuilder>
            implements
                EndpointProducerBuilder {
        public HazelcastSetProducerBuilder(String path) {
            super(path);
        }
    }

    public static enum HazelcastOperation {
        put, delete, get, update, query, getAll, clear, putIfAbsent, allAll, removeAll, retainAll, evict, evictAll, valueCount, containsKey, containsValue, keySet, removevalue, increment, decrement, setvalue, destroy, compareAndSet, getAndAdd, add, offer, peek, poll, remainingCapacity, drainTo, removeIf, take, publish, readOnceHeal, readOnceTail, capacity;
    }

    public static enum HazelcastQueueConsumerMode {
        listen, poll;
    }
    public default HazelcastSetConsumerBuilder fromHazelcastSet(String path) {
        return new HazelcastSetConsumerBuilder(path);
    }
    public default HazelcastSetProducerBuilder toHazelcastSet(String path) {
        return new HazelcastSetProducerBuilder(path);
    }
}