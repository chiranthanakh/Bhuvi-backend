package net.javaguides.Bhuvi.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.Bhuvi.dto.UserDto;
import net.javaguides.Bhuvi.exception.ResourceNotFoundException;
import net.javaguides.Bhuvi.mapper.UserMapper;
import net.javaguides.Bhuvi.model.User;
import net.javaguides.Bhuvi.repository.UserRepository;
import net.javaguides.Bhuvi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;



    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    //fetch get userId
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

        user.setName(updatedEmployee.getName());
        user.setContactNumber(updatedEmployee.getContactNumber());
        user.setEmailId(updatedEmployee.getEmailId());
        user.setOwner(updatedEmployee.getOwner());

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
