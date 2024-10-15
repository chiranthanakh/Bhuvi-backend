package net.javaguides.Bhuvi.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "email_id", nullable = false, unique = true)
    private String emailId;

    @Column(name = "owner")
    private String owner;

    // Custom constructor that initializes fields without ID
    public User(String name, String contactNumber, String emailId, String owner) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.owner = owner;
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

    // Removed Object return types and replaced them with their correct types
}
