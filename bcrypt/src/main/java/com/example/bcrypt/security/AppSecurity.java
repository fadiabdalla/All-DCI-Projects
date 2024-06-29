package com.example.bcrypt.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class AppSecurity {

    @Bean
    public UserDetailsManager userDetails(DataSource dataSource){

        JdbcUserDetailsManager userDetailsManager = new JdbcUserDetailsManager(dataSource);

        userDetailsManager.setUsersByUsernameQuery("select username, password, enabled from users where username=?");
        userDetailsManager.setAuthoritiesByUsernameQuery("select username, authority from authorities where username=?");


        return userDetailsManager;
    }

    @Bean
    public SecurityFilterChain filter(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(config -> config
                .requestMatchers("/").hasRole("HR")
                .requestMatchers("/supervisors/**").hasRole("SUPERVISOR")
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest()
                .authenticated()
        )
                .formLogin(form -> form.loginPage("/login")
                        .loginProcessingUrl("/authenticate")
                        .permitAll()
                )
                .logout(logout -> logout.permitAll()
                )
                .exceptionHandling(conf -> conf.accessDeniedPage("/unauthorized")

                );



        return http.build();
    }

}
