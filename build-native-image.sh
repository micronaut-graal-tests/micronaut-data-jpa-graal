#!/bin/bash
./gradlew nativeImage
cp build/native-image/data-jpa-postgres .
