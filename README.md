# Customer Management System

This is a simple Customer Management System implemented using Spring Boot and Thymeleaf. It allows users to perform CRUD operations on customer data.

## Features

- List all customers with their details.
- Add a new customer.
- Edit existing customer details.
- Delete a customer.

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- Bootstrap
- HTML

## Setup Instructions

1. Clone the repository to your local machine.
   ```bash
   git clone https://github.com/manku888/customer-management-system.git
   ```

2. Open the project in your preferred IDE (IntelliJ, Eclipse, etc.).

3. Run the `CustomerManagementSystemApplication` class to start the Spring Boot application.

4. Open your web browser and go to [http://localhost:8080/customers](http://localhost:9644/customers) to access the application.

## Usage

- **List Customers:** View a list of all customers with their details.

- **Add Customer:**
  - Click on "Add Customer" to navigate to the form.
  - Enter customer details and click "Submit."

- **Edit Customer:**
  - Click on the "Edit" icon next to a customer to edit their details.
  - Update the information and click "Submit."

- **Delete Customer:**
  - Click on the "Delete" icon next to a customer to remove them from the system.

## Project Structure

- **`com.m.cms` Package:**
  - `CustomerManagementSystemApplication`: Main class with the `main` method to run the Spring Boot application.
  - `CommandLineRunner`: Initializes the database with sample customer data (commented out by default).

- **`com.m.cms.controller` Package:**
  - `CustomerController`: Handles HTTP requests related to customer operations.

- **`com.m.cms.entity` Package:**
  - `Customer`: Entity class representing a customer with JPA annotations.

- **`com.m.cms.repository` Package:**
  - `CustomerRepository`: Interface extending JpaRepository for database operations.

- **`com.m.cms.service` Package:**
  - `CustomerService`: Service interface defining customer-related operations.

- **`com.m.cms.service.implementation` Package:**
  - `CustomerServiceImplementation`: Implements the `CustomerService` interface.

- **`resources` Directory:**
  - Contains Thymeleaf HTML templates for creating, updating, and listing customers.
