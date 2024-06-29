## Exercise: Create a Spring Application with Spring Initializr

### Objective: Facilitating Learning of Spring Framework

### Instructions:

1. Visit the Spring Initializr website
    -	Configure the project with the necessary dependencies, including Spring Web.
    -	Set the project metadata and download the generated project.
2. Configure Port to 8080
3. Create REST Controller:
    -	Create a new Java class for the REST controller.
    -	Implement four different endpoints, each serving a distinct purpose.
    -	Set the base path for each endpoint to /java
4. Set a timeout session
    -	Default HTTP session timeout should be 30 min
5. Customize the information in your info endpoint:
    -	Your application name should be: Wellness app
    -	Use the following description for your application: This app keeps track of your daily healthy   activities.
    -	It should have the version 2.0.0
6. Expose all the actuator endpoints except mapping, info
7. Implement Automatic Reload.
