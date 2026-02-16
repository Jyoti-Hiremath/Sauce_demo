This project automates the SauceDemo web application (https://www.saucedemo.com/) using Selenium WebDriver and Java.
The framework is designed using the Page Object Model (POM) pattern to ensure scalability, maintainability, and clean separation of test logic and page elements.
The purpose of this project is to demonstrate UI test automation skills and framework designs.

## Tools Used
Java
Selenium
Maven
TestNG

## Framework Design
- Page Object Model (POM)
- Maven dependency management
- TestNG for execution and reporting

## Test Scenarios Covered
1. Login Functionality
    Valid login
    Invalid login
    Locked user login
2. Product Page
    Verify product listing
    Sort products (Low to High)
    Validate sorting functionality
3. Cart
    Add product to cart
    Remove product
    Validate cart badge count
4. Checkout
    Complete end-to-end checkout process
    Verify order confirmation message

## How to Run the Project
- Prerequisites
Java installed
Maven installed
Chrome browser

Steps
Clone the repository
Open project in IDE (IntelliJ/Eclipse)
Run using TestNG XML file
OR
Run using Maven:
mvn clean test
