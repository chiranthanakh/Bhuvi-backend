package com.sbd.Bhuvi.service;

import com.sbd.Bhuvi.dto.UserBhuviDto;

import java.util.List;

public interface UserBhuviService {
    UserBhuviDto createUserBhuvi(UserBhuviDto userBhuviDto);

    UserBhuviDto getUserBhuviById(Long userBhuviId);

    List<UserBhuviDto> getAllUsers();

    UserBhuviDto updateUserBhuvi(Long userBhuviId, UserBhuviDto updatedEmployee);

    void deleteUserBhuvi(Long userBhuviId);
}
