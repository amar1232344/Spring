package com.eazybytes.ex5;
import com.eazybytes.ex5.config.ProjectConfig;
import com.eazybytes.ex5.bean.Coffee;
import com.eazybytes.ex5.bean.CoffeeShop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    static void main() {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var coffeeShop= context.getBean(CoffeeShop.class);
        Coffee coffee= coffeeShop.getCoffee();
        System.out.print(coffee.makeCoffe());

    }
}