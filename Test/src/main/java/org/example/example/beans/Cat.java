package org.example.example.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    

    public Cat() {
        System.out.println(getClass().getSimpleName() + " created myCat constructor");
    }
        
    public void print(String message) {
        System.out.println(getClass().getSimpleName() + " - " + message);
    }
}
