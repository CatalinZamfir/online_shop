package org.example;


import org.example.example.beans.Animal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("org.example")
@Configuration
//@SpringBootApplication
public class App {
    public static void main( String[] args ) {


//        Animal animal = new Animal();
//        Cat cat = new Cat();
//

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//        Animal mc = context.getBean(Animal.class);
//        mc.print("This is our message");

        SpringApplication.run(App.class,args);
        
    }



}
