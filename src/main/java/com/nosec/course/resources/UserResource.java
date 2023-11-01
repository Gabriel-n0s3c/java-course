package com.nosec.course.resources;

import com.nosec.course.entities.User;
import com.nosec.course.repositoires.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> getUsers(){

        User user = new User();
        return ResponseEntity.ok().body(userRepository.findAll());
    }


}
