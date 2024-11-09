package com.sbd.Bhuvi.dto;


import lombok.*;


@Data
@NoArgsConstructor
public class UserBhuviDto {
    private Long id;
    private String name;
    private String number;
    private String email;
    private Long roleId;
    private String activeStatus;

    public UserBhuviDto(Long id, String name, String number, String email, Long roleId,String activeStatus) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.email = email;
        this.roleId = roleId;
        this.activeStatus=activeStatus;
    }
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getemail() {
        return email;
    }

    public Long getRoleId() {
        return roleId;
    }

    public String getActiveStatus() {
        return activeStatus;
    }
}
