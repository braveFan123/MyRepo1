package com.mrfan.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/RequestTest")
public class RequestTestController {
    public String TestString(){
        return "now is"+ new Date().toString();
    }
}
