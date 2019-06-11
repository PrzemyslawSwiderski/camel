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
 * The solr component allows you to interface with an Apache Lucene Solr server.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SolrEndpointBuilder {


    public static class SolrCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        SolrCommonBuilder(String path) {
            super("solr", path);
        }
        /**
         * Hostname and port for the solr server. The option is a
         * <code>java.lang.String</code> type.
         */
        public T url(String url) {
            this.properties.put("url", url);
            return (T) this;
        }
        /**
         * Server side must support gzip or deflate for this to have any effect.
         * The option is a <code>java.lang.Boolean</code> type.
         */
        public T allowCompression(Boolean allowCompression) {
            this.properties.put("allowCompression", allowCompression);
            return (T) this;
        }
        /**
         * Server side must support gzip or deflate for this to have any effect.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         */
        public T allowCompression(String allowCompression) {
            this.properties.put("allowCompression", allowCompression);
            return (T) this;
        }
        /**
         * connectionTimeout on the underlying HttpConnectionManager. The option
         * is a <code>java.lang.Integer</code> type.
         */
        public T connectionTimeout(Integer connectionTimeout) {
            this.properties.put("connectionTimeout", connectionTimeout);
            return (T) this;
        }
        /**
         * connectionTimeout on the underlying HttpConnectionManager. The option
         * will be converted to a <code>java.lang.Integer</code> type.
         */
        public T connectionTimeout(String connectionTimeout) {
            this.properties.put("connectionTimeout", connectionTimeout);
            return (T) this;
        }
        /**
         * maxConnectionsPerHost on the underlying HttpConnectionManager. The
         * option is a <code>java.lang.Integer</code> type.
         */
        public T defaultMaxConnectionsPerHost(
                Integer defaultMaxConnectionsPerHost) {
            this.properties.put("defaultMaxConnectionsPerHost", defaultMaxConnectionsPerHost);
            return (T) this;
        }
        /**
         * maxConnectionsPerHost on the underlying HttpConnectionManager. The
         * option will be converted to a <code>java.lang.Integer</code> type.
         */
        public T defaultMaxConnectionsPerHost(
                String defaultMaxConnectionsPerHost) {
            this.properties.put("defaultMaxConnectionsPerHost", defaultMaxConnectionsPerHost);
            return (T) this;
        }
        /**
         * indicates whether redirects are used to get to the Solr server. The
         * option is a <code>java.lang.Boolean</code> type.
         */
        public T followRedirects(Boolean followRedirects) {
            this.properties.put("followRedirects", followRedirects);
            return (T) this;
        }
        /**
         * indicates whether redirects are used to get to the Solr server. The
         * option will be converted to a <code>java.lang.Boolean</code> type.
         */
        public T followRedirects(String followRedirects) {
            this.properties.put("followRedirects", followRedirects);
            return (T) this;
        }
        /**
         * Maximum number of retries to attempt in the event of transient
         * errors. The option is a <code>java.lang.Integer</code> type.
         */
        public T maxRetries(Integer maxRetries) {
            this.properties.put("maxRetries", maxRetries);
            return (T) this;
        }
        /**
         * Maximum number of retries to attempt in the event of transient
         * errors. The option will be converted to a
         * <code>java.lang.Integer</code> type.
         */
        public T maxRetries(String maxRetries) {
            this.properties.put("maxRetries", maxRetries);
            return (T) this;
        }
        /**
         * maxTotalConnection on the underlying HttpConnectionManager. The
         * option is a <code>java.lang.Integer</code> type.
         */
        public T maxTotalConnections(Integer maxTotalConnections) {
            this.properties.put("maxTotalConnections", maxTotalConnections);
            return (T) this;
        }
        /**
         * maxTotalConnection on the underlying HttpConnectionManager. The
         * option will be converted to a <code>java.lang.Integer</code> type.
         */
        public T maxTotalConnections(String maxTotalConnections) {
            this.properties.put("maxTotalConnections", maxTotalConnections);
            return (T) this;
        }
        /**
         * Set the request handler to be used. The option is a
         * <code>java.lang.String</code> type.
         */
        public T requestHandler(String requestHandler) {
            this.properties.put("requestHandler", requestHandler);
            return (T) this;
        }
        /**
         * Read timeout on the underlying HttpConnectionManager. This is
         * desirable for queries, but probably not for indexing. The option is a
         * <code>java.lang.Integer</code> type.
         */
        public T soTimeout(Integer soTimeout) {
            this.properties.put("soTimeout", soTimeout);
            return (T) this;
        }
        /**
         * Read timeout on the underlying HttpConnectionManager. This is
         * desirable for queries, but probably not for indexing. The option will
         * be converted to a <code>java.lang.Integer</code> type.
         */
        public T soTimeout(String soTimeout) {
            this.properties.put("soTimeout", soTimeout);
            return (T) this;
        }
        /**
         * Set the queue size for the StreamingUpdateSolrServer. The option is a
         * <code>int</code> type.
         */
        public T streamingQueueSize(int streamingQueueSize) {
            this.properties.put("streamingQueueSize", streamingQueueSize);
            return (T) this;
        }
        /**
         * Set the queue size for the StreamingUpdateSolrServer. The option will
         * be converted to a <code>int</code> type.
         */
        public T streamingQueueSize(String streamingQueueSize) {
            this.properties.put("streamingQueueSize", streamingQueueSize);
            return (T) this;
        }
        /**
         * Set the number of threads for the StreamingUpdateSolrServer. The
         * option is a <code>int</code> type.
         */
        public T streamingThreadCount(int streamingThreadCount) {
            this.properties.put("streamingThreadCount", streamingThreadCount);
            return (T) this;
        }
        /**
         * Set the number of threads for the StreamingUpdateSolrServer. The
         * option will be converted to a <code>int</code> type.
         */
        public T streamingThreadCount(String streamingThreadCount) {
            this.properties.put("streamingThreadCount", streamingThreadCount);
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
         * Set the collection name which the solrCloud server could use. The
         * option is a <code>java.lang.String</code> type.
         */
        public T collection(String collection) {
            this.properties.put("collection", collection);
            return (T) this;
        }
        /**
         * Set the ZooKeeper host information which the solrCloud could use,
         * such as zkhost=localhost:8123. The option is a
         * <code>java.lang.String</code> type.
         */
        public T zkHost(String zkHost) {
            this.properties.put("zkHost", zkHost);
            return (T) this;
        }
    }

    public static class SolrProducerBuilder
            extends
                SolrCommonBuilder<SolrProducerBuilder>
            implements
                EndpointProducerBuilder {
        public SolrProducerBuilder(String path) {
            super(path);
        }
    }
    public default SolrProducerBuilder toSolr(String path) {
        return new SolrProducerBuilder(path);
    }
}