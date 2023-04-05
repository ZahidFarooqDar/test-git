package com.example.simpleApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CatController {

    @GetMapping(value = "/cat" )
    public String getCat(){
        return "this is cat controller";
    }
}
