package com.sbd.bhuvi.service.impl;

import com.sbd.bhuvi.dto.UserDto;
import com.sbd.bhuvi.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import com.sbd.bhuvi.mapper.UserMapper;
import com.sbd.bhuvi.model.User;
import com.sbd.bhuvi.repository.UserRepository;
import com.sbd.bhuvi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User is not exist with given id:" + userId));
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map((user) -> UserMapper.mapToUserDto(user))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(Long userId, UserDto updatedEmployee) {

        User user = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with given id: " + userId)
        );

//        user.setName(updatedEmployee.getName());
//        user.setContactNumber(updatedEmployee.getContactNumber());
//        user.setEmailId(updatedEmployee.getEmailId());
//        user.setOwner(updatedEmployee.getOwner());

        User updatedUserObj = userRepository.save(user);
        return UserMapper.mapToUserDto(updatedUserObj);
    }

    @Override
    public void deleteUser(Long userId) {

        User user = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with given id: " + userId)
        );

        userRepository.deleteById(userId);
    }


}
