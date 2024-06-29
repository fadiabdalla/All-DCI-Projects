package com.yourdomainname.SpringBootIntro;
import com.yourdomainname.SpringBootIntro.entity.CInstructor;
import com.yourdomainname.SpringBootIntro.entity.Instructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProgramingConfig {

    @Bean("tempConverter") // Specify custom bean ID
    public Instructor cInstructor (){
        return new CInstructor();
    }

}
