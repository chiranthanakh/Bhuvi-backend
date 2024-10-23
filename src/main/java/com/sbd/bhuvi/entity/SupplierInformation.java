package com.sbd.bhuvi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "supplier_information")
public class SupplierInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplierId; // Unique ID for each supplier

    @Column(name = "supplier_name", nullable = false)
    private String supplierName; // Name of the supplier

    @Column(name = "phone_number")
    private String phoneNumber; // Phone number of the supplier

    @Column(name = "email")
    private String email; // Email address of the supplier

    @Column(name = "address")
    private String address; // Address of the supplier

    @Column(name = "supplier_rating")
    private BigDecimal supplierRating; // Rating out of 5

    @ManyToOne
    @JoinColumn(name = "material_id")
    private ConstructionMaterial material; // Foreign key reference to construction_materials
}
