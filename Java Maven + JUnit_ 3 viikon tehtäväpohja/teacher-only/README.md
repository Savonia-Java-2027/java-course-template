# Instructor-only tests: DO NOT upload to student template

These files are intentionally outside `student-template/` in the ZIP. Keep them in a separate private instructor repository.

## Manual retest of a student's submission
1. Clone the student's private repository into a temporary directory.
2. Copy the matching `hidden-tests/weekXX/*.java` into `weekXX/src/test/java/fi/savonia/exercises/` of the temporary copy.
3. Run `mvn -f weekXX/pom.xml test` from the temporary copy's root.
4. Inspect `weekXX/target/surefire-reports/` for detailed test results.
5. Delete the temporary copy; do not push hidden tests into the student repository.

For actual grading, execute untrusted student code in an isolated, credential-free environment and use an instructor-controlled build configuration. A passing test suite alone is not a full grading policy.
