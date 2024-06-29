package lambda_expression_temperature_conversion_exercise;

public class LambdaExercise {
	@FunctionalInterface
	interface TemperatureConversion {
		double convert(double temprature);
	}

	static double convertTemperature(double sourceTemprature, TemperatureConversion unit) {

		return unit.convert(sourceTemprature);
	}

	public static void main(String[] args) {

		TemperatureConversion toCelsius = temprature -> (temprature - 32) * 5 / 9;
		TemperatureConversion toFahrenheit = temprature -> (temprature * 9 / 5) + 32;

		System.out.println(convertTemperature(15, toFahrenheit) + "° Fahrenheit");
		System.out.println(convertTemperature(78, toCelsius) + "° Celsius");

	}

}
