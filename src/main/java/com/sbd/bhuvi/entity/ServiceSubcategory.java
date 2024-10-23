package com.sbd.bhuvi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "service_subcategory")
public class ServiceSubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subId; // Unique ID for each subcategory

    @Column(name = "sub_name", nullable = false)
    private String subName; // Name of the subcategory

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private ServicesCategory serviceCategory; // Foreign key reference to services_category

}
