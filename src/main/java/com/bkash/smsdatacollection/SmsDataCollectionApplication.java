package com.bkash.smsdatacollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SmsDataCollectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsDataCollectionApplication.class, args);
    }

    @Controller
    public class HomeController{
        @GetMapping("/")
        @ResponseBody
        public  String index(){

            return "It works!";
        }
    }
}
