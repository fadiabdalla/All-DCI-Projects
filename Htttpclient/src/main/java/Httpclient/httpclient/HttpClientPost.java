package Httpclient.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientPost {


    public static void main(String[] args) {

        // create instance of httpclient

        HttpClient httpClient = HttpClient.newHttpClient();

        // define url of API to which I want to send request to
        String url = "https://jsonplaceholder.typicode.com/posts";

        // define json payload for new resource
        String jsonBody =  "{\"userId\": 1000, \"title\": \"New Post\", \"body\": \"New Post Body\"}";

        // create instance of httprequest with this url

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .headers("content-type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        try {

            // send http request and retrieve http response
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            // print status code and body of the response
            System.out.println("Status Code: " + httpResponse.statusCode());
            System.out.println("Body: " + httpResponse.body());

            // Get and print response headers
            HttpHeaders headers = httpResponse.headers();
            System.out.println("Response headers: ");
            headers.map().forEach((k, v) -> System.out.println(k + ": " + v));



        }catch (IOException | InterruptedException e){

            e.printStackTrace();
        }
    }
}
