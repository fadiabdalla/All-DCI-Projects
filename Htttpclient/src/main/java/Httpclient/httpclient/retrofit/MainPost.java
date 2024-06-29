package Httpclient.httpclient.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPost {

    public static void main(String[] args) {

        // Create instance of apiservice using retrofitclient

        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);


        // create a calL object to represent HTTP GET
        // request to retrieve user data

        User user = new User();
        user.setId(2);
        user.setName("Fadi");
        user.setEmail("fadi@gmail.com");
        Call<User> call = apiService.createUser(user);


        //asynchronously enqueue the HTTP request and define call back for success and failure
        call.enqueue(new Callback<User>() {
            @Override
            // this callback method is called when you have successful http request
            public void onResponse(Call<User> call, Response<User> response) {
                // check if response id successful(HTTP status code 2XX)
                if (response.isSuccessful()) {
                    // Extract user object from response body
                    User createdUser = response.body();
                    // print user details on console
                    System.out.println("User ID: " + createdUser.getId());
                    System.out.println("User Name: " + createdUser.getName());
                    System.out.println("User Email: " + createdUser.getEmail());
                }
                else {
                    // print error message if the response not successful
                    System.out.println("Error: " + response.errorBody());
                }
            }

            @Override
            // callback method when http request fails
            public void onFailure(Call<User> call, Throwable throwable) {
                //error due to network issue while http call for eg. timeout error
                throwable.printStackTrace();

            }
        });

    }
}
