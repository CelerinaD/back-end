package com.sample.Beaches.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.Beaches.Model.UserModel;


@RestController
public class UserController {
    
@GetMapping("/User")
    public UserModel getUser(){
        return new UserModel(1, "Celerina", "Cele@gmail.com", "celechu");
    }
}
