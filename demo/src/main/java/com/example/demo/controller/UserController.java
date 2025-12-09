package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.usersDto.CreateUsersDto;
import com.example.demo.entity.User;
import com.example.demo.services.UserService;

import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import java.net.URI;


// apí controller
@RestController
@RequestMapping("/v1/users")
public class UserController {

    // injetando o servico de usuario
    private UserService userService;
    
    // construtor para injetar o servico de usuario
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // endpoint para criar um novo usuario
    @PostMapping // metodo post
    public ResponseEntity<User> createUser(@RequestBody CreateUsersDto createUsersDto) { // aqui eu recebo o dto como corpo da requisicao
        var userId = userService.createUser(createUsersDto); // chamando o servico para criar o usuario
        return ResponseEntity.created(URI.create("/v1/users/" + userId.toString())).build(); 
    }

    // @GetMapping("/{userId}")
    // public ResponseEntity<User> getUserById(@PathVariable("userId") String userId) {
    //     // Logic to get a user by ID
    // }

    // @PutMapping
    // public ResponseEntity<User> createUser(@RequestBody User user) {
    //     // Logic to create a new user
    // }

    // @DeleteMapping
    // public ResponseEntity<User> createUser(@RequestBody User user) {
    //     // Logic to create a new user
    // }
}
