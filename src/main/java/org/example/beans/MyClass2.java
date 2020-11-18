package org.example.beans;

import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("myService")
//@Scope("prototype")
public class MyClass2 {
    private static final Logger logger = LoggerFactory.getLogger(MyClass2.class);

    /* DEBUG
       INFO
       WARN
       ERROR
     */

    @Autowired
    private UserRepository userRepository;

    public MyClass2() {
        System.out.println(getClass().getSimpleName() + " created mc 2");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
    }


    public void print(String message) {
        System.out.println(getClass().getSimpleName() + " - " + message);
    }


    @Autowired
    public void testEntity(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName("SDA1");
     //   userRepository.save(userEntity);
        List<UserEntity> entityList = userRepository.getByName("SDA1");
        for(UserEntity u: entityList){
            System.out.println(u.getName());
        }
    }
}
