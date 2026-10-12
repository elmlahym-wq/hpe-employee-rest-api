# Project provenance and cleanup

## Source selection

Seven supplied ZIP archives contained versions of the same exercise, not seven separate applications.

| Upload | Treatment |
| --- | --- |
| `DOC-20260925-WA0009.zip` | Canonical later implementation: GET and POST, service insertion, model setters |
| `employee_files.zip` | Earlier GET-only implementation; superseded |
| `DOC-20260925-WA0008.zip` | Byte-identical copy of employee_files.zip |
| `Internal storage.zip` | Same five earlier Java files, without enclosing folder |
| `task4_tests.zip` | Canonical four original test methods |
| `DOC-20260925-WA0010 (1).zip` | Byte-identical copy of task4_tests.zip |
| `Internal storage (1).zip` | Same two test files, without enclosing folder |

Only the newer five production Java files and two test files are included. Original uploads are preserved separately; redundant copies are excluded from this project.

## Preparation for sharing

Added a standard Maven source layout, build descriptor, ignore rules, CI, API examples and documentation. Replaced controller field injection with constructor injection. Updated the MockMvc annotation import for Spring Boot 4.1. Added HTTP contract assertions and malformed-request coverage. The original GET/POST behavior and JSON field names are retained.

The certificate supplied by Mohamed names the HPE Software Engineering Job Simulation on Forage, completed September 25, 2026. It is evidence of simulation completion, not employment or production experience.
