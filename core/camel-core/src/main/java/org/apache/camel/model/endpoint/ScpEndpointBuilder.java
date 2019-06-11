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
import org.apache.camel.Expression;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;

/**
 * To copy files using the secure copy protocol (SCP).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ScpEndpointBuilder {


    public static class ScpCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        ScpCommonBuilder(String path) {
            super("scp", path);
        }
        /**
         * Hostname of the FTP server. The option is a
         * <code>java.lang.String</code> type.
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * Port of the FTP server. The option is a <code>int</code> type.
         */
        public T port(int port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Port of the FTP server. The option will be converted to a
         * <code>int</code> type.
         */
        public T port(String port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * The starting directory. The option is a <code>java.lang.String</code>
         * type.
         */
        public T directoryName(String directoryName) {
            this.properties.put("directoryName", directoryName);
            return (T) this;
        }
        /**
         * Whether or not to disconnect from remote FTP server right after use.
         * Disconnect will only disconnect the current connection to the FTP
         * server. If you have a consumer which you want to stop, then you need
         * to stop the consumer/route instead. The option is a
         * <code>boolean</code> type.
         */
        public T disconnect(boolean disconnect) {
            this.properties.put("disconnect", disconnect);
            return (T) this;
        }
        /**
         * Whether or not to disconnect from remote FTP server right after use.
         * Disconnect will only disconnect the current connection to the FTP
         * server. If you have a consumer which you want to stop, then you need
         * to stop the consumer/route instead. The option will be converted to a
         * <code>boolean</code> type.
         */
        public T disconnect(String disconnect) {
            this.properties.put("disconnect", disconnect);
            return (T) this;
        }
        /**
         * Allows you to set chmod on the stored file. For example chmod=664.
         * The option is a <code>java.lang.String</code> type.
         */
        public T chmod(String chmod) {
            this.properties.put("chmod", chmod);
            return (T) this;
        }
        /**
         * Use Expression such as File Language to dynamically set the filename.
         * For consumers, it's used as a filename filter. For producers, it's
         * used to evaluate the filename to write. If an expression is set, it
         * take precedence over the CamelFileName header. (Note: The header
         * itself can also be an Expression). The expression options support
         * both String and Expression types. If the expression is a String type,
         * it is always evaluated using the File Language. If the expression is
         * an Expression type, the specified Expression type is used - this
         * allows you, for instance, to use OGNL expressions. For the consumer,
         * you can use it to filter filenames, so you can for instance consume
         * today's file using the File Language syntax:
         * mydata-${date:now:yyyyMMdd}.txt. The producers support the
         * CamelOverruleFileName header which takes precedence over any existing
         * CamelFileName header; the CamelOverruleFileName is a header that is
         * used only once, and makes it easier as this avoids to temporary store
         * CamelFileName and have to restore it afterwards. The option is a
         * <code>org.apache.camel.Expression</code> type.
         */
        public T fileName(Expression fileName) {
            this.properties.put("fileName", fileName);
            return (T) this;
        }
        /**
         * Use Expression such as File Language to dynamically set the filename.
         * For consumers, it's used as a filename filter. For producers, it's
         * used to evaluate the filename to write. If an expression is set, it
         * take precedence over the CamelFileName header. (Note: The header
         * itself can also be an Expression). The expression options support
         * both String and Expression types. If the expression is a String type,
         * it is always evaluated using the File Language. If the expression is
         * an Expression type, the specified Expression type is used - this
         * allows you, for instance, to use OGNL expressions. For the consumer,
         * you can use it to filter filenames, so you can for instance consume
         * today's file using the File Language syntax:
         * mydata-${date:now:yyyyMMdd}.txt. The producers support the
         * CamelOverruleFileName header which takes precedence over any existing
         * CamelFileName header; the CamelOverruleFileName is a header that is
         * used only once, and makes it easier as this avoids to temporary store
         * CamelFileName and have to restore it afterwards. The option will be
         * converted to a <code>org.apache.camel.Expression</code> type.
         */
        public T fileName(String fileName) {
            this.properties.put("fileName", fileName);
            return (T) this;
        }
        /**
         * Sets whether to use strict host key checking. Possible values are:
         * no, yes. The option is a <code>java.lang.String</code> type.
         */
        public T strictHostKeyChecking(String strictHostKeyChecking) {
            this.properties.put("strictHostKeyChecking", strictHostKeyChecking);
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
         * Sets the connect timeout for waiting for a connection to be
         * established Used by both FTPClient and JSCH. The option is a
         * <code>int</code> type.
         */
        public T connectTimeout(int connectTimeout) {
            this.properties.put("connectTimeout", connectTimeout);
            return (T) this;
        }
        /**
         * Sets the connect timeout for waiting for a connection to be
         * established Used by both FTPClient and JSCH. The option will be
         * converted to a <code>int</code> type.
         */
        public T connectTimeout(String connectTimeout) {
            this.properties.put("connectTimeout", connectTimeout);
            return (T) this;
        }
        /**
         * Sets the so timeout FTP and FTPS Only for Camel 2.4. SFTP for Camel
         * 2.14.3/2.15.3/2.16 onwards. Is the SocketOptions.SO_TIMEOUT value in
         * millis. Recommended option is to set this to 300000 so as not have a
         * hanged connection. On SFTP this option is set as timeout on the JSCH
         * Session instance. The option is a <code>int</code> type.
         */
        public T soTimeout(int soTimeout) {
            this.properties.put("soTimeout", soTimeout);
            return (T) this;
        }
        /**
         * Sets the so timeout FTP and FTPS Only for Camel 2.4. SFTP for Camel
         * 2.14.3/2.15.3/2.16 onwards. Is the SocketOptions.SO_TIMEOUT value in
         * millis. Recommended option is to set this to 300000 so as not have a
         * hanged connection. On SFTP this option is set as timeout on the JSCH
         * Session instance. The option will be converted to a <code>int</code>
         * type.
         */
        public T soTimeout(String soTimeout) {
            this.properties.put("soTimeout", soTimeout);
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
         * Sets the data timeout for waiting for reply Used only by FTPClient.
         * The option is a <code>int</code> type.
         */
        public T timeout(int timeout) {
            this.properties.put("timeout", timeout);
            return (T) this;
        }
        /**
         * Sets the data timeout for waiting for reply Used only by FTPClient.
         * The option will be converted to a <code>int</code> type.
         */
        public T timeout(String timeout) {
            this.properties.put("timeout", timeout);
            return (T) this;
        }
        /**
         * Sets the known_hosts file, so that the jsch endpoint can do host key
         * verification. You can prefix with classpath: to load the file from
         * classpath instead of file system. The option is a
         * <code>java.lang.String</code> type.
         */
        public T knownHostsFile(String knownHostsFile) {
            this.properties.put("knownHostsFile", knownHostsFile);
            return (T) this;
        }
        /**
         * Password to use for login. The option is a
         * <code>java.lang.String</code> type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Set a comma separated list of authentications that will be used in
         * order of preference. Possible authentication methods are defined by
         * JCraft JSCH. Some examples include:
         * gssapi-with-mic,publickey,keyboard-interactive,password If not
         * specified the JSCH and/or system defaults will be used. The option is
         * a <code>java.lang.String</code> type.
         */
        public T preferredAuthentications(String preferredAuthentications) {
            this.properties.put("preferredAuthentications", preferredAuthentications);
            return (T) this;
        }
        /**
         * Set the private key bytes to that the endpoint can do private key
         * verification. This must be used only if privateKeyFile wasn't set.
         * Otherwise the file will have the priority. The option is a
         * <code>byte[]</code> type.
         */
        public T privateKeyBytes(Byte[] privateKeyBytes) {
            this.properties.put("privateKeyBytes", privateKeyBytes);
            return (T) this;
        }
        /**
         * Set the private key bytes to that the endpoint can do private key
         * verification. This must be used only if privateKeyFile wasn't set.
         * Otherwise the file will have the priority. The option will be
         * converted to a <code>byte[]</code> type.
         */
        public T privateKeyBytes(String privateKeyBytes) {
            this.properties.put("privateKeyBytes", privateKeyBytes);
            return (T) this;
        }
        /**
         * Set the private key file to that the endpoint can do private key
         * verification. You can prefix with classpath: to load the file from
         * classpath instead of file system. The option is a
         * <code>java.lang.String</code> type.
         */
        public T privateKeyFile(String privateKeyFile) {
            this.properties.put("privateKeyFile", privateKeyFile);
            return (T) this;
        }
        /**
         * Set the private key file passphrase to that the endpoint can do
         * private key verification. The option is a
         * <code>java.lang.String</code> type.
         */
        public T privateKeyFilePassphrase(String privateKeyFilePassphrase) {
            this.properties.put("privateKeyFilePassphrase", privateKeyFilePassphrase);
            return (T) this;
        }
        /**
         * Username to use for login. The option is a
         * <code>java.lang.String</code> type.
         */
        public T username(String username) {
            this.properties.put("username", username);
            return (T) this;
        }
        /**
         * If knownHostFile has not been explicit configured, then use the host
         * file from System.getProperty(user.home) /.ssh/known_hosts. The option
         * is a <code>boolean</code> type.
         */
        public T useUserKnownHostsFile(boolean useUserKnownHostsFile) {
            this.properties.put("useUserKnownHostsFile", useUserKnownHostsFile);
            return (T) this;
        }
        /**
         * If knownHostFile has not been explicit configured, then use the host
         * file from System.getProperty(user.home) /.ssh/known_hosts. The option
         * will be converted to a <code>boolean</code> type.
         */
        public T useUserKnownHostsFile(String useUserKnownHostsFile) {
            this.properties.put("useUserKnownHostsFile", useUserKnownHostsFile);
            return (T) this;
        }
        /**
         * Set a comma separated list of ciphers that will be used in order of
         * preference. Possible cipher names are defined by JCraft JSCH. Some
         * examples include:
         * aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-cbc,aes256-cbc. If not specified the default list from JSCH will be used. The option is a <code>java.lang.String</code> type.
         */
        public T ciphers(String ciphers) {
            this.properties.put("ciphers", ciphers);
            return (T) this;
        }
    }

    public static class ScpProducerBuilder
            extends
                ScpCommonBuilder<ScpProducerBuilder>
            implements
                EndpointProducerBuilder {
        public ScpProducerBuilder(String path) {
            super(path);
        }
        /**
         * Flatten is used to flatten the file name path to strip any leading
         * paths, so it's just the file name. This allows you to consume
         * recursively into sub-directories, but when you eg write the files to
         * another directory they will be written in a single directory. Setting
         * this to true on the producer enforces that any file name in
         * CamelFileName header will be stripped for any leading paths. The
         * option is a <code>boolean</code> type.
         */
        public ScpProducerBuilder flatten(boolean flatten) {
            this.properties.put("flatten", flatten);
            return (ScpProducerBuilder) this;
        }
        /**
         * Flatten is used to flatten the file name path to strip any leading
         * paths, so it's just the file name. This allows you to consume
         * recursively into sub-directories, but when you eg write the files to
         * another directory they will be written in a single directory. Setting
         * this to true on the producer enforces that any file name in
         * CamelFileName header will be stripped for any leading paths. The
         * option will be converted to a <code>boolean</code> type.
         */
        public ScpProducerBuilder flatten(String flatten) {
            this.properties.put("flatten", flatten);
            return (ScpProducerBuilder) this;
        }
        /**
         * Used for jailing (restricting) writing files to the starting
         * directory (and sub) only. This is enabled by default to not allow
         * Camel to write files to outside directories (to be more secured out
         * of the box). You can turn this off to allow writing files to
         * directories outside the starting directory, such as parent or root
         * folders. The option is a <code>boolean</code> type.
         */
        public ScpProducerBuilder jailStartingDirectory(
                boolean jailStartingDirectory) {
            this.properties.put("jailStartingDirectory", jailStartingDirectory);
            return (ScpProducerBuilder) this;
        }
        /**
         * Used for jailing (restricting) writing files to the starting
         * directory (and sub) only. This is enabled by default to not allow
         * Camel to write files to outside directories (to be more secured out
         * of the box). You can turn this off to allow writing files to
         * directories outside the starting directory, such as parent or root
         * folders. The option will be converted to a <code>boolean</code> type.
         */
        public ScpProducerBuilder jailStartingDirectory(
                String jailStartingDirectory) {
            this.properties.put("jailStartingDirectory", jailStartingDirectory);
            return (ScpProducerBuilder) this;
        }
        /**
         * Used to specify if a null body is allowed during file writing. If set
         * to true then an empty file will be created, when set to false, and
         * attempting to send a null body to the file component, a
         * GenericFileWriteException of 'Cannot write null body to file.' will
         * be thrown. If the fileExist option is set to 'Override', then the
         * file will be truncated, and if set to append the file will remain
         * unchanged. The option is a <code>boolean</code> type.
         */
        public ScpProducerBuilder allowNullBody(boolean allowNullBody) {
            this.properties.put("allowNullBody", allowNullBody);
            return (ScpProducerBuilder) this;
        }
        /**
         * Used to specify if a null body is allowed during file writing. If set
         * to true then an empty file will be created, when set to false, and
         * attempting to send a null body to the file component, a
         * GenericFileWriteException of 'Cannot write null body to file.' will
         * be thrown. If the fileExist option is set to 'Override', then the
         * file will be truncated, and if set to append the file will remain
         * unchanged. The option will be converted to a <code>boolean</code>
         * type.
         */
        public ScpProducerBuilder allowNullBody(String allowNullBody) {
            this.properties.put("allowNullBody", allowNullBody);
            return (ScpProducerBuilder) this;
        }
        /**
         * Whether or not to disconnect from remote FTP server right after a
         * Batch upload is complete. disconnectOnBatchComplete will only
         * disconnect the current connection to the FTP server. The option is a
         * <code>boolean</code> type.
         */
        public ScpProducerBuilder disconnectOnBatchComplete(
                boolean disconnectOnBatchComplete) {
            this.properties.put("disconnectOnBatchComplete", disconnectOnBatchComplete);
            return (ScpProducerBuilder) this;
        }
        /**
         * Whether or not to disconnect from remote FTP server right after a
         * Batch upload is complete. disconnectOnBatchComplete will only
         * disconnect the current connection to the FTP server. The option will
         * be converted to a <code>boolean</code> type.
         */
        public ScpProducerBuilder disconnectOnBatchComplete(
                String disconnectOnBatchComplete) {
            this.properties.put("disconnectOnBatchComplete", disconnectOnBatchComplete);
            return (ScpProducerBuilder) this;
        }
        /**
         * Strategy (Custom Strategy) used to move file with special naming
         * token to use when fileExist=Move is configured. By default, there is
         * an implementation used if no custom strategy is provided. The option
         * is a
         * <code>org.apache.camel.component.file.strategy.FileMoveExistingStrategy</code> type.
         */
        public ScpProducerBuilder moveExistingFileStrategy(
                Object moveExistingFileStrategy) {
            this.properties.put("moveExistingFileStrategy", moveExistingFileStrategy);
            return (ScpProducerBuilder) this;
        }
        /**
         * Strategy (Custom Strategy) used to move file with special naming
         * token to use when fileExist=Move is configured. By default, there is
         * an implementation used if no custom strategy is provided. The option
         * will be converted to a
         * <code>org.apache.camel.component.file.strategy.FileMoveExistingStrategy</code> type.
         */
        public ScpProducerBuilder moveExistingFileStrategy(
                String moveExistingFileStrategy) {
            this.properties.put("moveExistingFileStrategy", moveExistingFileStrategy);
            return (ScpProducerBuilder) this;
        }
    }
    public default ScpProducerBuilder toScp(String path) {
        return new ScpProducerBuilder(path);
    }
}