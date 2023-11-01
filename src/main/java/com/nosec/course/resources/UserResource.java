package com.nosec.course.resources;

import com.nosec.course.entities.User;
import com.nosec.course.repositoires.UserRepository;
import com.nosec.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
         List<User> listUsers = userService.findAll();
        return ResponseEntity.ok().body(listUsers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){

        User user = userService.findByID(id);
        return ResponseEntity.ok().body(user);
    }


}
