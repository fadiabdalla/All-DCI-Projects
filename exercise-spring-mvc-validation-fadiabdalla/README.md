### Exercise: Building a Hotel Reservation Form with Validation in Spring MVC

#### Objective:
To practice creating a hotel reservation form with validation in Spring MVC framework.

#### Scenario:
You should develop a hotel reservation feature for a hotel booking website. The reservation form should collect detailed information about the guest, check-in/out dates, preferred room type, and additional preferences.

#### Instructions:
1.	Set up a basic Spring MVC project with Maven or Gradle.
2.	Create a hotel reservation form with the following fields:
   
    •	Guest Information:
  	
    -	Name (text field)
    -	Email (text field)
    -	Phone Number (text field)
      
    •	Reservation Details:

    -	Check-in Date (date field)
    -	Check-out Date (date field)
    -	Room Type (drop-down menu)
      
    •	Additional Preferences:
  	
    -	Smoking Preference (radio buttons: Yes/No)
    -	Breakfast Included (checkbox)
    -	Late Check-out (checkbox)
      
    •	Terms and Conditions:
  	
    -	Agree to Terms (checkbox)
      
4.	Implement validation to make certain fields required.
5.	Set up a controller to handle the form submission and process the hotel reservation.
6.	Display appropriate error messages if validation fails.
7.	Display the submitted reservation details on a confirmation page if the form is successfully submitted.

#### HINTS
- Declare the date variables as follows:
- private LocalDate checkInDate;
- To show the dates on HTML file use can you the following tag:
``` <input type=”date” th:field=”*{checkInDate}”/> ```
