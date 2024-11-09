package com.sbd.Bhuvi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Column(name = "images")
    private String images;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pid;

    @Column(name = "status")
    private String status;

    @Column(name = "category")
    private String category;

    @Column(name = "property_name")
    private String propertyName;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "property_size")
    private double propertySize;

    @Column(name = "katha")
    private String katha;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "location")
    private String location;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "nearby")
    private String nearby;

    @Column(name = "posted_on")
    private LocalDate postedOn;

    @Column(name = "posted_by")
    private String postedBy;

    @Column(name = "ownership")
    private String ownership;

    @Column(name = "payment")
    private String payment;

    @Column(name = "deposit")
    private BigDecimal deposit;

    @Column(name = "rent")
    private BigDecimal rent;

    @Column(name = "available_sites")
    private int availableSites;

    @Column(name = "water_facility")
    private boolean waterFacility;

    @Column(name = "electricity")
    private boolean electricity;

    @Column(name = "sewage")
    private boolean sewage;

    @Column(name = "gated_community")
    private boolean gatedCommunity;

    @Column(name = "pool")
    private boolean pool;

    @Column(name = "club_house")
    private boolean clubHouse;

    @Column(name = "gym")
    private boolean gym;

    @Column(name = "garden")
    private boolean garden;

    @Column(name = "additional_points")
    private String additionalPoints;

    @Column(name = "borewell")
    private boolean borewell;

    @Column(name = "road")
    private String road;

    @Column(name = "fencing")
    private boolean fencing;

    @Column(name = "num_bhk")
    private int numBhk;

    @Column(name = "building_type")
    private String buildingType;

    @Column(name = "bedrooms")
    private int bedrooms;

    @Column(name = "bathrooms")
    private int bathrooms;

    @Column(name = "floors")
    private int floors;

    @Column(name = "furnished")
    private boolean furnished;

    @Column(name = "parking")
    private boolean parking;

    @Column(name = "available_immediate")
    private boolean availableImmediate;
}
