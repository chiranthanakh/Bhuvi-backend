package net.javaguides.Bhuvi.service;

import net.javaguides.Bhuvi.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(Long userId, UserDto updatedEmployee);

    void deleteUser(Long userId);

}
