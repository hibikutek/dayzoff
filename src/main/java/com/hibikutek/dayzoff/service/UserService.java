package com.hibikutek.dayzoff.service;

import com.hibikutek.dayzoff.document.User;
import com.hibikutek.dayzoff.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository userRepository;
    public Flux<User> findAll() {
        return userRepository.findAll();
    }
}
