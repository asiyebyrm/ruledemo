package org.england.ruledemo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // CSRF'yi devre dışı bırakmanın yeni yolu
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/public/**").permitAll()  // Belirli yolları serbest bırak
                        .requestMatchers("/start-process").permitAll()  // Belirli yolları serbest bırak
                        .requestMatchers("/flowable/**").permitAll() // Flowable URL'lerine erişimi açın


                        .anyRequest().authenticated()  // Diğer tüm yolları koruma altında tut
                );
        return http.build();
    }
}
