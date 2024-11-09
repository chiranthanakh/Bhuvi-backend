package com.sbd.Bhuvi.service.impl;

import lombok.AllArgsConstructor;
import com.sbd.Bhuvi.dto.RoleDto;
import com.sbd.Bhuvi.exception.ResourceNotFoundException;
import com.sbd.Bhuvi.mapper.RoleMapper;
import com.sbd.Bhuvi.entity.Role;
import com.sbd.Bhuvi.repository.RoleRepository;
import com.sbd.Bhuvi.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Override
    public RoleDto createRole(RoleDto roleDto) {
        Role role = RoleMapper.mapToRole(roleDto);
        Role savedRole = roleRepository.save(role);
        return RoleMapper.mapToRoleDto(savedRole);    }

    @Override
    public RoleDto getRoleById(Long roleId) {
        Role role = roleRepository.findById(roleId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Role is not exist with given id:" + roleId));
        return RoleMapper.mapToRoleDto(role);
    }

    @Override
    public List<RoleDto> getAllRoles() {
        List<Role> roles = roleRepository.findAll();
        return roles.stream().map((role) -> RoleMapper.mapToRoleDto(role))
                .collect(Collectors.toList());    }

    @Override
    public RoleDto updateRole(Long roleId, RoleDto updatedRole) {
        Role role = roleRepository.findById(roleId).orElseThrow(
                () -> new ResourceNotFoundException("Role does not exist with given id: " + roleId)
        );
        role.setRoleName(updatedRole.getRoleName());
        role.setCreatedBy(updatedRole.getCreatedBy());
        role.setCreatedDate(updatedRole.getCreatedDate());
        Role updatedRoleObj = roleRepository.save(role);
        return RoleMapper.mapToRoleDto(updatedRoleObj);
    }

    @Override
    public void deleteRole(Long roleId) {
        Role role = roleRepository.findById(roleId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with given id: " + roleId)
        );
        roleRepository.deleteById(roleId);
    }
}
