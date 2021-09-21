package com.eltek.controllers.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("deleteUser")
public class DeleteController {

    @GetMapping(value = "/{userId}", produces = "application/json")
    public void deleteUser(@PathVariable int userId) {
        System.out.println("Delete user" + userId) ;
    }
}
