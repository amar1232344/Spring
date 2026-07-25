package com.eazybytes.ex4.config;


import com.eazybytes.ex4.beans.Person;
import com.eazybytes.ex4.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.eazybytes.ex4.beans"})
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        Vehicle vehicle=new Vehicle();
        vehicle.setName("Toyata");
        return vehicle;
    }

//    @Bean
//    Person person(){
//        Person person=new Person();
//        person.setName("Lucky");
//        person.setVehicle(vehicle());
//        return person;
//    }

    @Bean
    Person person(Vehicle vehicle){
        Person person=new Person();
        person.setName("Lucky");
        person.setVehicle(vehicle);
        return person;
    }
}
