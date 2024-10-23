CREATE TABLE IF NOT EXISTS construction_materials (
    material_id INT AUTO_INCREMENT PRIMARY KEY,        -- Unique ID for each material
    material_name VARCHAR(255) NOT NULL,               -- Name of the material
    material_category VARCHAR(100) NOT NULL,           -- Category (e.g., cement, wood, etc.)
    subcategory VARCHAR(100),                          -- Subcategory of the material
    brand_or_manufacturer VARCHAR(255),                -- Brand or Manufacturer's name
    description TEXT,                                  -- Detailed description of the material
    specifications TEXT,                               -- Specifications (dimensions, quality, etc.)
    pricing DECIMAL(10, 2) NOT NULL,                   -- Pricing information, e.g., 1000.00
    unit_of_measurement VARCHAR(50),                   -- Unit (e.g., kg, meters, etc.)
    material_image VARCHAR(255),                       -- Path or URL to the material image
    location VARCHAR(255),                             -- Location where the material is stored
    safety_information TEXT,                           -- Any safety information or warnings
    created_by VARCHAR(100) NOT NULL,                  -- Username or user ID of the creator
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP     -- Timestamp when the record is created
);