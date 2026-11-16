# Selenium Java Automation Framework

## Project Overview

This project demonstrates a Selenium WebDriver automation framework developed using Java, TestNG and Maven.

The framework follows the Page Object Model (POM) design pattern to maintain reusable, readable and maintainable automation scripts.

## Technology Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Git and GitHub

## Application Under Test

SauceDemo – https://www.saucedemo.com/

## Framework Features

- Page Object Model implementation
- Reusable browser setup and teardown
- TestNG annotations and assertions
- Configuration management
- Maven dependency management
- Automated login test scenarios
- Test execution through TestNG XML

## Project Structure

```text
selenium-java-automation-framework
│
├── src
│   ├── main
│   │   └── java
│   │       ├── base
│   │       ├── pages
│   │       └── utils
│   │
│   └── test
│       ├── java
│       │   └── tests
│       └── resources
│           └── config.properties
│
├── pom.xml
├── testng.xml
└── README.md
```

## Test Scenarios

1. Verify login with valid credentials.
2. Verify login with invalid credentials.
3. Verify login with empty username.
4. Verify login with empty password.
5. Verify successful navigation to the products page.
6. Verify error messages for invalid login attempts.

## How to Execute

1. Clone the repository.
2. Import the project into IntelliJ IDEA or Eclipse as a Maven project.
3. Ensure Java and Maven are configured.
4. Run the tests using the TestNG suite or Maven command:

```bash
mvn clean test
```

## Author

Vipin Yadav  
Software QA Engineer

GitHub: https://github.com/vipin-yadavQA

---

This is a practical Selenium automation portfolio project.
