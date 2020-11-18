package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class MyClass3 {
    @Autowired
    private MyClass2 myService;

    public MyClass3() {
        System.out.println(getClass().getSimpleName() + " created mc3");
    }
}
