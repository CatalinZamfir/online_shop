package org.example.controller;

import org.example.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    public UserController() {
        logger.info(getClass().getSimpleName() + " created");
    }

    @GetMapping("/")
    public String getFrontPage(){
        return "index";
    }

    @GetMapping("/users")
    public ModelAndView getUsers(){
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("myName", "Catalin");
        modelAndView.addObject("userList",userRepository.findAll());
        return modelAndView;
    }




}
