package org.example.jdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JDBCcontroller {
    @GetMapping("/")
    public String jdbc() {
        return "Hello, this is a Java Database Connection try";
    }
}
