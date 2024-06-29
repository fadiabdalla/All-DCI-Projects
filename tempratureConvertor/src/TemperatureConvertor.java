import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {

        TemperatureConvertor convertor = new TemperatureConvertor();

        convertor.convertToFahrenheit();

    }

    void convertToFahrenheit (){
        System.out.println("Enter the temperature in Celsius :");
        Scanner scanner = new Scanner(System.in);
        double cel = scanner.nextDouble();
        double fah = (cel * 9/5) + 32;
        System.out.println("the temperature in Fahrenheit is : " + fah);

    }
}