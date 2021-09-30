package com.accenture.challenge.service;

import com.accenture.challenge.model.Product;

import java.util.List;

public interface ProductService {

    void addToCart(int id, List<Product> cart);

    List<Product> showAllProducts(List<Product> initialList);

    String showAllProductsInCart(List<Product> cart);

}
