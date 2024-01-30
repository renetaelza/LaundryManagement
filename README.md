# Laundry Management System

The project focuses on a case study of Laundry Dee Kilos, aiming to provide an effective solution for the admin to manage transactions and deliveries at the laundry. The desktop application is implemented using the Java programming language, with full integration with an SQL database that is fully integrated with the laundry system.

The application is designed to improve efficiency, ease of use, and tracking of transaction processes. The main advantage of this program lies in its comprehensive integration with the laundry database. Every administrative action such as adding, changing, or deleting data will automatically be reflected in the database, providing high reliability and accuracy in the laundry system.

Furthermore, this program has been implemented using Java Swing, making it easier for the admin to manage data with a more intuitive graphical interface. The use of Java Swing also provides an additional advantage, namely a more attractive interface compared to the command-line interface. This not only increases efficiency but also provides a more enjoyable and modern user experience in managing transactions and deliveries at Laundry Dee Kilos.

A. FILE SRUCTURE

This project contains 7 packages:
1. pojo package: Contains all variables and setter-getter methods needed in each class or entity.

2. repository package: Contains two interfaces:
AkunRepository: Interface used for login and registration.
CrudRepository: Interface used for all CRUD operations including searching.

3. service package: Contains interfaces that extend the repository package according to their functionalities. For example:
AdminService: Extends AkunRepository.
PelangganService and KaryawanService: Extend CrudRepository as pelanggan and karyawan have operations just for CRUD.

4. serviceimpl package: Contains all implementations or logic needed for each entity according to their functionalities.

5. utilities package: Contains the logic to connect to the SQL database. This database will store all data including when there are changes such as create, update, or delete data, it will be updated automatically in the database.

6. view package: Contains logic or code to verify if all packages are running smoothly before being implemented with Swing.

7. swing package: Contains all Swing interfaces for each functionality, making it easier for the admin to manage data with a more attractive interface compared to the command-line interface. This not only increases efficiency but also provides a more enjoyable and modern user experience in managing transactions and deliveries at Laundry Dee Kilos.


B. FEATURES

1. Login and Registration: Secure authentication for admin through registration and login functionalities.
2. CRUD Operations for Admin Data
3. CRUD Operations for Karyawan Data
4. CRUD Operations for Pelanggan Data
5. CRUD Operations for Layanan Data, consists of data like service cuci kering, cuci saja, cuci setrika, etc.
6. CRUD Operations for Transaksi Data, consists of transaction data including transaction date, user information, and more details like total weight of laundry, etc.
7. CRUD Operations for Delivery Data, consists of pelanggan's data that registered for delivery.





