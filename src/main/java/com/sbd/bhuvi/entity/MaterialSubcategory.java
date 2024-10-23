package com.sbd.bhuvi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "material_subcategory")
public class MaterialSubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subCategoryId; // Unique ID for each subcategory

    @Column(name = "sub_category_name", nullable = false)
    private String subCategoryName; // Name of the subcategory

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private MaterialCategory category; // Foreign key reference to material_category

}
