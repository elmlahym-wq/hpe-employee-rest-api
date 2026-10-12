# Employee REST API

[![Java CI](https://github.com/elmlahym-wq/hpe-employee-rest-api/actions/workflows/ci.yml/badge.svg)](https://github.com/elmlahym-wq/hpe-employee-rest-api/actions/workflows/ci.yml)

A Java and Spring Boot REST service for listing employees and adding employee records, with unit and HTTP integration tests.

Built by **Mohamed** while completing the **HPE Software Engineering Job Simulation on Forage**, completed September 25, 2026. This is a training and portfolio project; it does not represent employment at HPE or an HPE production system.

## Features

- `GET /employees` returns three initial sample employees and any subsequently added records.
- `POST /employees` accepts a JSON employee and returns the updated employee collection.
- In-memory storage, service/controller separation, and constructor injection.
- JUnit tests for initial data and insertion, plus MockMvc tests for HTTP behavior.
- Maven build and GitHub Actions verification.

## Stack

Java 17 · Spring Boot 4.1.1 · Maven · JUnit Jupiter · Spring MockMvc

## Run locally

Install JDK 17 or newer and Maven 3.6.3 or newer, then:

```bash
mvn spring-boot:run
```

The API starts at `http://localhost:8080/employees`.

```bash
curl http://localhost:8080/employees
curl -X POST http://localhost:8080/employees \
  -H 'Content-Type: application/json' \
  --data-binary @examples/new-employee.json
```

Example response shape:

```json
{
  "employeeList": [
    {
      "employee_id": "1",
      "first_name": "John",
      "last_name": "Doe",
      "email": "john.doe@example.com",
      "title": "Software Engineer"
    }
  ]
}
```

The example shows one record; the initial response contains three. JSON field names preserve the original exercise contract.

## Test and package

```bash
mvn verify
java -jar target/employee-rest-api-1.0.0.jar
```

## Project structure

```text
src/main/java/com/example/restservice/   Application, models, service and controller
src/test/java/com/example/restservice/   Unit and HTTP integration tests
examples/                               Example JSON request
docs/                                  API and project provenance
.github/workflows/                      Automated build and tests
pom.xml                                 Dependencies and build configuration
```

See [API documentation](docs/API.md) and [project provenance](docs/PROJECT_NOTES.md).

## Scope and limitations

This small learning project uses sample `example.com` addresses. Records reset when the process restarts. Authentication, database persistence, field validation, duplicate-ID prevention, pagination, and concurrent-write guarantees are not implemented. The POST endpoint appends the supplied object; it is not a file-upload endpoint. Keep the demo local rather than treating it as a production employee system.

## Learning outcomes

REST endpoint design, Java models, JSON request/response handling, Spring dependency injection, and automated unit and integration testing.

## Certificate

The supplied completion certificate confirms the HPE Software Engineering Job Simulation and lists proposal creation, building a RESTful service, uploading data, and unit tests. The uploaded project files cover the service, JSON data insertion, and tests; a separate proposal document was not included.
