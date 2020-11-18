package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class MyClass1 {
    //@Autowired
    private MyClass2 myService;

    @Autowired
    private MyClass3 dbConnection1;

    @Autowired
    private MyClass3 dbConnection2;

    @Autowired
    public MyClass1(MyClass2 myService) {
        this.myService = myService;
        System.out.println(getClass().getSimpleName() + " created mc1");
    }

    public void setMyClass2(MyClass2 myClass2) {
        this.myService = myClass2;
    }

    public void print(String message) {
        System.out.println(message);
        this.myService.print(message);
    }
}
