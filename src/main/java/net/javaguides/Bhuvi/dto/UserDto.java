package net.javaguides.Bhuvi.dto;

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

    public UserDto(Long id, String name, String contactNumber, String emailId, String owner) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.owner = owner;
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
