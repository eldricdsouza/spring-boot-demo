package com.eltek.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("welcome")
public class LoginController {

    @GetMapping(value = "/{userId}", produces = "application/json")
    public String loginUser(@PathVariable String userId) {
        System.out.println("Logged user:" + userId);
        return HttpStatus.ACCEPTED.toString();
    }
}
