package net.javaguides.Bhuvi.mapper;

import net.javaguides.Bhuvi.dto.UserBhuviDto;
import net.javaguides.Bhuvi.model.UserBhuvi;

public class UserBhuviMapper {

    public static UserBhuviDto mapToUserBhuviDto(UserBhuvi userBhuvi) {
        return new UserBhuviDto(
                userBhuvi.getId(),
                userBhuvi.getName(),
                userBhuvi.getNumber(),
                userBhuvi.getemail(),
                userBhuvi.getRoleId(),
                 userBhuvi.getActiveStatus()
        );
    }

    public static UserBhuvi mapToUserBhuvi(UserBhuviDto userBhuviDto) {
        return
                new UserBhuvi(
                userBhuviDto.getName(),
                userBhuviDto.getNumber(),
                userBhuviDto.getemail(),
                userBhuviDto.getRoleId(),
                userBhuviDto.getActiveStatus()
        );
    }
}
