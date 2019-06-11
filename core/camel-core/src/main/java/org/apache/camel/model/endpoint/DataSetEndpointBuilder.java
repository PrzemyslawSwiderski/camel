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
 * The dataset component provides a mechanism to easily perform load & soak
 * testing of your system.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DataSetEndpointBuilder {


    public static class DataSetCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        DataSetCommonBuilder(String path) {
            super("dataset", path);
        }
        /**
         * Name of DataSet to lookup in the registry. The option is a
         * <code>org.apache.camel.component.dataset.DataSet</code> type.
         */
        public T name(Object name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * Name of DataSet to lookup in the registry. The option will be
         * converted to a
         * <code>org.apache.camel.component.dataset.DataSet</code> type.
         */
        public T name(String name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * Controls the behaviour of the CamelDataSetIndex header. For
         * Consumers: - off = the header will not be set - strict/lenient = the
         * header will be set For Producers: - off = the header value will not
         * be verified, and will not be set if it is not present = strict = the
         * header value must be present and will be verified = lenient = the
         * header value will be verified if it is present, and will be set if it
         * is not present. The option is a <code>java.lang.String</code> type.
         */
        public T dataSetIndex(String dataSetIndex) {
            this.properties.put("dataSetIndex", dataSetIndex);
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

    public static class DataSetConsumerBuilder
            extends
                DataSetCommonBuilder<DataSetConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public DataSetConsumerBuilder(String path) {
            super(path);
        }
        /**
         * Time period in millis to wait before starting sending messages. The
         * option is a <code>long</code> type.
         */
        public DataSetConsumerBuilder initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (DataSetConsumerBuilder) this;
        }
        /**
         * Time period in millis to wait before starting sending messages. The
         * option will be converted to a <code>long</code> type.
         */
        public DataSetConsumerBuilder initialDelay(String initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (DataSetConsumerBuilder) this;
        }
        /**
         * Wait until the DataSet contains at least this number of messages. The
         * option is a <code>int</code> type.
         */
        public DataSetConsumerBuilder minRate(int minRate) {
            this.properties.put("minRate", minRate);
            return (DataSetConsumerBuilder) this;
        }
        /**
         * Wait until the DataSet contains at least this number of messages. The
         * option will be converted to a <code>int</code> type.
         */
        public DataSetConsumerBuilder minRate(String minRate) {
            this.properties.put("minRate", minRate);
            return (DataSetConsumerBuilder) this;
        }
        /**
         * Sets how many messages should be preloaded (sent) before the route
         * completes its initialization. The option is a <code>long</code> type.
         */
        public DataSetConsumerBuilder preloadSize(long preloadSize) {
            this.properties.put("preloadSize", preloadSize);
            return (DataSetConsumerBuilder) this;
        }
        /**
         * Sets how many messages should be preloaded (sent) before the route
         * completes its initialization. The option will be converted to a
         * <code>long</code> type.
         */
        public DataSetConsumerBuilder preloadSize(String preloadSize) {
            this.properties.put("preloadSize", preloadSize);
            return (DataSetConsumerBuilder) this;
        }
        /**
         * Allows a delay to be specified which causes a delay when a message is
         * sent by the consumer (to simulate slow processing). The option is a
         * <code>long</code> type.
         */
        public DataSetConsumerBuilder produceDelay(long produceDelay) {
            this.properties.put("produceDelay", produceDelay);
            return (DataSetConsumerBuilder) this;
        }
        /**
         * Allows a delay to be specified which causes a delay when a message is
         * sent by the consumer (to simulate slow processing). The option will
         * be converted to a <code>long</code> type.
         */
        public DataSetConsumerBuilder produceDelay(String produceDelay) {
            this.properties.put("produceDelay", produceDelay);
            return (DataSetConsumerBuilder) this;
        }
    }

    public static class DataSetProducerBuilder
            extends
                DataSetCommonBuilder<DataSetProducerBuilder>
            implements
                EndpointProducerBuilder {
        public DataSetProducerBuilder(String path) {
            super(path);
        }
        /**
         * Allows a delay to be specified which causes a delay when a message is
         * consumed by the producer (to simulate slow processing). The option is
         * a <code>long</code> type.
         */
        public DataSetProducerBuilder consumeDelay(long consumeDelay) {
            this.properties.put("consumeDelay", consumeDelay);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Allows a delay to be specified which causes a delay when a message is
         * consumed by the producer (to simulate slow processing). The option
         * will be converted to a <code>long</code> type.
         */
        public DataSetProducerBuilder consumeDelay(String consumeDelay) {
            this.properties.put("consumeDelay", consumeDelay);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Sets a grace period after which the mock endpoint will re-assert to
         * ensure the preliminary assertion is still valid. This is used for
         * example to assert that exactly a number of messages arrives. For
         * example if expectedMessageCount(int) was set to 5, then the assertion
         * is satisfied when 5 or more message arrives. To ensure that exactly 5
         * messages arrives, then you would need to wait a little period to
         * ensure no further message arrives. This is what you can use this
         * method for. By default this period is disabled. The option is a
         * <code>long</code> type.
         */
        public DataSetProducerBuilder assertPeriod(long assertPeriod) {
            this.properties.put("assertPeriod", assertPeriod);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Sets a grace period after which the mock endpoint will re-assert to
         * ensure the preliminary assertion is still valid. This is used for
         * example to assert that exactly a number of messages arrives. For
         * example if expectedMessageCount(int) was set to 5, then the assertion
         * is satisfied when 5 or more message arrives. To ensure that exactly 5
         * messages arrives, then you would need to wait a little period to
         * ensure no further message arrives. This is what you can use this
         * method for. By default this period is disabled. The option will be
         * converted to a <code>long</code> type.
         */
        public DataSetProducerBuilder assertPeriod(String assertPeriod) {
            this.properties.put("assertPeriod", assertPeriod);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Specifies the expected number of message exchanges that should be
         * received by this endpoint. Beware: If you want to expect that 0
         * messages, then take extra care, as 0 matches when the tests starts,
         * so you need to set a assert period time to let the test run for a
         * while to make sure there are still no messages arrived; for that use
         * setAssertPeriod(long). An alternative is to use NotifyBuilder, and
         * use the notifier to know when Camel is done routing some messages,
         * before you call the assertIsSatisfied() method on the mocks. This
         * allows you to not use a fixed assert period, to speedup testing
         * times. If you want to assert that exactly n'th message arrives to
         * this mock endpoint, then see also the setAssertPeriod(long) method
         * for further details. The option is a <code>int</code> type.
         */
        public DataSetProducerBuilder expectedCount(int expectedCount) {
            this.properties.put("expectedCount", expectedCount);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Specifies the expected number of message exchanges that should be
         * received by this endpoint. Beware: If you want to expect that 0
         * messages, then take extra care, as 0 matches when the tests starts,
         * so you need to set a assert period time to let the test run for a
         * while to make sure there are still no messages arrived; for that use
         * setAssertPeriod(long). An alternative is to use NotifyBuilder, and
         * use the notifier to know when Camel is done routing some messages,
         * before you call the assertIsSatisfied() method on the mocks. This
         * allows you to not use a fixed assert period, to speedup testing
         * times. If you want to assert that exactly n'th message arrives to
         * this mock endpoint, then see also the setAssertPeriod(long) method
         * for further details. The option will be converted to a
         * <code>int</code> type.
         */
        public DataSetProducerBuilder expectedCount(String expectedCount) {
            this.properties.put("expectedCount", expectedCount);
            return (DataSetProducerBuilder) this;
        }
        /**
         * A number that is used to turn on throughput logging based on groups
         * of the size. The option is a <code>int</code> type.
         */
        public DataSetProducerBuilder reportGroup(int reportGroup) {
            this.properties.put("reportGroup", reportGroup);
            return (DataSetProducerBuilder) this;
        }
        /**
         * A number that is used to turn on throughput logging based on groups
         * of the size. The option will be converted to a <code>int</code> type.
         */
        public DataSetProducerBuilder reportGroup(String reportGroup) {
            this.properties.put("reportGroup", reportGroup);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Sets the minimum expected amount of time (in millis) the
         * assertIsSatisfied() will wait on a latch until it is satisfied. The
         * option is a <code>long</code> type.
         */
        public DataSetProducerBuilder resultMinimumWaitTime(
                long resultMinimumWaitTime) {
            this.properties.put("resultMinimumWaitTime", resultMinimumWaitTime);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Sets the minimum expected amount of time (in millis) the
         * assertIsSatisfied() will wait on a latch until it is satisfied. The
         * option will be converted to a <code>long</code> type.
         */
        public DataSetProducerBuilder resultMinimumWaitTime(
                String resultMinimumWaitTime) {
            this.properties.put("resultMinimumWaitTime", resultMinimumWaitTime);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Sets the maximum amount of time (in millis) the assertIsSatisfied()
         * will wait on a latch until it is satisfied. The option is a
         * <code>long</code> type.
         */
        public DataSetProducerBuilder resultWaitTime(long resultWaitTime) {
            this.properties.put("resultWaitTime", resultWaitTime);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Sets the maximum amount of time (in millis) the assertIsSatisfied()
         * will wait on a latch until it is satisfied. The option will be
         * converted to a <code>long</code> type.
         */
        public DataSetProducerBuilder resultWaitTime(String resultWaitTime) {
            this.properties.put("resultWaitTime", resultWaitTime);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Specifies to only retain the first n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the first 10 Exchanges, then the getReceivedCounter()
         * will still return 5000 but there is only the first 10 Exchanges in
         * the getExchanges() and getReceivedExchanges() methods. When using
         * this method, then some of the other expectation methods is not
         * supported, for example the expectedBodiesReceived(Object...) sets a
         * expectation on the first number of bodies received. You can configure
         * both setRetainFirst(int) and setRetainLast(int) methods, to limit
         * both the first and last received. The option is a <code>int</code>
         * type.
         */
        public DataSetProducerBuilder retainFirst(int retainFirst) {
            this.properties.put("retainFirst", retainFirst);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Specifies to only retain the first n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the first 10 Exchanges, then the getReceivedCounter()
         * will still return 5000 but there is only the first 10 Exchanges in
         * the getExchanges() and getReceivedExchanges() methods. When using
         * this method, then some of the other expectation methods is not
         * supported, for example the expectedBodiesReceived(Object...) sets a
         * expectation on the first number of bodies received. You can configure
         * both setRetainFirst(int) and setRetainLast(int) methods, to limit
         * both the first and last received. The option will be converted to a
         * <code>int</code> type.
         */
        public DataSetProducerBuilder retainFirst(String retainFirst) {
            this.properties.put("retainFirst", retainFirst);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Specifies to only retain the last n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the last 20 Exchanges, then the getReceivedCounter() will
         * still return 5000 but there is only the last 20 Exchanges in the
         * getExchanges() and getReceivedExchanges() methods. When using this
         * method, then some of the other expectation methods is not supported,
         * for example the expectedBodiesReceived(Object...) sets a expectation
         * on the first number of bodies received. You can configure both
         * setRetainFirst(int) and setRetainLast(int) methods, to limit both the
         * first and last received. The option is a <code>int</code> type.
         */
        public DataSetProducerBuilder retainLast(int retainLast) {
            this.properties.put("retainLast", retainLast);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Specifies to only retain the last n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the last 20 Exchanges, then the getReceivedCounter() will
         * still return 5000 but there is only the last 20 Exchanges in the
         * getExchanges() and getReceivedExchanges() methods. When using this
         * method, then some of the other expectation methods is not supported,
         * for example the expectedBodiesReceived(Object...) sets a expectation
         * on the first number of bodies received. You can configure both
         * setRetainFirst(int) and setRetainLast(int) methods, to limit both the
         * first and last received. The option will be converted to a
         * <code>int</code> type.
         */
        public DataSetProducerBuilder retainLast(String retainLast) {
            this.properties.put("retainLast", retainLast);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Allows a sleep to be specified to wait to check that this endpoint
         * really is empty when expectedMessageCount(int) is called with zero.
         * The option is a <code>long</code> type.
         */
        public DataSetProducerBuilder sleepForEmptyTest(long sleepForEmptyTest) {
            this.properties.put("sleepForEmptyTest", sleepForEmptyTest);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Allows a sleep to be specified to wait to check that this endpoint
         * really is empty when expectedMessageCount(int) is called with zero.
         * The option will be converted to a <code>long</code> type.
         */
        public DataSetProducerBuilder sleepForEmptyTest(String sleepForEmptyTest) {
            this.properties.put("sleepForEmptyTest", sleepForEmptyTest);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Sets whether to make a deep copy of the incoming Exchange when
         * received at this mock endpoint. Is by default true. The option is a
         * <code>boolean</code> type.
         */
        public DataSetProducerBuilder copyOnExchange(boolean copyOnExchange) {
            this.properties.put("copyOnExchange", copyOnExchange);
            return (DataSetProducerBuilder) this;
        }
        /**
         * Sets whether to make a deep copy of the incoming Exchange when
         * received at this mock endpoint. Is by default true. The option will
         * be converted to a <code>boolean</code> type.
         */
        public DataSetProducerBuilder copyOnExchange(String copyOnExchange) {
            this.properties.put("copyOnExchange", copyOnExchange);
            return (DataSetProducerBuilder) this;
        }
    }
    public default DataSetConsumerBuilder fromDataSet(String path) {
        return new DataSetConsumerBuilder(path);
    }
    public default DataSetProducerBuilder toDataSet(String path) {
        return new DataSetProducerBuilder(path);
    }
}