package localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // Get the current date
        LocalDate date = LocalDate.now();

        // Calculate yesterday and tomorrow dates
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(1);

        // Print the current, yesterday, and tomorrow dates
        System.out.println("Today's date : " + date);
        System.out.println("Yesterday's date : " + yesterday);
        System.out.println("Tomorrow's date : " + tomorrow);

        // Create a specific date, February 24, 2020
        LocalDate date1 = LocalDate.of(2020, 2, 24);

        // Check if date1 is a leap year and print the result
        System.out.println(date1.isLeapYear());

        // Create a specific date, September 1, 2023
        LocalDate date2 = LocalDate.of(2023, 9, 1);

        // Create a LocalDateTime from date2 with a specific time
        LocalDateTime dateTime = date2.atTime(1, 43, 8);

        // Print the LocalDateTime
        System.out.println(dateTime);

        // Get the current date again
        LocalDate date3 = LocalDate.now();

        // Format date3 as a string in ISO date format and print it
        String convertedToString = date3.format(DateTimeFormatter.ISO_DATE);
        System.out.println(convertedToString);

        // Parse a string into a LocalDate
        String stringDate = "2020-08-02";
        LocalDate date4 = LocalDate.parse(stringDate);
        System.out.println("String to LocalDate: " + date4);
        
        // Check if a date is after another date
        
        LocalDate date5 = LocalDate.parse("2023-05-23");
        LocalDate date6 = LocalDate.parse("2023-05-29");
        System.out.println(date5.isAfter(date6));
        
    }
}
