package Httpclient.httpclient.retrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient{

    //define base url
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    // Create a field of type retrofit
    private static Retrofit retrofit;
    // Create a client method
    public static Retrofit getClient(){
        if(retrofit == null){

            retrofit= new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }



        return retrofit;
    }

}
