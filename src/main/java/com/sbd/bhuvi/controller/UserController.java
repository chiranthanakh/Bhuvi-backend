package com.sbd.bhuvi.controller;

import com.sbd.bhuvi.dto.UserDto;
import com.sbd.bhuvi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    //add user REST API
    @PostMapping("adduser")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
       UserDto savedUser = userService.createUser(userDto);
        return new ResponseEntity<>(savedUser , HttpStatus.CREATED);
    }

    //Get user REST API
    @GetMapping("get/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId){
       UserDto userDto = userService.getUserById(userId);
       return ResponseEntity.ok(userDto);
    }

    //Get all users REST API
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    //update user REST API
    @PutMapping("putuers/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId,
                                              @RequestBody UserDto updatedUser){
        UserDto userDto = userService.updateUser(userId ,updatedUser);
        return ResponseEntity.ok(userDto);
    }

    //Delete user REST API
    @DeleteMapping("Delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return ResponseEntity.ok("user deleted successfully");
    }
}
