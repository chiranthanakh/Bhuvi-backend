package com.sbd.Bhuvi.controller;

import com.sbd.Bhuvi.dto.UserBhuviDto;
import com.sbd.Bhuvi.service.UserBhuviService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("UserBhuvi")
public class UserBhuviController {

    @Autowired
    private UserBhuviService userBhuviService;

    //add user REST API
    @PostMapping("adduser")
    public ResponseEntity<UserBhuviDto> createUserBhuvi(@RequestBody UserBhuviDto userBhuviDto){
        UserBhuviDto savedUserBhuvi = userBhuviService.createUserBhuvi(userBhuviDto);
        return new ResponseEntity<>(savedUserBhuvi , HttpStatus.CREATED);
    }

    //Get user REST API
    @GetMapping("get/{id}")
    public ResponseEntity<UserBhuviDto> getUserBhuviById(@PathVariable("id") Long userBhuviId){
        UserBhuviDto userBhuviDto = userBhuviService.getUserBhuviById(userBhuviId);
        return ResponseEntity.ok(userBhuviDto);
    }

    //Get all users REST API
    @GetMapping
    public ResponseEntity<List<UserBhuviDto>> getAllUsers(){
        List<UserBhuviDto> users = userBhuviService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    //update user REST API
    @PutMapping("putuers/{id}")
    public ResponseEntity<UserBhuviDto> updateUserBhuvi(@PathVariable("id") Long userBhuviId,
                                              @RequestBody UserBhuviDto updatedUserBhuvi){
        UserBhuviDto userBhuviDto = userBhuviService.updateUserBhuvi(userBhuviId ,updatedUserBhuvi);
        return ResponseEntity.ok(userBhuviDto);
    }

    //Delete user REST API
    @DeleteMapping("Delete/{id}")
    public ResponseEntity<String> deleteUserBhuvi(@PathVariable("id") Long userBhuviId){
        userBhuviService.deleteUserBhuvi(userBhuviId);
        return ResponseEntity.ok("user deleted successfully");
    }
}
