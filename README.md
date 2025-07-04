# 🧾 ProductCustomer - Java Swing + MySQL Desktop Application

A Java-based desktop application built using **Java Swing** and **MySQL**, designed for managing Products and Customers with **Add** and **Delete** functionalities in a clean, user-friendly interface.

---



*COMPANY*: Main Flow Services and Technologies Pvt. Ltd. 

*NAME* : shiva kasula

*INTERN ID* : 17203

*DOMAIN* : Full Stack Web Development

*DURATION* : 8WEEKS

---



## 🛠️ Technologies Used

- Java (JDK 24)
- Java Swing (NetBeans GUI Builder)
- MySQL (via XAMPP)
- JDBC (MySQL Connector/J)
- NetBeans IDE
- Git & GitHub

---

## 🚀 Features

### 📦 Product Management
- Add Product with fields: Name, Category, Price, Quantity, Description
- Delete Product by ID
- Validations and input checks
- Auto-clear form after actions

### 👤 Customer Management
- Add Customer with fields: Name, Gender (Male/Female/Other), Email, Phone, Address
- Delete Customer by ID
- Search customer by ID before deletion
- Read-only fields to avoid accidental edits
- Separate forms for Add and Delete actions

---

## 🧪 How to Run the Project

### 1. **Clone the repository:**
```bash
git clone https://github.com/shivakasula48/ProductCustomer.git
```
Or download the ZIP file from GitHub and extract it to a folder.


### 2. **Open the Project in NetBeans**

1.Open NetBeans IDE

2.Go to: ` File → Open Project `

3.Navigate to the folder where the project is cloned or extracted

4.Select the folder ` ProductCustomer ` and click Open



### 3. **Start MySQL Server (via XAMPP)**

1.Open XAMPP Control Panel

2.Click Start next to MySQL

3.Open your browser and go to: `http://localhost/phpmyadmin`






  ### 4. **Create Database and Tables**

  
In phpMyAdmin, run the following SQL script:


```sql
CREATE DATABASE testdb;
USE testdb;

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    category VARCHAR(255),
    price DOUBLE,
    quantity INT,
    description TEXT
);

CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    gender VARCHAR(10),
    email VARCHAR(255),
    phone VARCHAR(15),
    address TEXT
);
```






### 5. **Add MySQL Connector to the Project**

1.Download the JAR: `https://dev.mysql.com/downloads/connector/j/`

2.In NetBeans:

  - Right-click your project → Properties

  - Go to Libraries → Compile

  - Click Add JAR/Folder

  - Select the downloaded `mysql-connector-j-8.x.xx.jar` file

  

### 6. **Run the Application**
Run these main files depending on your need:

  - `AddAndDeleteProducts.java` → For Product Add/Delete

  - `AddCustomer.java` → To Add a Customer

  - `CustomerDelete.java` → To Delete a Customer

👉 Right-click the file in Projects pane → Click Run File

---

✅ That's It! You're Done 🎉
Your desktop application is now live and connected to your local MySQL database.

You can now:

  - Add Products and Customers

  - Delete Customers and Products

  - Perform all actions via a clean GUI

---
## OutPut


<img width="334" alt="Image" src="https://github.com/user-attachments/assets/fc804caa-0591-4cd2-8dd8-823d01cb2f0f" />

<img width="349" alt="Image" src="https://github.com/user-attachments/assets/daf57a48-874c-46ed-ab9b-482ba7667546" />

<img width="344" alt="Image" src="https://github.com/user-attachments/assets/14a2a75a-5cef-4e21-9adc-692a0bf163d5" />

<img width="347" alt="Image" src="https://github.com/user-attachments/assets/201773f5-9c27-4031-8394-bc7b9135827f" />




# 👨‍💻 Author
Kasula Shiva

B.Tech CSE Cybersecurity

Sir Padampat Singhania University, Udaipur

GitHub: `https://github.com/shivakasula48`


# License

This project is open-source and free to use by anyone for personal or educational purposes.  
Feel free to modify, distribute, and use the code as long as proper credit is given to the original author, **Kasula Shiva**.





