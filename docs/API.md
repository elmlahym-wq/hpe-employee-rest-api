# API reference

Base URL: `http://localhost:8080`

| Method | Path | Request | Success response |
| --- | --- | --- | --- |
| GET | `/employees` | None | 200, object containing `employeeList` |
| POST | `/employees` | JSON employee | 200, updated object containing `employeeList` |

## Employee fields

All five fields are strings: `employee_id`, `first_name`, `last_name`, `email`, and `title`.

POST appends a record to memory. It returns the entire collection, preserving the exercise behavior. No field validation or uniqueness checks are performed. Malformed JSON is rejected by Spring with HTTP 400. Unsupported request media types produce HTTP 415.

The initial records are John Doe, Jane Smith, and Alex Jones, each using an example.com email. State is process-local and resets on restart.
