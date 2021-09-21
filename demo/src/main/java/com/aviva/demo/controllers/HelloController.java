package com.aviva.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DSOUZAE on 21/03/2021.
 */
@RestController
@RequestMapping("demo")
public class HelloController {

    @RequestMapping("/greeting")
    public String getGreetings() {
        return "HELLO WORLD FROM SPRING BOOT";
    }

    @RequestMapping("/login")
    public String loginUser(@RequestParam String user) {
        return "User has successfully logged in " +
                user;
    }

}

