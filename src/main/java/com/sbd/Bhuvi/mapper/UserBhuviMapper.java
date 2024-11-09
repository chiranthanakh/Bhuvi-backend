package com.sbd.Bhuvi.mapper;

import com.sbd.Bhuvi.dto.UserBhuviDto;
import com.sbd.Bhuvi.entity.UserBhuvi;

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
