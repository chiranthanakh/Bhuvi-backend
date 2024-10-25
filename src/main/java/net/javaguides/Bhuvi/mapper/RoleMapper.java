package net.javaguides.Bhuvi.mapper;

import net.javaguides.Bhuvi.dto.RoleDto;
import net.javaguides.Bhuvi.model.Role;

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
