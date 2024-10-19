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
}
