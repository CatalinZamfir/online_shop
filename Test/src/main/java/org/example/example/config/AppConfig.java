package org.example.example.config;

import org.example.example.beans.Animal;
import org.example.example.beans.Dog;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("org.example")
public class AppConfig {

    @Bean("myDog")
    public Dog createMyDog3() {
        return new Dog();
    }

//    @Bean("myDog2")
//    public Dog createMyDog4() {
//        return new Dog();
//    }
    
    
}
