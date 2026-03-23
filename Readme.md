# ⚖️ Judiciary Management System

## 📌 Project Overview

The **Judiciary Management System** is a web-based application developed to simplify and digitize the process of managing judicial cases.
It replaces traditional manual record-keeping with a structured digital system that allows users to efficiently add, view, update, and delete case records.

---

## 🎯 Objectives

* To digitize case management
* To reduce manual paperwork
* To provide easy tracking of case status
* To maintain structured and organized data
* To improve efficiency and transparency

---

## 🧑‍💻 Technologies Used

### 🔹 Frontend

* HTML5
* CSS3
* JavaScript
* Thymeleaf

### 🔹 Backend

* Java
* Spring Boot (MVC Architecture)

### 🔹 Database

* MySQL

### 🔹 Tools

* Eclipse IDE
* Maven

---

## 🏗️ System Architecture

The system follows **MVC (Model-View-Controller)** architecture:

* **Model (Entity Layer)** → Represents database tables (User, Case)
* **View Layer** → UI pages (HTML, Thymeleaf)
* **Controller Layer** → Handles requests and responses
* **Repository Layer** → Interacts with database using JPA

---

## 🔐 Features

### 🔹 Login System

* User authentication using email and password
* Redirect to dashboard after successful login

---

### 🔹 Dashboard

* Add new case
* Select case type and description
* Enter user name manually
* Set case status

---

### 🔹 Case Management

* ➕ Add Case
* 👁 View Cases
* ✏ Edit Case
* ❌ Delete Case

---

## 🔄 Workflow

1. User logs in
2. Dashboard opens
3. User adds a case
4. Case is stored in database
5. User views all cases
6. User edits or deletes cases

---

## 🗄️ Database Design

### USER Table

* id (Primary Key)
* name
* role

### CASE Table

* caseId (Primary Key)
* caseType
* description
* status
* user_name
* user_id (Foreign Key)

---

## 🔗 Relationship

* One User → Many Cases (1 : *)
* Implemented using `user_id` as foreign key

---

## 🎨 UI Features

* Dropdown-based selection
* Dynamic description generation
* Popup edit form
* Responsive design
* Clean and simple interface

---

## 🚀 Advantages

* Reduces manual work
* Easy to maintain and use
* Fast data retrieval
* Organized case tracking

---

## 🔮 Future Enhancements

* Role-based access (Admin, Judge, Lawyer)
* Search and filter functionality
* File/document upload
* Email notifications
* Analytics dashboard

---

## ✅ Conclusion

The Judiciary Management System demonstrates a complete **full-stack application** using Spring Boot and MySQL.
It successfully implements CRUD operations and provides an efficient solution for managing judicial cases digitally.

---

## 🙌 Author

Developed as part of MCA project to demonstrate full-stack development skills and real-world problem solving.
