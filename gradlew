#!/usr/bin/env sh
# Simplified gradlew for Unix
exec java -Xmx64M -jar "$(dirname "$0")/gradle/wrapper/gradle-wrapper.jar" "$@"
