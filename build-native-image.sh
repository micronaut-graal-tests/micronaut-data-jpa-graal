./gradlew assemble
native-image --no-server --static --no-fallback --class-path build/libs/micronaut-data-jpa-graal-*-all.jar
