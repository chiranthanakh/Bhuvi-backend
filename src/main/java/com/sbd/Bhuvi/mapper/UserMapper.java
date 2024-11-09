package com.sbd.Bhuvi.mapper;

import com.sbd.Bhuvi.dto.UserDto;
import com.sbd.Bhuvi.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getContactNumber(),
                user.getEmailId(),
                user.getOwner()
        );
    }

    public static User mapToUser(UserDto userDto) {
        return new User(
                userDto.getName(),
                userDto.getContactNumber(),
                userDto.getEmailId(),
                userDto.getOwner()
        );
    }
}
