package java.curso.learn.learn.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class loginController{
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}