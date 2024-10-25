package net.javaguides.Bhuvi.mapper;

import net.javaguides.Bhuvi.dto.UserDto;
import net.javaguides.Bhuvi.model.User;

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
