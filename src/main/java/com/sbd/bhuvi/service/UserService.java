package com.sbd.bhuvi.service;

import com.sbd.bhuvi.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(Long userId, UserDto updatedEmployee);

    void deleteUser(Long userId);

}

