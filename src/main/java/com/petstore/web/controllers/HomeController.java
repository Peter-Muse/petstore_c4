package com.petstore.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


   @GetMapping("/welcome")
        public @ResponseBody String welcomeMessage(){

            return "Pet Store Application Running!! yeah!!";
        }

        @GetMapping("/")
        public String displayWelcomePage () {
            return "welcome";
        }

        @GetMapping("/home")
        public @ResponseBody String dashboardMessage() { return "Welcome to the dashboard";}
}
