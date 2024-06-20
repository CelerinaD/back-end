package com.sample.Beaches.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.Beaches.Model.UserModel;




@RestController
public class UserController {
    
    // http:localhost:8080/user
    @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1, "Celerina", "Cele@gmail.com", "celechu");
    }

    public String getMethodName(@RequestParam String param){
        return new String();
    }

    // http:localhost:8080/users
    @GetMapping("/users")
    public List<UserModel> getUsers(){
        List <UserModel> users= new ArrayList<>();
        users.add(new UserModel(1, "Mario", "mario@gmail.com", "mario"));
        users.add(new UserModel(2, "Luigi", "luigi@gmail.com", "luigi"));
        users.add(new UserModel(3, "Yoshi", "yoshi@gmail.com", "yoshi"));
        return users;
    }

    // http:localhost:8080/user/juan
    @GetMapping ("/user/{name}")
    public UserModel getUserFromName(@PathVariable("name")String name){
        return new UserModel(1, "Juan", "juan@gmail.com", "juan");
    }

}
