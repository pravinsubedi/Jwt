package com.asterdio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 12/20/2016.
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "this is a test";
    }
}
