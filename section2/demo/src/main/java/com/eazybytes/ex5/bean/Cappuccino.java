package com.eazybytes.ex5.bean;

import org.springframework.stereotype.Component;

@Component("cappuccino") //bean name by default is class name but if add then this is bean name
public class Cappuccino implements Coffee{
    @Override
    public String makeCoffe() {
        return "Cappuccino Coffee";
    }
}
