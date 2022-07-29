package com.example.Tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hallo")
    public String helloWorld() {
        return "Hallo Welt!";
    }
}
