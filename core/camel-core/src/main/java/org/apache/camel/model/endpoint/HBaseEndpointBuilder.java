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

import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * For reading/writing from/to an HBase store (Hadoop database).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HBaseEndpointBuilder {


    public static class HBaseCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        HBaseCommonBuilder(String path) {
            super("hbase", path);
        }
        /**
         * The name of the table. The option is a <code>java.lang.String</code>
         * type.
         */
        public T tableName(String tableName) {
            this.properties.put("tableName", tableName);
            return (T) this;
        }
        /**
         * To use a custom CellMappingStrategyFactory that is responsible for
         * mapping cells. The option is a
         * <code>org.apache.camel.component.hbase.mapping.CellMappingStrategyFactory</code> type.
         */
        public T cellMappingStrategyFactory(Object cellMappingStrategyFactory) {
            this.properties.put("cellMappingStrategyFactory", cellMappingStrategyFactory);
            return (T) this;
        }
        /**
         * To use a custom CellMappingStrategyFactory that is responsible for
         * mapping cells. The option will be converted to a
         * <code>org.apache.camel.component.hbase.mapping.CellMappingStrategyFactory</code> type.
         */
        public T cellMappingStrategyFactory(String cellMappingStrategyFactory) {
            this.properties.put("cellMappingStrategyFactory", cellMappingStrategyFactory);
            return (T) this;
        }
        /**
         * A list of filters to use. The option is a
         * <code>java.util.List<org.apache.hadoop.hbase.filter.Filter></code>
         * type.
         */
        public T filters(List<Object> filters) {
            this.properties.put("filters", filters);
            return (T) this;
        }
        /**
         * A list of filters to use. The option will be converted to a
         * <code>java.util.List<org.apache.hadoop.hbase.filter.Filter></code>
         * type.
         */
        public T filters(String filters) {
            this.properties.put("filters", filters);
            return (T) this;
        }
        /**
         * The class name of a custom mapping strategy implementation. The
         * option is a <code>java.lang.String</code> type.
         */
        public T mappingStrategyClassName(String mappingStrategyClassName) {
            this.properties.put("mappingStrategyClassName", mappingStrategyClassName);
            return (T) this;
        }
        /**
         * The strategy to use for mapping Camel messages to HBase columns.
         * Supported values: header, or body. The option is a
         * <code>java.lang.String</code> type.
         */
        public T mappingStrategyName(String mappingStrategyName) {
            this.properties.put("mappingStrategyName", mappingStrategyName);
            return (T) this;
        }
        /**
         * To map the key/values from the Map to a HBaseRow. The following keys
         * is supported: rowId - The id of the row. This has limited use as the
         * row usually changes per Exchange. rowType - The type to covert row id
         * to. Supported operations: CamelHBaseScan. family - The column family.
         * Supports a number suffix for referring to more than one columns.
         * qualifier - The column qualifier. Supports a number suffix for
         * referring to more than one columns. value - The value. Supports a
         * number suffix for referring to more than one columns valueType - The
         * value type. Supports a number suffix for referring to more than one
         * columns. Supported operations: CamelHBaseGet, and CamelHBaseScan. The
         * option is a <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         */
        public T rowMapping(Map<String, Object> rowMapping) {
            this.properties.put("rowMapping", rowMapping);
            return (T) this;
        }
        /**
         * To map the key/values from the Map to a HBaseRow. The following keys
         * is supported: rowId - The id of the row. This has limited use as the
         * row usually changes per Exchange. rowType - The type to covert row id
         * to. Supported operations: CamelHBaseScan. family - The column family.
         * Supports a number suffix for referring to more than one columns.
         * qualifier - The column qualifier. Supports a number suffix for
         * referring to more than one columns. value - The value. Supports a
         * number suffix for referring to more than one columns valueType - The
         * value type. Supports a number suffix for referring to more than one
         * columns. Supported operations: CamelHBaseGet, and CamelHBaseScan. The
         * option will be converted to a <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         */
        public T rowMapping(String rowMapping) {
            this.properties.put("rowMapping", rowMapping);
            return (T) this;
        }
        /**
         * An instance of org.apache.camel.component.hbase.model.HBaseRow which
         * describes how each row should be modeled. The option is a
         * <code>org.apache.camel.component.hbase.model.HBaseRow</code> type.
         */
        public T rowModel(Object rowModel) {
            this.properties.put("rowModel", rowModel);
            return (T) this;
        }
        /**
         * An instance of org.apache.camel.component.hbase.model.HBaseRow which
         * describes how each row should be modeled. The option will be
         * converted to a
         * <code>org.apache.camel.component.hbase.model.HBaseRow</code> type.
         */
        public T rowModel(String rowModel) {
            this.properties.put("rowModel", rowModel);
            return (T) this;
        }
        /**
         * Defines privileges to communicate with HBase such as using kerberos.
         * The option is a
         * <code>org.apache.hadoop.security.UserGroupInformation</code> type.
         */
        public T userGroupInformation(Object userGroupInformation) {
            this.properties.put("userGroupInformation", userGroupInformation);
            return (T) this;
        }
        /**
         * Defines privileges to communicate with HBase such as using kerberos.
         * The option will be converted to a
         * <code>org.apache.hadoop.security.UserGroupInformation</code> type.
         */
        public T userGroupInformation(String userGroupInformation) {
            this.properties.put("userGroupInformation", userGroupInformation);
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

    public static class HBaseConsumerBuilder
            extends
                HBaseCommonBuilder<HBaseConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public HBaseConsumerBuilder(String path) {
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
        public HBaseConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (HBaseConsumerBuilder) this;
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
        public HBaseConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (HBaseConsumerBuilder) this;
        }
        /**
         * Gets the maximum number of messages as a limit to poll at each
         * polling. Is default unlimited, but use 0 or negative number to
         * disable it as unlimited. The option is a <code>int</code> type.
         */
        public HBaseConsumerBuilder maxMessagesPerPoll(int maxMessagesPerPoll) {
            this.properties.put("maxMessagesPerPoll", maxMessagesPerPoll);
            return (HBaseConsumerBuilder) this;
        }
        /**
         * Gets the maximum number of messages as a limit to poll at each
         * polling. Is default unlimited, but use 0 or negative number to
         * disable it as unlimited. The option will be converted to a
         * <code>int</code> type.
         */
        public HBaseConsumerBuilder maxMessagesPerPoll(String maxMessagesPerPoll) {
            this.properties.put("maxMessagesPerPoll", maxMessagesPerPoll);
            return (HBaseConsumerBuilder) this;
        }
        /**
         * The HBase operation to perform. The option is a
         * <code>java.lang.String</code> type.
         */
        public HBaseConsumerBuilder operation(String operation) {
            this.properties.put("operation", operation);
            return (HBaseConsumerBuilder) this;
        }
        /**
         * If the option is true, Camel HBase Consumer will remove the rows
         * which it processes. The option is a <code>boolean</code> type.
         */
        public HBaseConsumerBuilder remove(boolean remove) {
            this.properties.put("remove", remove);
            return (HBaseConsumerBuilder) this;
        }
        /**
         * If the option is true, Camel HBase Consumer will remove the rows
         * which it processes. The option will be converted to a
         * <code>boolean</code> type.
         */
        public HBaseConsumerBuilder remove(String remove) {
            this.properties.put("remove", remove);
            return (HBaseConsumerBuilder) this;
        }
        /**
         * To use a custom HBaseRemoveHandler that is executed when a row is to
         * be removed. The option is a
         * <code>org.apache.camel.component.hbase.HBaseRemoveHandler</code>
         * type.
         */
        public HBaseConsumerBuilder removeHandler(Object removeHandler) {
            this.properties.put("removeHandler", removeHandler);
            return (HBaseConsumerBuilder) this;
        }
        /**
         * To use a custom HBaseRemoveHandler that is executed when a row is to
         * be removed. The option will be converted to a
         * <code>org.apache.camel.component.hbase.HBaseRemoveHandler</code>
         * type.
         */
        public HBaseConsumerBuilder removeHandler(String removeHandler) {
            this.properties.put("removeHandler", removeHandler);
            return (HBaseConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public HBaseConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (HBaseConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public HBaseConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (HBaseConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public HBaseConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (HBaseConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public HBaseConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (HBaseConsumerBuilder) this;
        }
    }

    public static class HBaseProducerBuilder
            extends
                HBaseCommonBuilder<HBaseProducerBuilder>
            implements
                EndpointProducerBuilder {
        public HBaseProducerBuilder(String path) {
            super(path);
        }
        /**
         * The maximum number of rows to scan. The option is a <code>int</code>
         * type.
         */
        public HBaseProducerBuilder maxResults(int maxResults) {
            this.properties.put("maxResults", maxResults);
            return (HBaseProducerBuilder) this;
        }
        /**
         * The maximum number of rows to scan. The option will be converted to a
         * <code>int</code> type.
         */
        public HBaseProducerBuilder maxResults(String maxResults) {
            this.properties.put("maxResults", maxResults);
            return (HBaseProducerBuilder) this;
        }
    }
    public default HBaseConsumerBuilder fromHBase(String path) {
        return new HBaseConsumerBuilder(path);
    }
    public default HBaseProducerBuilder toHBase(String path) {
        return new HBaseProducerBuilder(path);
    }
}