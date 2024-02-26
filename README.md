# Etag filter issue

Example code for Spring Framework issue: https://github.com/spring-projects/spring-framework/issues/32317

Run with `./gradlew bootRun` and check headers using `curl -I http://localhost:8080/test`. There should be a `Content-Type: application/json` header, but it is missing.

Or run test with `./gradlew test`.