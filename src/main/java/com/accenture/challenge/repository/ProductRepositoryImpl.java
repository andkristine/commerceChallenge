package com.accenture.challenge.repository;

import com.accenture.challenge.model.Product;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public Product getProductById(int id, List<Product> productList) {

        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }

        System.out.println("No product with ID " + id);
        return null;
    }




}