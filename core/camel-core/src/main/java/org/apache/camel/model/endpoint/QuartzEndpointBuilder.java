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

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Provides a scheduled delivery of messages using the Quartz 2.x scheduler.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface QuartzEndpointBuilder {


    public static class QuartzCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        QuartzCommonBuilder(String path) {
            super("quartz2", path);
        }
        /**
         * The quartz group name to use. The combination of group name and timer
         * name should be unique. The option is a <code>java.lang.String</code>
         * type.
         */
        public T groupName(String groupName) {
            this.properties.put("groupName", groupName);
            return (T) this;
        }
        /**
         * The quartz timer name to use. The combination of group name and timer
         * name should be unique. The option is a <code>java.lang.String</code>
         * type.
         */
        public T triggerName(String triggerName) {
            this.properties.put("triggerName", triggerName);
            return (T) this;
        }
        /**
         * Specifies a cron expression to define when to trigger. The option is
         * a <code>java.lang.String</code> type.
         */
        public T cron(String cron) {
            this.properties.put("cron", cron);
            return (T) this;
        }
        /**
         * If set to true, then the trigger automatically delete when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true. The option is a
         * <code>boolean</code> type.
         */
        public T deleteJob(boolean deleteJob) {
            this.properties.put("deleteJob", deleteJob);
            return (T) this;
        }
        /**
         * If set to true, then the trigger automatically delete when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T deleteJob(String deleteJob) {
            this.properties.put("deleteJob", deleteJob);
            return (T) this;
        }
        /**
         * Whether or not the job should remain stored after it is orphaned (no
         * triggers point to it). The option is a <code>boolean</code> type.
         */
        public T durableJob(boolean durableJob) {
            this.properties.put("durableJob", durableJob);
            return (T) this;
        }
        /**
         * Whether or not the job should remain stored after it is orphaned (no
         * triggers point to it). The option will be converted to a
         * <code>boolean</code> type.
         */
        public T durableJob(String durableJob) {
            this.properties.put("durableJob", durableJob);
            return (T) this;
        }
        /**
         * If set to true, then the trigger automatically pauses when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true. The option is a
         * <code>boolean</code> type.
         */
        public T pauseJob(boolean pauseJob) {
            this.properties.put("pauseJob", pauseJob);
            return (T) this;
        }
        /**
         * If set to true, then the trigger automatically pauses when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T pauseJob(String pauseJob) {
            this.properties.put("pauseJob", pauseJob);
            return (T) this;
        }
        /**
         * Instructs the scheduler whether or not the job should be re-executed
         * if a 'recovery' or 'fail-over' situation is encountered. The option
         * is a <code>boolean</code> type.
         */
        public T recoverableJob(boolean recoverableJob) {
            this.properties.put("recoverableJob", recoverableJob);
            return (T) this;
        }
        /**
         * Instructs the scheduler whether or not the job should be re-executed
         * if a 'recovery' or 'fail-over' situation is encountered. The option
         * will be converted to a <code>boolean</code> type.
         */
        public T recoverableJob(String recoverableJob) {
            this.properties.put("recoverableJob", recoverableJob);
            return (T) this;
        }
        /**
         * Uses a Quartz PersistJobDataAfterExecution and
         * DisallowConcurrentExecution instead of the default job. The option is
         * a <code>boolean</code> type.
         */
        public T stateful(boolean stateful) {
            this.properties.put("stateful", stateful);
            return (T) this;
        }
        /**
         * Uses a Quartz PersistJobDataAfterExecution and
         * DisallowConcurrentExecution instead of the default job. The option
         * will be converted to a <code>boolean</code> type.
         */
        public T stateful(String stateful) {
            this.properties.put("stateful", stateful);
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
         * Specifies a custom calendar to avoid specific range of date. The
         * option is a <code>org.quartz.Calendar</code> type.
         */
        public T customCalendar(Object customCalendar) {
            this.properties.put("customCalendar", customCalendar);
            return (T) this;
        }
        /**
         * Specifies a custom calendar to avoid specific range of date. The
         * option will be converted to a <code>org.quartz.Calendar</code> type.
         */
        public T customCalendar(String customCalendar) {
            this.properties.put("customCalendar", customCalendar);
            return (T) this;
        }
        /**
         * To configure additional options on the job. The option is a
         * <code>java.util.Map<java.lang.String, java.lang.Object></code> type.
         */
        public T jobParameters(Map<String, Object> jobParameters) {
            this.properties.put("jobParameters", jobParameters);
            return (T) this;
        }
        /**
         * To configure additional options on the job. The option will be
         * converted to a <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         */
        public T jobParameters(String jobParameters) {
            this.properties.put("jobParameters", jobParameters);
            return (T) this;
        }
        /**
         * Whether the job name should be prefixed with endpoint id. The option
         * is a <code>boolean</code> type.
         */
        public T prefixJobNameWithEndpointId(boolean prefixJobNameWithEndpointId) {
            this.properties.put("prefixJobNameWithEndpointId", prefixJobNameWithEndpointId);
            return (T) this;
        }
        /**
         * Whether the job name should be prefixed with endpoint id. The option
         * will be converted to a <code>boolean</code> type.
         */
        public T prefixJobNameWithEndpointId(String prefixJobNameWithEndpointId) {
            this.properties.put("prefixJobNameWithEndpointId", prefixJobNameWithEndpointId);
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
         * To configure additional options on the trigger. The option is a
         * <code>java.util.Map<java.lang.String, java.lang.Object></code> type.
         */
        public T triggerParameters(Map<String, Object> triggerParameters) {
            this.properties.put("triggerParameters", triggerParameters);
            return (T) this;
        }
        /**
         * To configure additional options on the trigger. The option will be
         * converted to a <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         */
        public T triggerParameters(String triggerParameters) {
            this.properties.put("triggerParameters", triggerParameters);
            return (T) this;
        }
        /**
         * If it is true, JobDataMap uses the CamelContext name directly to
         * reference the CamelContext, if it is false, JobDataMap uses use the
         * CamelContext management name which could be changed during the deploy
         * time. The option is a <code>boolean</code> type.
         */
        public T usingFixedCamelContextName(boolean usingFixedCamelContextName) {
            this.properties.put("usingFixedCamelContextName", usingFixedCamelContextName);
            return (T) this;
        }
        /**
         * If it is true, JobDataMap uses the CamelContext name directly to
         * reference the CamelContext, if it is false, JobDataMap uses use the
         * CamelContext management name which could be changed during the deploy
         * time. The option will be converted to a <code>boolean</code> type.
         */
        public T usingFixedCamelContextName(String usingFixedCamelContextName) {
            this.properties.put("usingFixedCamelContextName", usingFixedCamelContextName);
            return (T) this;
        }
        /**
         * Whether or not the scheduler should be auto started. The option is a
         * <code>boolean</code> type.
         */
        public T autoStartScheduler(boolean autoStartScheduler) {
            this.properties.put("autoStartScheduler", autoStartScheduler);
            return (T) this;
        }
        /**
         * Whether or not the scheduler should be auto started. The option will
         * be converted to a <code>boolean</code> type.
         */
        public T autoStartScheduler(String autoStartScheduler) {
            this.properties.put("autoStartScheduler", autoStartScheduler);
            return (T) this;
        }
        /**
         * If it is true will fire the trigger when the route is start when
         * using SimpleTrigger. The option is a <code>boolean</code> type.
         */
        public T fireNow(boolean fireNow) {
            this.properties.put("fireNow", fireNow);
            return (T) this;
        }
        /**
         * If it is true will fire the trigger when the route is start when
         * using SimpleTrigger. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T fireNow(String fireNow) {
            this.properties.put("fireNow", fireNow);
            return (T) this;
        }
        /**
         * Seconds to wait before starting the quartz scheduler. The option is a
         * <code>int</code> type.
         */
        public T startDelayedSeconds(int startDelayedSeconds) {
            this.properties.put("startDelayedSeconds", startDelayedSeconds);
            return (T) this;
        }
        /**
         * Seconds to wait before starting the quartz scheduler. The option will
         * be converted to a <code>int</code> type.
         */
        public T startDelayedSeconds(String startDelayedSeconds) {
            this.properties.put("startDelayedSeconds", startDelayedSeconds);
            return (T) this;
        }
        /**
         * In case of scheduler has already started, we want the trigger start
         * slightly after current time to ensure endpoint is fully started
         * before the job kicks in. The option is a <code>long</code> type.
         */
        public T triggerStartDelay(long triggerStartDelay) {
            this.properties.put("triggerStartDelay", triggerStartDelay);
            return (T) this;
        }
        /**
         * In case of scheduler has already started, we want the trigger start
         * slightly after current time to ensure endpoint is fully started
         * before the job kicks in. The option will be converted to a
         * <code>long</code> type.
         */
        public T triggerStartDelay(String triggerStartDelay) {
            this.properties.put("triggerStartDelay", triggerStartDelay);
            return (T) this;
        }
    }

    public static class QuartzConsumerBuilder
            extends
                QuartzCommonBuilder<QuartzConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public QuartzConsumerBuilder(String path) {
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
        public QuartzConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (QuartzConsumerBuilder) this;
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
        public QuartzConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (QuartzConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public QuartzConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (QuartzConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public QuartzConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (QuartzConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public QuartzConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (QuartzConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public QuartzConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (QuartzConsumerBuilder) this;
        }
    }
    public default QuartzConsumerBuilder fromQuartz(String path) {
        return new QuartzConsumerBuilder(path);
    }
}