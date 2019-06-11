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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * The telegram component provides access to the Telegram Bot API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface TelegramEndpointBuilder {


    public static class TelegramCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        TelegramCommonBuilder(String path) {
            super("telegram", path);
        }
        /**
         * The endpoint type. Currently, only the 'bots' type is supported. The
         * option is a <code>java.lang.String</code> type.
         */
        public T type(String type) {
            this.properties.put("type", type);
            return (T) this;
        }
        /**
         * The authorization token for using the bot (ask the BotFather). The
         * option is a <code>java.lang.String</code> type.
         */
        public T authorizationToken(String authorizationToken) {
            this.properties.put("authorizationToken", authorizationToken);
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
         * HTTP proxy host which could be used when sending out the message. The
         * option is a <code>java.lang.String</code> type.
         */
        public T proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (T) this;
        }
        /**
         * HTTP proxy port which could be used when sending out the message. The
         * option is a <code>java.lang.Integer</code> type.
         */
        public T proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
        /**
         * HTTP proxy port which could be used when sending out the message. The
         * option will be converted to a <code>java.lang.Integer</code> type.
         */
        public T proxyPort(String proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
    }

    public static class TelegramConsumerBuilder
            extends
                TelegramCommonBuilder<TelegramConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public TelegramConsumerBuilder(String path) {
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
        public TelegramConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (TelegramConsumerBuilder) this;
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
        public TelegramConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Limit on the number of updates that can be received in a single
         * polling request. The option is a <code>java.lang.Integer</code> type.
         */
        public TelegramConsumerBuilder limit(Integer limit) {
            this.properties.put("limit", limit);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Limit on the number of updates that can be received in a single
         * polling request. The option will be converted to a
         * <code>java.lang.Integer</code> type.
         */
        public TelegramConsumerBuilder limit(String limit) {
            this.properties.put("limit", limit);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * <code>boolean</code> type.
         */
        public TelegramConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option will be
         * converted to a <code>boolean</code> type.
         */
        public TelegramConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Timeout in seconds for long polling. Put 0 for short polling or a
         * bigger number for long polling. Long polling produces shorter
         * response time. The option is a <code>java.lang.Integer</code> type.
         */
        public TelegramConsumerBuilder timeout(Integer timeout) {
            this.properties.put("timeout", timeout);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Timeout in seconds for long polling. Put 0 for short polling or a
         * bigger number for long polling. Long polling produces shorter
         * response time. The option will be converted to a
         * <code>java.lang.Integer</code> type.
         */
        public TelegramConsumerBuilder timeout(String timeout) {
            this.properties.put("timeout", timeout);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         */
        public TelegramConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         */
        public TelegramConsumerBuilder exceptionHandler(String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a <code>org.apache.camel.ExchangePattern</code> type.
         */
        public TelegramConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         */
        public TelegramConsumerBuilder exchangePattern(String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         */
        public TelegramConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option will be converted
         * to a <code>org.apache.camel.spi.PollingConsumerPollStrategy</code>
         * type.
         */
        public TelegramConsumerBuilder pollStrategy(String pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a <code>int</code> type.
         */
        public TelegramConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * will be converted to a <code>int</code> type.
         */
        public TelegramConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a <code>int</code>
         * type.
         */
        public TelegramConsumerBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option will be converted to a
         * <code>int</code> type.
         */
        public TelegramConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a <code>int</code> type.
         */
        public TelegramConsumerBuilder backoffMultiplier(int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option will be converted to a <code>int</code> type.
         */
        public TelegramConsumerBuilder backoffMultiplier(
                String backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a <code>long</code> type.
         */
        public TelegramConsumerBuilder delay(long delay) {
            this.properties.put("delay", delay);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a
         * <code>long</code> type.
         */
        public TelegramConsumerBuilder delay(String delay) {
            this.properties.put("delay", delay);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a <code>boolean</code> type.
         */
        public TelegramConsumerBuilder greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option will be converted to a <code>boolean</code> type.
         */
        public TelegramConsumerBuilder greedy(String greedy) {
            this.properties.put("greedy", greedy);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a <code>long</code> type.
         */
        public TelegramConsumerBuilder initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option will be converted to a
         * <code>long</code> type.
         */
        public TelegramConsumerBuilder initialDelay(String initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a <code>org.apache.camel.LoggingLevel</code> type.
         */
        public TelegramConsumerBuilder runLoggingLevel(
                LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * will be converted to a <code>org.apache.camel.LoggingLevel</code>
         * type.
         */
        public TelegramConsumerBuilder runLoggingLevel(String runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         */
        public TelegramConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         */
        public TelegramConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         */
        public TelegramConsumerBuilder scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option will be converted to a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         */
        public TelegramConsumerBuilder scheduler(String scheduler) {
            this.properties.put("scheduler", scheduler);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * <code>java.util.Map<java.lang.String, java.lang.Object></code> type.
         */
        public TelegramConsumerBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option will be
         * converted to a <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         */
        public TelegramConsumerBuilder schedulerProperties(
                String schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a
         * <code>boolean</code> type.
         */
        public TelegramConsumerBuilder startScheduler(boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Whether the scheduler should be auto started. The option will be
         * converted to a <code>boolean</code> type.
         */
        public TelegramConsumerBuilder startScheduler(String startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * <code>java.util.concurrent.TimeUnit</code> type.
         */
        public TelegramConsumerBuilder timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option will be
         * converted to a <code>java.util.concurrent.TimeUnit</code> type.
         */
        public TelegramConsumerBuilder timeUnit(String timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a
         * <code>boolean</code> type.
         */
        public TelegramConsumerBuilder useFixedDelay(boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (TelegramConsumerBuilder) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option will be
         * converted to a <code>boolean</code> type.
         */
        public TelegramConsumerBuilder useFixedDelay(String useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (TelegramConsumerBuilder) this;
        }
    }

    public static class TelegramProducerBuilder
            extends
                TelegramCommonBuilder<TelegramProducerBuilder>
            implements
                EndpointProducerBuilder {
        public TelegramProducerBuilder(String path) {
            super(path);
        }
        /**
         * The identifier of the chat that will receive the produced messages.
         * Chat ids can be first obtained from incoming messages (eg. when a
         * telegram user starts a conversation with a bot, its client sends
         * automatically a '/start' message containing the chat id). It is an
         * optional parameter, as the chat id can be set dynamically for each
         * outgoing message (using body or headers). The option is a
         * <code>java.lang.String</code> type.
         */
        public TelegramProducerBuilder chatId(String chatId) {
            this.properties.put("chatId", chatId);
            return (TelegramProducerBuilder) this;
        }
    }
    public default TelegramConsumerBuilder fromTelegram(String path) {
        return new TelegramConsumerBuilder(path);
    }
    public default TelegramProducerBuilder toTelegram(String path) {
        return new TelegramProducerBuilder(path);
    }
}