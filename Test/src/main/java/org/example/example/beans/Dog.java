package org.example.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog {

//    @Autowired
//    private Cat myCat;

    public Dog() {
        System.out.println(getClass().getSimpleName() + " created Dog constructor");
    }
    
    
}
