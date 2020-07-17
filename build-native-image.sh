./gradlew assemble
native-image --static --no-fallback --class-path build/libs/micronaut-data-jpa-graal-*-all.jar
