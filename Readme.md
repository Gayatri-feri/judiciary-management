

#  Abstract – Judiciary Management System (With Database Design)

The **Judiciary Management System** is a web-based application developed to simplify and digitize the management of judicial cases. Traditional judicial processes rely on manual record-keeping, which often leads to inefficiencies, delays, and difficulty in tracking case progress. This system provides a centralized platform to manage cases efficiently with improved accuracy and transparency.

The application is built using a full-stack approach, with **Spring Boot** for backend development, **HTML, CSS, JavaScript, and Thymeleaf** for the frontend, and **MySQL** as the database. It follows the **MVC (Model-View-Controller) architecture**, which separates the application into three layers: model (data), view (UI), and controller (logic), ensuring better maintainability and scalability.

The system supports multiple user roles such as **Judge, Lawyer, Clerk, and Client**, each having access to a role-specific dashboard. Users can perform core operations such as adding new cases, viewing case details, updating case information, and deleting records. The system also enables efficient tracking of case status and user interaction.

The **database design** plays a key role in the system. It consists of structured tables such as **User, Case, Hearing, Judgment, and Document**, where each table stores specific information related to judicial processes. Relationships are maintained using primary and foreign keys, such as the association between User and Case (one-to-many), and Case with Hearing, Judgment, and Document. This relational database design ensures data consistency, integrity, and efficient retrieval of information.

Additionally, the system utilizes **Spring Data JPA** for database operations and incorporates RESTful concepts for smooth data communication between frontend and backend. The user interface is responsive and user-friendly, enabling seamless usage across devices.

Overall, the Judiciary Management System enhances efficiency, reduces manual effort, and provides a scalable solution for managing judicial case workflows digitally.



## Project Overview

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

1.User logs into the system with role selection
2.System redirected to the dashboard
3.User Creates a new case by entering required details
4.case information is validated and stored in the database.
5.User retrives and views all case records.
6.user update or delkete recorsds when needed.
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
