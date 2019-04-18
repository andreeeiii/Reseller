package com.reseller.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping(path = "/admin")
    public String getAdmin() {
        return "admin";
    }
}
