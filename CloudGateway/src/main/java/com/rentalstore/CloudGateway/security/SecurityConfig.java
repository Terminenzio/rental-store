package com.rentalstore.CloudGateway.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        return http
                .csrf(ServerHttpSecurity.CsrfSpec::disable) // Disabilita CSRF
                .authorizeExchange(exchanges -> exchanges
                        .anyExchange().authenticated() // Richiede login per tutto
                )
                .httpBasic(basic -> {})       // Abilita basic auth
                .formLogin(form -> {})        // Abilita login form
                .build();
    }
}
