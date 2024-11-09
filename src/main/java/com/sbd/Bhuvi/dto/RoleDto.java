package com.sbd.Bhuvi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoleDto {
    private Long id;
    private String roleName;
    private String createdBy;
    private String createdDate;


    public RoleDto(Long id, String roleName, String createdBy, String createdDate) {
        this.id = id;
        this.roleName = roleName;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }
}
