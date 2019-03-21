package com.csalazar.app.UnitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.csalazar.app.service.ServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceImplUnitTests {

	
	@InjectMocks
	ServiceImpl service;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testSuma() {
		assertEquals(4,service.Sumar(0, 4));
		assertEquals(4,service.Sumar(1, 3));
		assertEquals(4,service.Sumar(2, 2));
		assertEquals(4,service.Sumar(3, 1));
		assertEquals(4,service.Sumar(4, 0));
	}
	
	@Test
	public void testResta() {
		assertEquals(1,service.Restar(5, 4));
		assertEquals(2,service.Restar(5, 3));
		assertEquals(3,service.Restar(5, 2));
		assertEquals(4,service.Restar(5, 1));
		assertEquals(5,service.Restar(5, 0));
	}
	@Test
	public void testMulti() {
		assertEquals(0,service.Multiplicar(0, 4));
		assertEquals(3,service.Multiplicar(1, 3));
		assertEquals(4,service.Multiplicar(2, 2));
		assertEquals(3,service.Multiplicar(3, 1));
		assertEquals(0,service.Multiplicar(4, 0));
	}
	@Test
	public void testDivi() {
		assertEquals(2,service.Dividir(2, 1));
		assertEquals(1,service.Dividir(10, 9));
		assertEquals(2,service.Dividir(5, 2));
	}

}
