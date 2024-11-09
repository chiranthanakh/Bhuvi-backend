package com.sbd.Bhuvi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_details ")
public class UserBhuvi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private String number;

    @Column(name = "email")
    private String email;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "active_status")
    private String activeStatus;

    public UserBhuvi(String name, String number, String email, Long roleId, String activeStatus) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.roleId = roleId;
        this.activeStatus=activeStatus;
    }

    public Long getId() {
        return id;
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
