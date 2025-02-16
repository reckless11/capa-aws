/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package group.rxcloud.capa.spi.aws.log.manager;

import com.google.gson.Gson;
import group.rxcloud.capa.spi.aws.log.enums.CapaLogLevel;

import java.util.Map;

// TODO upgrade
public class CustomLogManager {

    private static final Gson GSON = new Gson();

    public static void trace(String message) {
        Map<String, String> logMessages = LogAppendManager.parseLogs(message, null, CapaLogLevel.TRACE.name(), null);
        System.out.println(GSON.toJson(logMessages));
    }

    public static void trace(String message, Throwable throwable) {
        Map<String, String> logMessages = LogAppendManager.parseLogs(message, null, CapaLogLevel.TRACE.name(), throwable);
        System.out.println(GSON.toJson(logMessages));
    }

    public static void debug(String message) {
        Map<String, String> logMessages = LogAppendManager.parseLogs(message, null, CapaLogLevel.DEBUG.name(), null);
        System.out.println(GSON.toJson(logMessages));
    }

    public static void debug(String message, Throwable throwable) {
        Map<String, String> logMessages = LogAppendManager.parseLogs(message, null, CapaLogLevel.DEBUG.name(), throwable);
        System.out.println(GSON.toJson(logMessages));
    }

    public static void info(String message) {
        Map<String, String> logMessages = LogAppendManager.parseLogs(message, null, CapaLogLevel.INFO.name(), null);
        System.out.println(GSON.toJson(logMessages));
    }

    public static void info(String message, Throwable throwable) {
        Map<String, String> logMessages = LogAppendManager.parseLogs(message, null, CapaLogLevel.INFO.name(), throwable);
        System.out.println(GSON.toJson(logMessages));
    }

    public static void warn(String message) {
        Map<String, String> logMessages = LogAppendManager.parseLogs(message, null, CapaLogLevel.WARN.name(), null);
        System.out.println(GSON.toJson(logMessages));
    }

    public static void warn(String message, Throwable throwable) {
        Map<String, String> logMessages = LogAppendManager.parseLogs(message, null, CapaLogLevel.WARN.name(), throwable);
        System.out.println(GSON.toJson(logMessages));
    }

    public static void error(String message) {
        Map<String, String> logMessages = LogAppendManager.parseLogs(message, null, CapaLogLevel.ERROR.name(), null);
        System.out.println(GSON.toJson(logMessages));
    }

    public static void error(String message, Throwable throwable) {
        Map<String, String> logMessages = LogAppendManager.parseLogs(message, null, CapaLogLevel.ERROR.name(), throwable);
        System.out.println(GSON.toJson(logMessages));
    }
}

