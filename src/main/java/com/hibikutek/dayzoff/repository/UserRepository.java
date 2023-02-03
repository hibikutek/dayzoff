package com.hibikutek.dayzoff.repository;

import com.hibikutek.dayzoff.document.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

}
