package com.aviva.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DSOUZAE on 21/03/2021.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("/updateUser/userId/{userId}")
    public void updateUser(@RequestParam String userId) {
        System.out.println("Updating user details for user=" + userId);
    }
}

