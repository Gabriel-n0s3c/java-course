package com.nosec.course.services;

import com.nosec.course.entities.User;
import com.nosec.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findByID(Long id){
        return userRepository.findById(id).get();
    }


}
