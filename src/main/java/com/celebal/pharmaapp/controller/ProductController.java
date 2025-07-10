package com.celebal.pharmaapp.controller;

import com.celebal.pharmaapp.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final List<Product> productList = Arrays.asList(
    new Product(1L, "Paracetamol", "Pain reliever and a fever reducer.", "Take 1-2 tablets every 4-6 hours as needed.", "Do not exceed 8 tablets in 24 hours. Not for children under 6."),
    new Product(2L, "Cetirizine", "Antihistamine for allergy relief.", "Take 1 tablet once daily.", "May cause drowsiness. Not to be used with alcohol."),
    new Product(3L, "Amoxicillin", "Antibiotic for bacterial infections.", "Take 1 capsule every 8 hours for 7 days.", "Complete the course. Not for viral infections."),
    new Product(4L, "Ibuprofen", "Nonsteroidal anti-inflammatory drug (NSAID) for pain and inflammation.", "Take 1-2 tablets every 6-8 hours as needed.", "Take with food. Do not exceed 6 tablets in 24 hours."),
    new Product(5L, "Metformin", "Medication for type 2 diabetes.", "Take 1 tablet with meals twice daily.", "Monitor blood sugar. Not for type 1 diabetes."),
    new Product(6L, "Azithromycin", "Antibiotic for respiratory infections.", "Take 1 tablet daily for 3 days.", "Complete full course. May cause stomach upset."),
    new Product(7L, "Loratadine", "Antihistamine for hay fever and allergies.", "Take 1 tablet once daily.", "Consult doctor if pregnant."),
    new Product(8L, "Omeprazole", "Proton pump inhibitor for acid reflux.", "Take 1 capsule before breakfast.", "Do not crush or chew capsules.")
    new Product(9L, "test", "this is a test case ", "it is generated for the testing purpose only", "Do not consider this as the part of the app")
    );

    @GetMapping
    public List<Product> getAllProducts() {
        return productList;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productList.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}