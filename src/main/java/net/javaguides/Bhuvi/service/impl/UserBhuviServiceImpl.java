package net.javaguides.Bhuvi.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.Bhuvi.dto.UserBhuviDto;
import net.javaguides.Bhuvi.exception.ResourceNotFoundException;
import net.javaguides.Bhuvi.mapper.UserBhuviMapper;
import net.javaguides.Bhuvi.model.UserBhuvi;
import net.javaguides.Bhuvi.repository.UserBhuviRepository;
import net.javaguides.Bhuvi.service.UserBhuviService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserBhuviServiceImpl implements UserBhuviService {

    private UserBhuviRepository userBhuviRepository;
    @Override
    public UserBhuviDto createUserBhuvi(UserBhuviDto userBhuviDto) {
        UserBhuvi userBhuvi = UserBhuviMapper.mapToUserBhuvi(userBhuviDto);
        UserBhuvi savedUserBhuvi = userBhuviRepository.save(userBhuvi);
        return UserBhuviMapper.mapToUserBhuviDto(savedUserBhuvi);
    }

    @Override
    public UserBhuviDto getUserBhuviById(Long userBhuviId) {
        UserBhuvi userBhuvi = userBhuviRepository.findById(userBhuviId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User is not exist with given id:" + userBhuviId));
        return UserBhuviMapper.mapToUserBhuviDto(userBhuvi);
    }

    @Override
    public List<UserBhuviDto> getAllUsers() {
        List<UserBhuvi> users = userBhuviRepository.findAll();
        return users.stream().map((userBhuvi) -> UserBhuviMapper.mapToUserBhuviDto(userBhuvi))
                .collect(Collectors.toList());
    }

    @Override
    public UserBhuviDto updateUserBhuvi(Long userBhuviId, UserBhuviDto updatedEmployee) {
        UserBhuvi userBhuvi = userBhuviRepository.findById(userBhuviId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with given id: " + userBhuviId)
        );

        userBhuvi.setName(updatedEmployee.getName());
        userBhuvi.setNumber(updatedEmployee.getNumber());
        userBhuvi.setEmail(updatedEmployee.getemail());
        userBhuvi.setRoleId(updatedEmployee.getRoleId());
        userBhuvi.setActiveStatus(updatedEmployee.getActiveStatus());
        UserBhuvi updatedUserBhuviObj = userBhuviRepository.save(userBhuvi);
        return UserBhuviMapper.mapToUserBhuviDto(updatedUserBhuviObj);
    }

    @Override
    public void deleteUserBhuvi(Long userBhuviId) {
        UserBhuvi userBhuvi = userBhuviRepository.findById(userBhuviId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with given id: " + userBhuviId)
        );
        userBhuviRepository.deleteById(userBhuviId);
    }

    }

