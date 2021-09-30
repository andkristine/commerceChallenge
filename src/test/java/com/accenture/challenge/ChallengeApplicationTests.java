package com.accenture.challenge;

import com.accenture.challenge.service.ProductService;
import com.accenture.challenge.service.ProductServiceImpl;
import org.junit.Before;

import org.junit.jupiter.api.Test;



class ChallengeApplicationTests {

	ProductServiceImpl psi;

	@Before
	public void setUp() {
		psi = new ProductServiceImpl();
	}


	@Test
	public void testFindById() {

	}

}
