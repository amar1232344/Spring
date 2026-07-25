package com.eazybytes.ex4;


import com.eazybytes.ex4.beans.Car;
import com.eazybytes.ex4.beans.Engine;
import com.eazybytes.ex4.beans.Person;
import com.eazybytes.ex4.beans.Vehicle;
import com.eazybytes.ex4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class  Example4 {
    static void main() {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle=context.getBean(Vehicle.class);
        var person=context.getBean(Person.class);
        System.out.println("Vehicle Name From Spring Context is " +vehicle.getName());
        System.out.println("Person Name From Spring Context is " +person.getName());
        System.out.println("Vehicle That Person Own is " +person.getVehicle());

        var car=context.getBean(Car.class);
        var engine=context.getBean(Engine.class);
        System.out.println("Vehicle Name From Spring Context is " +car.getName());
        System.out.println("Engine Name From Spring Context is " +engine.getName());
        System.out.println("Engine  That Car Own is " +car.getEngine());
    }
}