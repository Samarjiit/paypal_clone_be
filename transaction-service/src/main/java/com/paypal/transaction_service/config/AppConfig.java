package com.paypal.transaction_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//this class is used to create a bean of RestTemplate to be used in other classes and call other services using http requests
@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(){return new RestTemplate();}
}
