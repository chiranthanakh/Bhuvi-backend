package com.sbd.bhuvi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "services_category")
public class ServicesCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer servicesId; // Unique ID for each service category

    @Column(name = "services_name", nullable = false)
    private String servicesName; // Name of the service category
}
