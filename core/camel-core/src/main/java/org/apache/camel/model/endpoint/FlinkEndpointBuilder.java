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
 * The flink component can be used to send DataSet jobs to Apache Flink cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FlinkEndpointBuilder {


    public static class FlinkCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        FlinkCommonBuilder(String path) {
            super("flink", path);
        }
        /**
         * Type of the endpoint (dataset, datastream). The option is a
         * <code>org.apache.camel.component.flink.EndpointType</code> type.
         */
        public T endpointType(EndpointType endpointType) {
            this.properties.put("endpointType", endpointType);
            return (T) this;
        }
        /**
         * Type of the endpoint (dataset, datastream). The option will be
         * converted to a
         * <code>org.apache.camel.component.flink.EndpointType</code> type.
         */
        public T endpointType(String endpointType) {
            this.properties.put("endpointType", endpointType);
            return (T) this;
        }
        /**
         * Indicates if results should be collected or counted. The option is a
         * <code>boolean</code> type.
         */
        public T collect(boolean collect) {
            this.properties.put("collect", collect);
            return (T) this;
        }
        /**
         * Indicates if results should be collected or counted. The option will
         * be converted to a <code>boolean</code> type.
         */
        public T collect(String collect) {
            this.properties.put("collect", collect);
            return (T) this;
        }
        /**
         * DataSet to compute against. The option is a
         * <code>org.apache.flink.api.java.DataSet</code> type.
         */
        public T dataSet(Object dataSet) {
            this.properties.put("dataSet", dataSet);
            return (T) this;
        }
        /**
         * DataSet to compute against. The option will be converted to a
         * <code>org.apache.flink.api.java.DataSet</code> type.
         */
        public T dataSet(String dataSet) {
            this.properties.put("dataSet", dataSet);
            return (T) this;
        }
        /**
         * Function performing action against a DataSet. The option is a
         * <code>org.apache.camel.component.flink.DataSetCallback</code> type.
         */
        public T dataSetCallback(Object dataSetCallback) {
            this.properties.put("dataSetCallback", dataSetCallback);
            return (T) this;
        }
        /**
         * Function performing action against a DataSet. The option will be
         * converted to a
         * <code>org.apache.camel.component.flink.DataSetCallback</code> type.
         */
        public T dataSetCallback(String dataSetCallback) {
            this.properties.put("dataSetCallback", dataSetCallback);
            return (T) this;
        }
        /**
         * DataStream to compute against. The option is a
         * <code>org.apache.flink.streaming.api.datastream.DataStream</code>
         * type.
         */
        public T dataStream(Object dataStream) {
            this.properties.put("dataStream", dataStream);
            return (T) this;
        }
        /**
         * DataStream to compute against. The option will be converted to a
         * <code>org.apache.flink.streaming.api.datastream.DataStream</code>
         * type.
         */
        public T dataStream(String dataStream) {
            this.properties.put("dataStream", dataStream);
            return (T) this;
        }
        /**
         * Function performing action against a DataStream. The option is a
         * <code>org.apache.camel.component.flink.DataStreamCallback</code>
         * type.
         */
        public T dataStreamCallback(Object dataStreamCallback) {
            this.properties.put("dataStreamCallback", dataStreamCallback);
            return (T) this;
        }
        /**
         * Function performing action against a DataStream. The option will be
         * converted to a
         * <code>org.apache.camel.component.flink.DataStreamCallback</code>
         * type.
         */
        public T dataStreamCallback(String dataStreamCallback) {
            this.properties.put("dataStreamCallback", dataStreamCallback);
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

    public static class FlinkProducerBuilder
            extends
                FlinkCommonBuilder<FlinkProducerBuilder>
            implements
                EndpointProducerBuilder {
        public FlinkProducerBuilder(String path) {
            super(path);
        }
    }

    public static enum EndpointType {
        dataset, datastream;
    }
    public default FlinkProducerBuilder toFlink(String path) {
        return new FlinkProducerBuilder(path);
    }
}