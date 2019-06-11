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
 * To collect various metrics directly from Camel routes using the Micrometer
 * library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MicrometerEndpointBuilder {


    public static class MicrometerCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        MicrometerCommonBuilder(String path) {
            super("micrometer", path);
        }
        /**
         * Type of metrics. The option is a
         * <code>io.micrometer.core.instrument.Meter$Type</code> type.
         */
        public T metricsType(Type metricsType) {
            this.properties.put("metricsType", metricsType);
            return (T) this;
        }
        /**
         * Type of metrics. The option will be converted to a
         * <code>io.micrometer.core.instrument.Meter$Type</code> type.
         */
        public T metricsType(String metricsType) {
            this.properties.put("metricsType", metricsType);
            return (T) this;
        }
        /**
         * Name of metrics. The option is a <code>java.lang.String</code> type.
         */
        public T metricsName(String metricsName) {
            this.properties.put("metricsName", metricsName);
            return (T) this;
        }
        /**
         * Tags of metrics. The option is a
         * <code>java.lang.Iterable<io.micrometer.core.instrument.Tag></code>
         * type.
         */
        public T tags(Iterable<Object> tags) {
            this.properties.put("tags", tags);
            return (T) this;
        }
        /**
         * Tags of metrics. The option will be converted to a
         * <code>java.lang.Iterable<io.micrometer.core.instrument.Tag></code>
         * type.
         */
        public T tags(String tags) {
            this.properties.put("tags", tags);
            return (T) this;
        }
        /**
         * Action expression when using timer type. The option is a
         * <code>java.lang.String</code> type.
         */
        public T action(String action) {
            this.properties.put("action", action);
            return (T) this;
        }
        /**
         * Decrement value expression when using counter type. The option is a
         * <code>java.lang.String</code> type.
         */
        public T decrement(String decrement) {
            this.properties.put("decrement", decrement);
            return (T) this;
        }
        /**
         * Increment value expression when using counter type. The option is a
         * <code>java.lang.String</code> type.
         */
        public T increment(String increment) {
            this.properties.put("increment", increment);
            return (T) this;
        }
        /**
         * Value expression when using histogram type. The option is a
         * <code>java.lang.String</code> type.
         */
        public T value(String value) {
            this.properties.put("value", value);
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

    public static class MicrometerProducerBuilder
            extends
                MicrometerCommonBuilder<MicrometerProducerBuilder>
            implements
                EndpointProducerBuilder {
        public MicrometerProducerBuilder(String path) {
            super(path);
        }
    }

    public static enum Type {
        COUNTER, GAUGE, LONG_TASK_TIMER, TIMER, DISTRIBUTION_SUMMARY, OTHER;
    }
    public default MicrometerProducerBuilder toMicrometer(String path) {
        return new MicrometerProducerBuilder(path);
    }
}