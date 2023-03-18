package com.example.demoMongodb.controller;

import com.example.demoMongodb.entities.User;
import com.example.demoMongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * crea l'utente
     * @param user
     * @return
     */
    @PostMapping("")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    /**
     * trova tutti gli utenti
     * @return
     */
    @GetMapping
    public List<User> getUser(){
        return userRepository.findAll();
    }

    /**
     * trova l'utente per id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return userRepository.findById(id);
    }

    @PutMapping("/{id}")
    public User editUser(@PathVariable String id,@RequestBody User user){
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        userRepository.deleteById(id);
    }


}
