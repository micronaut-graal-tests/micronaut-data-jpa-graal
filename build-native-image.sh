./gradlew assemble
native-image --no-fallback --class-path build/libs/micronaut-data-jpa-graal-*-all.jar
