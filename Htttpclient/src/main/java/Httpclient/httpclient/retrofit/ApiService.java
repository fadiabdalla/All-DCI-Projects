package Httpclient.httpclient.retrofit;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {

    // Make a GET request
    @GET("users/{userId}")
   Call<User> getUserByID(@Path("userId") int userid);

    // Make a POST request
    @POST("users")
    Call<User> createUser(@Body User user);
}
