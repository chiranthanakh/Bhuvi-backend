package net.javaguides.Bhuvi.service;

import net.javaguides.Bhuvi.dto.UserBhuviDto;

import java.util.List;

public interface UserBhuviService {
    UserBhuviDto createUserBhuvi(UserBhuviDto userBhuviDto);

    UserBhuviDto getUserBhuviById(Long userBhuviId);

    List<UserBhuviDto> getAllUsers();

    UserBhuviDto updateUserBhuvi(Long userBhuviId, UserBhuviDto updatedEmployee);

    void deleteUserBhuvi(Long userBhuviId);
}
