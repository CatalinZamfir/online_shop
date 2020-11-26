package com.sda.shop.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class SecurityController {

    private static final Logger logger = LoggerFactory.getLogger(SecurityController.class);

    public SecurityController() {
        logger.info(getClass().getSimpleName() + " created");
    }


}
