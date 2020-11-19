package org.example.controllers;

import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestApiController {

    @Autowired
    private UserRepository userRepository;



    @GetMapping("/api/users")
    public ResponseEntity<List<UserEntity>> getAllUsers(){
        //return userRepository.findAll();
        return  ResponseEntity.status(205).body(userRepository.findAll());
    }

    @PostMapping("/api/users")
    public String saveUser(@RequestBody UserEntity userEntity){
        userRepository.save(userEntity);
        return "OK";
    }


}
