CREATE TABLE IF NOT EXISTS material_category (
    category_id INT AUTO_INCREMENT PRIMARY KEY,       -- Unique ID for each category
    category_name VARCHAR(100) NOT NULL               -- Name of the category
);


-- Create the material_subcategory table
CREATE TABLE IF NOT EXISTS material_subcategory (
    sub_category_id INT AUTO_INCREMENT PRIMARY KEY,      -- Unique ID for each subcategory
    sub_category_name VARCHAR(100) NOT NULL,                          -- Name of the subcategory
    category_id INT NOT NULL,                            -- Foreign key reference to material_category
    FOREIGN KEY (category_id) REFERENCES material_category(category_id) -- Foreign key constraint
);


CREATE TABLE IF NOT EXISTS supplier_information (
    supplier_id INT AUTO_INCREMENT PRIMARY KEY,          -- Unique ID for each supplier
    supplier_name VARCHAR(255) NOT NULL,                 -- Name of the supplier
    phone_number VARCHAR(15),                            -- Phone number of the supplier
    email VARCHAR(255),                                  -- Email address of the supplier
    address TEXT,                                        -- Address of the supplier
    supplier_rating DECIMAL(3, 2) CHECK (supplier_rating >= 0 AND supplier_rating <= 5), -- Rating out of 5
    material_id INT,                                     -- Foreign key reference to construction_materials
    FOREIGN KEY (material_id) REFERENCES construction_materials(material_id) -- Foreign key constraint
);


CREATE TABLE IF NOT EXISTS construction_services (
    provider_id INT AUTO_INCREMENT PRIMARY KEY,          -- Unique ID for each provider
    business_name VARCHAR(255) NOT NULL,                 -- Name of the business
    type_of_service VARCHAR(100),                         -- Type of service offered
    service_category VARCHAR(100),                        -- Category of the service
    business_description TEXT,                            -- Description of the business
    years_of_experience INT,                             -- Years of experience
    business_registration_number VARCHAR(100),           -- Registration number of the business
    certifications_and_licenses TEXT,                    -- Certifications and licenses held
    service_area TEXT,                                   -- Geographic regions the business operates in
    business_logo VARCHAR(255),                           -- Path or URL to the business logo/images
    contact_name VARCHAR(100),                            -- Name of the primary contact person
    email VARCHAR(255),                                  -- Email of the primary contact person
    phone_number VARCHAR(15),                            -- Phone number of the primary contact person
    address TEXT,                                        -- Address of the business
    website_url VARCHAR(255),                            -- Business website URL
    social_media_links TEXT,                             -- Links to social media profiles (LinkedIn, Facebook, etc.)
    pricing DECIMAL(10, 2),                             -- Pricing information for services
    availability TEXT,                                   -- Availability of services
    minimum_project_size DECIMAL(10, 2),                -- Minimum project size (if applicable)
    past_projects TEXT,                                  -- Description of past projects
    project_images TEXT,                                 -- URLs or file paths for project images
    city VARCHAR(100),                                   -- City where the business is located
    state VARCHAR(100),                                  -- State where the business is located
    country VARCHAR(100)                                 -- Country where the business is located
);

-- Create the services_category table
CREATE TABLE IF NOT EXISTS services_category (
    services_id INT AUTO_INCREMENT PRIMARY KEY,           -- Unique ID for each service category
    services_name VARCHAR(100) NOT NULL                   -- Name of the service category
);

CREATE TABLE IF NOT EXISTS service_subcategory (
    sub_id INT AUTO_INCREMENT PRIMARY KEY,               -- Unique ID for each subcategory
    sub_name VARCHAR(100) NOT NULL,                      -- Name of the subcategory
    service_id INT NOT NULL,                             -- Foreign key reference to services_category
    FOREIGN KEY (service_id) REFERENCES services_category(services_id) -- Foreign key constraint
);