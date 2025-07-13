# Employee Management System (JDBC - Statement)

## 📋 Description
This is a simple Java-based console application that performs CRUD (Create, Read, Update, Delete) operations on employee records using **JDBC** and the **Statement** interface. The application follows a modular architecture with proper separation of concerns: Controller, Service, DAO, and Model layers.

## 🧩 Technologies Used
- Java
- JDBC (Statement)
- MySQL
- Eclipse IDE (or any Java IDE)

## 🧱 Project Structure
```
com.employee
├── controller
│ └── EmployeeController.java
├── dao
│ └── EmployeeDao.java
├── model
│ └── Employee.java
├── service
│ └── EmployeeService.java
```

## 📁 Database Table Structure

```sql
CREATE TABLE employee (
  empId INT PRIMARY KEY,
  empName VARCHAR(100),
  salary DOUBLE,
  dept VARCHAR(100),
  mobNo VARCHAR(15),
  gender VARCHAR(10),
  date_of_birth DATE
);
```
✅ Features
Add a new employee

View all employees

Update employee details

Delete an employee by ID

Search employee by ID

🚀 How to Run
Clone the repository.

Set up the MySQL database and create the employee table as above.

Update the DB credentials in your JDBC connection (if needed).

Compile and run ```EmployeeController.java.```

🧑‍💻 Author
Payal Yadav
GitHub Profile
