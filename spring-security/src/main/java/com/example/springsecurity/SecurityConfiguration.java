package com.example.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(authorize -> authorize
//                        .requestMatchers("/secret/**").authenticated()
//                        .anyRequest().permitAll()
//                )
//                .httpBasic(Customizer.withDefaults())
//                .formLogin(Customizer.withDefaults());

       /* http.authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/index").permitAll()
                        .requestMatchers("/login").permitAll()
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults())
                .formLogin(form -> form.loginPage("/login"));
                //.formLogin(Customizer.withDefaults());
*/

        http.authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/gallery").hasRole("USER")
                        .requestMatchers("/contacts").hasRole("ADMIN")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults())
                .formLogin(form -> form.loginPage("/login"));

        return http.build();
    }


    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails peter = User.withDefaultPasswordEncoder()
                .username("peter")
                .password("123456")
                .roles("USER")
                .build();

        UserDetails jack = User.withDefaultPasswordEncoder()
                .username("jack")
                .password("12345678")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(peter, jack);
    }


}