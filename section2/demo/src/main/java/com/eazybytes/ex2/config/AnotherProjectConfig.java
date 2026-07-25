package com.eazybytes.ex2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherProjectConfig {

    @Bean
    String helloWorld(){
        return "Hello World";
    }

    Integer luckyNumber()
    {
        return 16;
    }

}
