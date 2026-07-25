package com.eazybytes.ex6.config;

import com.eazybytes.ex6.bean.Bike;
import com.eazybytes.ex6.bean.Engine;
import com.eazybytes.ex6.bean.Vehicle;
import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;

import java.util.Random;

public class MyBeanRegistrar implements BeanRegistrar {
    @Override
    public void register(BeanRegistry registry, Environment env) {
   int num=new Random().nextInt(100); //generate random Number
        System.out.println("Generate Number= "+num);
        if(num % 2 ==0)
        {
            System.out.println("EVEN ->  Registering  Engine + Vehicle ");
            registry.registerBean("engine", Engine.class, spec->spec.supplier(
                    context->{
                        Engine engine =new Engine();
                        engine.setName("V8 Turbo");
                        return engine;
                    }
            ));
            registry.registerBean("vehicle", Vehicle.class, spec->spec.supplier(
                    context->{
                        Vehicle vehicle =new Vehicle(context.bean(Engine.class));
                        vehicle.setName("Sports Cars");
                        return vehicle;
                    }
            ));
        }else{
            System.out.println("ODD ->  Registering  BIKE  ");

            registry.registerBean("bike",Bike.class,spec -> spec.supplier(
                    context -> {
                        Bike bike = new Bike();
                        bike.setName("Electric Bike");
                        return bike;
                    }
            ));
        }
    }
}
