package localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	/*
	 * Locale - will help us store the language, country, etc... ResourceBundle -
	 * will fetch the files to the Locale object.
	 * 
	 */
	public static void main(String[] args) {
		String language = "en";
		String country = "US";

		Locale locale = new Locale(language, country);
		ResourceBundle rb = ResourceBundle.getBundle("localization/config", locale);

		String s = rb.getString("BirthdayMSG");

		System.out.println(s);
	}
}