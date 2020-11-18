package org.example.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Animal {
    @Autowired
    private Cat myCat;

    @Autowired
    private Dog myDog;

 
    @Autowired
    public Animal(Cat myCat, Dog myDog) {
        this.myCat = myCat;
        this.myDog = myDog;
        System.out.println(getClass().getSimpleName() + " created Animal constructor");
    }

   
    public void setMyCat(Cat myCat) {
        this.myCat = myCat;
    }

    public void print(String message) {
        System.out.println(message);
        this.myCat.print(message);
    }
}
