#!/bin/bash
./gradlew nativeCompile
cp build/native/nativeCompile/data-jpa-oracle .
