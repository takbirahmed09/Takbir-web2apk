#!/usr/bin/env sh
exec java -Xmx64M -jar "$(dirname "$0")/gradle/wrapper/gradle-wrapper.jar" "$@"
