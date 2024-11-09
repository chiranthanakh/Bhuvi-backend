package com.sbd.Bhuvi.mapper;

import com.sbd.Bhuvi.dto.RoleDto;
import com.sbd.Bhuvi.entity.Role;

public class RoleMapper {
    public static RoleDto mapToRoleDto(Role role) {
        return new RoleDto(
                role.getId(),
                role.getRoleName(),
                role.getCreatedBy(),
                role.getCreatedDate()
        );
    }

    public static Role mapToRole(RoleDto roleDto) {
        return new Role(
                roleDto.getRoleName(),
                roleDto.getCreatedBy(),
                roleDto.getCreatedDate()
        );
    }
}
