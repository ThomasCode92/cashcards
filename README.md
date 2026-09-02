# Cashcard - API for Family Cash Cards

> This application is based on
> the [Building a REST API with Spring Boot](https://spring.academy/courses/building-a-rest-api-with-spring-boot) course
> by Spring Academy. It is a sample application that demonstrates the use of Spring Boot to build a REST API start to
> finish with features like authentication, authorization, and data persistence.

## Prerequisites

- JDK 25, can be installed using [sdkman](https://sdkman.io/)
- Gradle, or use the provided `gradlew` wrapper
- An IDE, preferably IntelliJ IDEA

## Running the application

```shell
./gradlew build
./gradlew test
```

## Formatting

This project uses [Spotless](https://github.com/diffplug/spotless) with
the [Palantir](https://github.com/palantir/gradle-baseline) Java formatter. To format the code, run the following
command:

```shell
./gradlew spotlessApply
```