package localtime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {

		//Getting current time
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// Specifying our own time
		LocalTime time1 = LocalTime.of(11, 45, 30);
		System.out.println(time1);
		
		// Substract hours and minutes
		LocalTime time2 = time1.minusHours(1);
		LocalTime time3 = time2.minusMinutes(10);
		System.out.println(time3);
		
		// Add hours and minutes
		LocalTime time4 = time1.plusHours(1);
		LocalTime time5 = time4.plusMinutes(10);
		System.out.println(time5);
		
		//Time Zones
		ZoneId zone1 = ZoneId.of("Europe/London");
		
		LocalTime time6 = LocalTime.now(zone1);
		System.out.println(time6);
		
		// Get Zone Id
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone.getZone());
		
		
	}

}
