### Exercise: Creating a Job Application Form with Required Fields using Spring MVC

#### Objective: 
To practice creating a job application form with required fields using Spring MVC framework.

#### Scenario: 
You are developing a job application feature for a job portal website. The job application form should include fields for the applicant's name, email, address, phone number, job position, and a cover letter. All fields except the cover letter are required.

#### Instructions:
1.	Set up a basic Spring MVC project with Maven or Gradle.
2.	Create a job application form with the following required fields:
    -	Name (text field)
    -	Email (text field)
    -	Address (text field)
    -	Phone number (text field)
    -	Job Position (drop-down menu)
    -	Job Location (radio box)
    -	Cover Letter (text area)
3.	Set up a controller to handle the form submission and process the user input.
4.	Use Spring MVC to validate the required fields and display appropriate error messages.
5.	Display the submitted job application details on a confirmation page if the form is successfully submitted.

#### HINT
For text area use can you the following tag:
``` <textarea rows=”15” cols=”30” th:field=”*{coverLetter}”></textarea> ```
