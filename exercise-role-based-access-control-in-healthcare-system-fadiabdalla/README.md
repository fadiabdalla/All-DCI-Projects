### Exercise: Role-Based Access Control in Healthcare System

#### Objective:
The objective of this exercise is to simulate the implementation of role-based access control within a healthcare system. You will learn how to manage user roles and restrict access to sensitive patient information based on those roles. Additionally, this exercise will emphasize the importance of secure password storage using bcrypt encryption.

#### Instructions:

1.	Database Setup:
    -	Set up a MySQL database named healthcare_db.
    -	Create tables for users, roles, and permissions with bcrypt encryption for passwords.
    -	Include tables for patient records, medical staff information, and appointments.
2.	Spring MVC Application:
    -	Develop controllers (PatientController.java, DoctorController.java) and security configuration (SecurityConfig.java).
    -	Implement methods for viewing patient records, scheduling appointments, and managing medical staff.
    -	Configure Spring Security to enforce role-based access control.
3.	HTML Templates:
    -	Create templates (home.html, patient-records.html, appointment-scheduler.html, staff-management.html, unauthorized.html) for different system pages.
    -	Customize templates to display content based on user roles and permissions.
4.	Functionality:
    -	Allow medical staff to view patient records, schedule appointments, and update patient information.
    -	Restrict access to sensitive patient data to authorized medical personnel only.
    -	Ensure that administrative functions like staff management are accessible only to users with appropriate roles.
