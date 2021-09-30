package com.accenture.challenge;

import com.accenture.challenge.service.ProductServiceImpl;

public class ChallengeApplication {

	static ProductServiceImpl productService = new ProductServiceImpl();
	
	public static void main(String[] args) {

		productService.run();

	}

}
