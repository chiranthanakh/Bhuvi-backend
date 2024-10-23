package com.sbd.bhuvi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String contactNumber;
    private String emailId;
    private String owner;

    public UserDto(long id, String name, String contactNumber, String emailId, String owner) {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getOwner() {
        return owner;
    }
}
