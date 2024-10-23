package com.sbd.bhuvi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "construction_services")
public class ConstructionService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer providerId; // Unique ID for each provider

    @Column(name = "business_name", nullable = false)
    private String businessName; // Name of the business

    @Column(name = "type_of_service")
    private String typeOfService; // Type of service offered

    @Column(name = "service_category")
    private String serviceCategory; // Category of the service

    @Column(name = "business_description")
    private String businessDescription; // Description of the business

    @Column(name = "years_of_experience")
    private Integer yearsOfExperience; // Years of experience

    @Column(name = "business_registration_number")
    private String businessRegistrationNumber; // Registration number of the business

    @Column(name = "certifications_and_licenses")
    private String certificationsAndLicenses; // Certifications and licenses held

    @Column(name = "service_area")
    private String serviceArea; // Geographic regions the business operates in

    @Column(name = "business_logo")
    private String businessLogo; // Path or URL to the business logo/images

    @Column(name = "contact_name")
    private String contactName; // Name of the primary contact person

    @Column(name = "email")
    private String email; // Email of the primary contact person

    @Column(name = "phone_number")
    private String phoneNumber; // Phone number of the primary contact person

    @Column(name = "address")
    private String address; // Address of the business

    @Column(name = "website_url")
    private String websiteUrl; // Business website URL

    @Column(name = "social_media_links")
    private String socialMediaLinks; // Links to social media profiles (LinkedIn, Facebook, etc.)

    @Column(name = "pricing")
    private BigDecimal pricing; // Pricing information for services

    @Column(name = "availability")
    private String availability; // Availability of services

    @Column(name = "minimum_project_size")
    private BigDecimal minimumProjectSize; // Minimum project size (if applicable)

    @Column(name = "past_projects")
    private String pastProjects; // Description of past projects

    @Column(name = "project_images")
    private String projectImages; // URLs or file paths for project images

    @Column(name = "city")
    private String city; // City where the business is located

    @Column(name = "state")
    private String state; // State where the business is located

    @Column(name = "country")
    private String country; // Country where the business is located
}
