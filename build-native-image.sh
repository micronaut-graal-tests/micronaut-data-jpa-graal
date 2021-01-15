#!/bin/bash
./gradlew nativeImage
cp build/native-image/data-jpa-h2 .
