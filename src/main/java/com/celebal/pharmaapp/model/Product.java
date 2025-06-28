package com.celebal.pharmaapp.model;

public class Product {
    private Long id;
    private String name;
    private String description;
    private String usageInstructions;
    private String safetyPrecautions;

    public Product(Long id, String name, String description, String usageInstructions, String safetyPrecautions) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.usageInstructions = usageInstructions;
        this.safetyPrecautions = safetyPrecautions;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getUsageInstructions() {
        return usageInstructions;
    }
    public void setUsageInstructions(String usageInstructions) {
        this.usageInstructions = usageInstructions;
    }
    public String getSafetyPrecautions() {
        return safetyPrecautions;
    }
    public void setSafetyPrecautions(String safetyPrecautions) {
        this.safetyPrecautions = safetyPrecautions;
    }
}