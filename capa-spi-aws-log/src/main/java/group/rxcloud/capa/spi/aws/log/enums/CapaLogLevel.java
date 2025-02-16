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
package group.rxcloud.capa.spi.aws.log.enums;

import java.util.Arrays;
import java.util.Optional;

/**
 * Capa log level.
 */
public enum CapaLogLevel {

    /**
     * Standard order of log priorities:ALL,TRACE,DEBUG,INFO,WARN,ERROR,FATAL,OFF
     */
    ALL(1, "ALL"),
    TRACE(2, "TRACE"),
    DEBUG(3, "DEBUG"),
    INFO(4, "INFO"),
    WARN(5, "WARN"),
    ERROR(6, "ERROR"),
    FATAL(7, "FATAL"),
    OFF(8, "OFF");

    final int level;
    final String levelName;

    CapaLogLevel(int level, String levelName) {
        this.level = level;
        this.levelName = levelName;
    }

    /**
     * Convert logLevelArg to {@link CapaLogLevel}
     */
    public static Optional<CapaLogLevel> toCapaLogLevel(String logLevelArg) {
        return Arrays.stream(CapaLogLevel.values())
                .filter(logLevel -> logLevel.levelName.equalsIgnoreCase(logLevelArg))
                .findAny();
    }

    /**
     * Get level.
     */
    public int getLevel() {
        return level;
    }

    public String getLevelName() {
        return levelName;
    }
}
