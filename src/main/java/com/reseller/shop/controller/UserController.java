package com.reseller.shop.controller;

import com.reseller.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user")
    public String hello() {
        return "user";
    }
}
