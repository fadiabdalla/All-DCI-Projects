package Httpclient.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample1 {

    public static void main(String[] args) {

        // create instance of httpclient

        HttpClient httpClient = HttpClient.newHttpClient();

        // define url of API to which I want to send request to
        String url = "https://jsonplaceholder.typicode.com/users/1";
        String url1 = "https://www.facebook.com";

        // create instance of httprequest with this url

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(url1))
                .GET()
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
