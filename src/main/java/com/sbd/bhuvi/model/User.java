package com.sbd.bhuvi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
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



    // Removed Object return types and replaced them with their correct types
}
