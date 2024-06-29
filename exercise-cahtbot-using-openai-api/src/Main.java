import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    private static final String URL = "https://api.openai.com/v1/chat/completions";
    private static final String API_KEY = "OpenAI-APIKEY";
    private static final String MODEL = "gpt-3.5-turbo";

    public static void chatGPT(String message) {


        try {
            // Create Http post request
            URL obj = new URL(URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Authorization", "Bearer " + API_KEY);
            con.setRequestProperty("Content-Type", "application/json");

            // Build the request body
            String body = "{\"model\": \"" + MODEL + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + message + "\"}]}";
            con.setDoOutput(true);

            try (OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream())) {
                writer.write(body);
            }

            // Get the response
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                // Parse and format the API response
                JSONObject jsonResponse = new JSONObject(response.toString());
                JSONArray choices = jsonResponse.getJSONArray("choices");
                JSONObject choice = choices.getJSONObject(0);
                JSONObject messageObject = choice.getJSONObject("message");
                String assistantMessage = messageObject.getString("content");

                System.out.println("Assistant: " + assistantMessage);
            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.println("Assistant: Hello! How can I assist you today?");
        System.out.println("You can type 'exit' to stop chatting.");

        do {
            System.out.println("---------------------------");
            System.out.println("You: ");
            userInput = scanner.nextLine();
            chatGPT(userInput);
        } while (!userInput.equalsIgnoreCase("exit"));

        System.out.println("Goodbye! Have a great day.");
    }
}
