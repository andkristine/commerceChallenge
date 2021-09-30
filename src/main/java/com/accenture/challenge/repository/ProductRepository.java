package com.accenture.challenge.repository;

import com.accenture.challenge.model.Product;

import java.util.List;

public interface ProductRepository {

    Product getProductById(int id, List<Product> productList);

}
