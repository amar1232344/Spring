package com.eazybytes.ex5.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("espresso")
@Primary
public class Espresso implements Coffee{
    @Override
    public String makeCoffe() {
        return "Espresso Coffee";
    }
}
