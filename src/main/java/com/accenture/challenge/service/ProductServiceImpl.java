package com.accenture.challenge.service;

import com.accenture.challenge.model.Product;
import com.accenture.challenge.repository.ProductRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductServiceImpl implements ProductService{

    static ProductRepositoryImpl repo = new ProductRepositoryImpl();
    static List<Product> productList = createInitialProductList();

    public static List<Product> createInitialProductList() {
        List<Product> initialProductlist = List.of(
                new Product(1, 34, Product.Color.PINK, Product.Gender.FEMALE),
                new Product(2, 38, Product.Color.GREEN, Product.Gender.MALE),
                new Product(3, 42, Product.Color.WHITE, Product.Gender.UNISEX),
                new Product(4, 28, Product.Color.RED, Product.Gender.FEMALE),
                new Product(5, 40, Product.Color.GREY, Product.Gender.UNISEX),
                new Product(6, 34, Product.Color.MULTICOLOR, Product.Gender.MALE),
                new Product(7, 40, Product.Color.WHITE, Product.Gender.FEMALE)
        );
        return initialProductlist;

    }

    public void addToCart(int id, List<Product> cart) {

        Product product = repo.getProductById(id, productList);
        cart.add(product);

    }

    @Override
    public List<Product> showAllProducts(List<Product> productList) {
        return this.productList;
    }

    @Override
    public String showAllProductsInCart(List<Product> cart) {
        if (cart.isEmpty()) {
            return "The cart is empty";
        }

        return cart.toString();
    }

    public void run() {
        ProductRepositoryImpl repo = new ProductRepositoryImpl();
        List<Product> productList = createInitialProductList();

        List<Product> cartOne = new ArrayList<Product>();
        addToCart(2, cartOne);
        addToCart(7, cartOne);
        addToCart(1, cartOne);
        List<Product> cartTwo = new ArrayList<Product>();
        addToCart(1, cartTwo);
        addToCart(3, cartTwo);
        List<Product> cartThree = new ArrayList<Product>();

        String productsInCart = showAllProductsInCart(cartTwo);
        List<Product> allProducts = showAllProducts(productList);


        System.out.println(productsInCart);
        System.out.println(allProducts);

    }

}
