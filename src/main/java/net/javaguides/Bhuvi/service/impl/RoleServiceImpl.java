package net.javaguides.Bhuvi.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.Bhuvi.dto.RoleDto;
import net.javaguides.Bhuvi.exception.ResourceNotFoundException;
import net.javaguides.Bhuvi.mapper.RoleMapper;
import net.javaguides.Bhuvi.model.Role;
import net.javaguides.Bhuvi.repository.RoleRepository;
import net.javaguides.Bhuvi.service.RoleService;
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
