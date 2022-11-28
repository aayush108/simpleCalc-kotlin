[![Run automated test](https://github.com/aayush108/simpleCalc-kotlin/actions/workflows/gradle.yml/badge.svg)](https://github.com/aayush108/simpleCalc-kotlin/actions/workflows/gradle.yml)
# simpleCalc-kotlin
This project has been created for unit testing and functional testing for the simple calculator project. 

## Built With
* Cucumber-JVM
* JUnit5
* Jacoco reports

## Automated tests
### Unit Test
Unit tests are written in Junit5 and uses the parameterized tests feature. 
This feature enables us to execute a single test method multiple times with different parameters.
### How to run

To run the unit tests, go to the project folder and use the following command
```
gradle test
```
### Functional Tests
Functional tests are written in cucumber and uses scenario outline feature. The scenarios can be found in resources/feature/Calculator.feature.
### How to run
To run the BDD tests, go to the project folder and use the following command

```
gradle cucumber
```
## Test Reports
- Unit Test

Unit test runs results in xml and html reports. The html and xml reports are stored in 
**build/reports/tests/test/index.html** and **build/test-results/test/TEST-iohk.com.CalculatorTest.xml** 
respectively.They are updated on each test run.

To produce test report with test coverage, execute the following command

```
gradle jacocoTestReport
```
Test coverage results can be found on path **build/reports/jacoco/test/html/index.html**

- BBD Test

Cucumbers reports are generated using the publish feature in cucumber. The test run generates a new 
url for the location of the report. The url can be found in the output of the test. They are stored for 24 hours.

## Github action
The github is configured to do the following actions on every push to main branch:

* Run unit tests
* Run BDD tests
* Run tests with coverage
* Archive test coverage results
