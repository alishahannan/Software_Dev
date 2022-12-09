package com.example.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;

public class ApiControllers {

    @GetMapping(value="/")
    public String getPage() {
        return "Hello World.";
    }
}
