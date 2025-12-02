package com.paypal.transaction_service.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Configuration;

import java.lang.runtime.ObjectMethods;
//help in serializing and deserializing of kafka message  in JSON format so other services can read it
@Configuration
public class JacksonConfig {

    public ObjectMapper objectMapper(){
        ObjectMapper mapper=new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS);
        return mapper;
    }

}
