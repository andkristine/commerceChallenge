package com.accenture.challenge;

import com.accenture.challenge.model.Product;
import com.accenture.challenge.repository.ProductRepositoryImpl;
import com.accenture.challenge.service.ProductServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;




public class ChallengeApplication {

	static ProductServiceImpl productService = new ProductServiceImpl();
	
	public static void main(String[] args) {
	//	List<Product> productList = createInitialProductList();


		productService.run();
		
		
		
		
		
	}




}
