package com.sbd.bhuvi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "construction_materials")
public class ConstructionMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer materialId; // Unique ID for each material

    @Column(name = "material_name", nullable = false)
    private String materialName; // Name of the material

    @Column(name = "material_category", nullable = false)
    private String materialCategory; // Category (e.g., cement, wood, etc.)

    @Column(name = "subcategory")
    private String subcategory; // Subcategory of the material

    @Column(name = "brand_or_manufacturer")
    private String brandOrManufacturer; // Brand or Manufacturer's name

    @Column(name = "description")
    private String description; // Detailed description of the material

    @Column(name = "specifications")
    private String specifications; // Specifications (dimensions, quality, etc.)

    @Column(name = "pricing", nullable = false)
    private BigDecimal pricing; // Pricing information, e.g., 1000.00

    @Column(name = "stock_availability")
    private String stockAvailability; // Stock Availability

    @Column(name = "unit_of_measurement")
    private String unitOfMeasurement; // Unit (e.g., kg, meters, etc.)

    @Column(name = "material_image")
    private String materialImage; // Path or URL to the material image

    @Column(name = "location")
    private String location; // Location where the material is stored

    @Column(name = "safety_information")
    private String safetyInformation; // Any safety information or warnings

    @Column(name = "created_by", nullable = false)
    private String createdBy; // Username or user ID of the creator

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt; // Timestamp when the record is created

}
