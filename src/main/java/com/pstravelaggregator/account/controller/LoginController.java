package com.pstravelaggregator.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class LoginController {

    @GetMapping("/login")
    public String getLoginDetails(){
        return "Hello";
    }
}
