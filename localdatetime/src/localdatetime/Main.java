package localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		String formattedDate = currentDateTime.now().format(formatter);
		System.out.println(formattedDate);
		
	}

}
