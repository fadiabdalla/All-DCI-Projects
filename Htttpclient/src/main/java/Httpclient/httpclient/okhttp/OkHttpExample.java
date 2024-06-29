package Httpclient.httpclient.okhttp;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;


// It supports async and synchronous http request
// It doesn't come with jdk.
// Supports connection pooling.
// Retrofit: this okhttp has an easy integration with retrofit

public class OkHttpExample {
   public static void main(String[] args) {

        // Create okhttp instance
        OkHttpClient client = new OkHttpClient();

        // Create request by specifying the url
        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/1") //GET request
                .build();

        try {

            // use the client to execute request synchronously
            Response response = client.newCall(request).execute();

            // Check if the request was successful(status code 200)

            if (response.isSuccessful()) {
                // getr the response body as a string
                ResponseBody body = response.body();
                if (body != null) {
                    String responseData = body.string();

                    System.out.println("response body");
                    System.out.println(responseData);
                }

            }
        } catch (IOException e) {
            System.out.println("Error while calling OkHttp" + e.getMessage());
        }
    }
}
