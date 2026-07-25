package com.eazybytes.ex2;


import com.eazybytes.ex2.beans.Vehicle;
import com.eazybytes.ex2.config.AnotherProjectConfig;
import com.eazybytes.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class  Example2 {
    static void main() {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh=context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle Name From Spring Context is " +veh.getName());

        var vehicle=(Vehicle)context.getBean("myFavoriteVehicle");
        System.out.println("Vehicle Name From Spring Context is " +vehicle.getName());

        var vhcle=context.getBean(Vehicle.class);
        System.out.println("Vehicle Name from Spring Context is: "+vhcle.getName());

        var helloWorld=context.getBean(String.class);
        System.out.println("String Value from Spring Context is: "+helloWorld);
    }
}