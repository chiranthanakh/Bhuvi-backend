package com.sbd.Bhuvi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Taluk")
public class Taluk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "district_Id")
    private Long districtId;

    @Column(name = "name")
    private String name;

    public Taluk(Long districtId,String name) {
        this.districtId = districtId;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public String getName() {
        return name;
    }
}
