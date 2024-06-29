package localization_example;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	public static void greetInLocalLanguage(Locale locale) {
		
		ResourceBundle messages = ResourceBundle.getBundle("localization_example/messages", locale);
		
		String greeting = messages.getString("greeting");
		
		System.out.println(greeting);
		
		
	}
	public static void main(String[] args) {
		
		Locale english = new Locale("en", "US");
		Locale spanish = new Locale("es", "ES");
		Locale german = new Locale("ge", "GE");
		
		greetInLocalLanguage(english);
		greetInLocalLanguage(spanish);
		greetInLocalLanguage(german);
	}
}
