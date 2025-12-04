package com.paypal.reward_service.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());  // For LocalDateTime support
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); // IMPORTANT
        return mapper;
    }
}

//for local date and time support.
//we use this configuration to ensure that our application can correctly serialize and deserialize Java 8 date and time types, such as LocalDateTime, when working with JSON data. This is particularly important for maintaining the integrity of date and time information in our reward service.