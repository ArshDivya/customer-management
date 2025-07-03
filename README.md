Customer Data Management System (Java + MySQL)
A simple console-based Java application to manage customer information, supporting full CRUD operations (Create, Read, Update, Delete) using MySQL Database with JDBC.

Features:
Add New Customers

View All Customers

Update Customer Details

Delete Customer Records

MySQL Database Connectivity (JDBC)

Technologies Used:
Java (JDK 8 or later)

MySQL

MySQL Connector/J (JDBC Driver)

JDBC API

Console-based Interface

Project Structure:
customer-management/
│
├── src/
│ ├── CustomerApp.java → Main Menu & Program Flow
│ ├── Customer.java → Customer Data Model (POJO)
│ ├── CustomerDAO.java → Data Access Object (Database CRUD)
│ └── DBConnection.java → Database Connection Utility
│
├── mysql-connector-j-9.3.0.jar → MySQL JDBC Driver
│
└── README.md → Project Documentation

Setup & Run Instructions:
Step 1: Prerequisites:
MySQL installed and running

MySQL Connector/J JDBC driver (mysql-connector-j-9.3.0.jar) placed in project root

Step 2: Database Setup:
Open MySQL and run the following commands:

pgsql
Copy
Edit
CREATE DATABASE customerdb;

USE customerdb;

CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(20),
    address VARCHAR(200),
    order_history VARCHAR(200)
);
Step 3: Update Database Credentials:
In DBConnection.java:

arduino
Copy
Edit
private static final String URL = "jdbc:mysql://localhost:3306/customerdb";
private static final String USER = "root";          // Your MySQL Username
private static final String PASSWORD = "password";  // Your MySQL Password
Step 4: Compile & Run:
In Command Prompt (from project root folder):

bash
Copy
Edit
javac -cp ".;mysql-connector-j-9.3.0.jar" -d . src/*.java

java -cp ".;mysql-connector-j-9.3.0.jar" CustomerApp
Sample Menu (Console Output):
pgsql
Copy
Edit
Customer Data Management System
1. Add Customer
2. View All Customers
3. Update Customer
4. Delete Customer
5. Exit
Future Enhancements:
Add a GUI (JavaFX or Swing)

Export Data to CSV/Excel

Add Search & Sort Features

Add User Authentication

Author:
Arsh Divya Arora

License:
This project is intended for educational purposes only.
