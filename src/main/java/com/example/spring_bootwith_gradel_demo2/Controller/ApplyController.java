package com.example.spring_bootwith_gradel_demo2.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplyController {
    public String getmessage(){
        return "hi welcome to the world";
    }
}
