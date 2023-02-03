package com.hibikutek.dayzoff.controller;

import com.hibikutek.dayzoff.document.User;
import com.hibikutek.dayzoff.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController{
    private UserService userService;

    @GetMapping
    public Flux<User> getAllUsers() {
        return userService.findAll();
    }
}
