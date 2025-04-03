package com.example.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.time.LocalDateTime;

@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
    String hello(){
        return "hello lion";
    }

    @GetMapping("/hello")
    @ResponseBody
    String lion(){
        return "index.html";
    }

    @GetMapping("/data")
    @ResponseBody
    String data(){
        LocalDateTime now = LocalDateTime.now();
        return "Date: " + now.toLocalDate() + "<br>" + "Time: " + now.toLocalTime();

    }





}
