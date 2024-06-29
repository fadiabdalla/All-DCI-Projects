import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    private static final String API_KEY = "c5952d6fc8c10279377f3fd068a5ee36";

    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";

    public static String getWeatherData(String city) throws IOException {

        String url = String.format(API_URL, city, API_KEY);

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);

        }
        in.close();
        connection.disconnect();
        return response.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your city: ");
        String city = scanner.nextLine();
        scanner.close();

        try {
            String weatherData = getWeatherData(city);
            System.out.println("Weather data for: " + city + ": ");
            System.out.println(weatherData);
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}