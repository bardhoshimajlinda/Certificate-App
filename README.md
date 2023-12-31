# CertificateApp

The CertificateApp is a Java application that demonstrates basic CRUD (Create, Read, Update, Delete) operations on a database using Java Persistence API (JPA) with Hibernate. The application manages personal certificates, representing individual records with attributes such as name, surname, birth date, gender, relationship status, and more.

## Project Structure

- **model:** Contains the `PersonalCertificate` class, an entity representing a personal certificate with JPA annotations.
- **repository:** Houses the `PersonalCertificateRepository` class responsible for handling database operations.
- **CertificateApp:** The main class with test methods (`testGetAll`, `testGetById`, `testInsert`, `testUpdate`, `testDelete`) demonstrating the functionality of the repository.

## Database Operations

- `getAll`: Retrieves all personal certificates from the database.
- `getById`: Retrieves a specific personal certificate by ID.
- `insert`: Inserts a new personal certificate into the database.
- `update`: Updates an existing personal certificate in the database.
- `delete`: Deletes a personal certificate by ID from the database.
