package com.example.SecurityTest.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@AllArgsConstructor
public class MainController {

    @GetMapping("/unsecured")
    public String homePage() {
        return "home";
    }

    @GetMapping("/secured")
    public String securedPart() {
        return "secured";
    }

    @GetMapping("/admin")
    public String adminData() {
        return "Admin data";
    }

    @GetMapping("/info")
    public String authPart(Principal principal) {
        return "Hello: " + principal.getName();
    }
}
