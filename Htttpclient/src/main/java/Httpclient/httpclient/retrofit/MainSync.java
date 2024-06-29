package Httpclient.httpclient.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class MainSync {
    public static void main(String[] args) {

        // Create instance of apiservice using retrofitclient

        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);




        try {
            // create a calL object to represent HTTP GET
            // request to retrieve user data

            Call<User> call = apiService.getUserByID(2);
            //synchronously execute http request and get response
            Response<User> response = call.execute();

            // check if response id successful(HTTP status code 2XX)
            if (response.isSuccessful()) {
                // Extract user object from response body
                User user = response.body();
                // print user details on console
                System.out.println("User ID: " + user.getId());
                System.out.println("User Name: " + user.getName());
                System.out.println("User Email: " + user.getEmail());
            }
            else {
                // print error message if the response not successful
                System.out.println("Error: " + response.errorBody());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
