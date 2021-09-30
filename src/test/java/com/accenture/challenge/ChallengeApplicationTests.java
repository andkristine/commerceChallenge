package com.accenture.challenge;

import com.accenture.challenge.model.Product;
import com.accenture.challenge.repository.ProductRepositoryImpl;
import com.accenture.challenge.service.ProductServiceImpl;
import org.junit.Before;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ChallengeApplicationTests {

	ProductServiceImpl psi;
	List<Product> sampleCart;
	ProductRepositoryImpl pri;

	@Before
	public void setUp() {
		psi = new ProductServiceImpl();
		pri = new ProductRepositoryImpl();
		sampleCart = new ArrayList<Product>();
		sampleCart.add(new Product(1, 36, Product.Color.GREY, Product.Gender.UNISEX));
	}

	@Test
	public void addNewProductToCart() {
		sampleCart.add(new Product(10, 46, Product.Color.RED, Product.Gender.MALE));
		System.out.println(sampleCart.toString());
	}

	@Test
	public void addProductToCartWithExistingId() {
		sampleCart.add(new Product(1, 46, Product.Color.RED, Product.Gender.MALE));
		System.out.println(sampleCart.toString());
	}

	@Test
	public void getProductByNonExistingId() {
		Product product = pri.getProductById(2, sampleCart);
		System.out.println(product.toString());
	}

}
