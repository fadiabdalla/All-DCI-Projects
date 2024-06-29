package Httpclient.httpclient.okhttp;

import okhttp3.*;

import java.io.IOException;

public class OkHttpPostExample {
    public static void main(String[] args) {

        // Create okhttp instance
        OkHttpClient client = new OkHttpClient();

        // Create a resource
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        String jsonBody = "{\"title\": \"Sample Title\", \"body\": \"Sample Body\", \"userId\": 5}"; // Example JSON data

        RequestBody requestBody = RequestBody.create(mediaType, jsonBody);
        // Create request by specifying the url
        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts") //POST request
                .post(requestBody)
                .build();

        try {

            // use the client to execute request synchronously
            Response response = client.newCall(request).execute();

            // Check if the request was successful(status code 200)

            if (response.isSuccessful()) {
                System.out.println("Post Successful");
                System.out.println("Response Body: " + response.body().string());
                }
            else {
                System.out.println("Post Failed! Response Code: " + response.code());
            }


        } catch (IOException e) {
            System.out.println("Error while calling OkHttp" + e.getMessage());
        }
    }
}
