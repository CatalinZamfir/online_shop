package org.example;

import org.example.beans.MyClass1;
import org.example.beans.MyClass2;
import org.example.beans.MyClass3;
import org.example.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan("org.example")
//@SpringBootApplication
public class App {
    public static void main(String[] args) {

//        MyClass1 myClass1 = new MyClass1();
//        MyClass2 myClass2 = new MyClass2();
//        myClass1.setMyClass2(myClass2);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//
//        MyClass1 mc = context.getBean("myClass1", MyClass1.class);
//        mc.print("This is our message");

       SpringApplication.run(AppConfig.class,args);
    }



}
