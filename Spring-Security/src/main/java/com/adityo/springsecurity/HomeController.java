package com.adityo.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return  "This is HomePage";
    }

    @GetMapping("/admin")
    public String admin(){
        return  "This is AdminPage";
    }
}
