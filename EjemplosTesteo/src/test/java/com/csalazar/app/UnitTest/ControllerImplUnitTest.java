package com.csalazar.app.UnitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.csalazar.app.controller.ControlerImpl;
import com.csalazar.app.service.InterfaceService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerImplUnitTest {

	@InjectMocks
	ControlerImpl controller;
	
	@Mock
	InterfaceService servicio;
	
	@Test
	public void sumaTest() {
		Mockito.when(servicio.Sumar(Mockito.anyInt(), Mockito.anyInt())).thenReturn(4);
		int a = controller.Sumar(2, 2);
		assertEquals(4,a);
	}
	@Test
	public void restaTest() {
		Mockito.when(servicio.Restar(Mockito.anyInt(), Mockito.anyInt())).thenReturn(0);
		int a = controller.Restar(2, 2);
		assertEquals(0,a);
	}
	@Test
	public void multiTest() {
		Mockito.when(servicio.Multiplicar(Mockito.anyInt(), Mockito.anyInt())).thenReturn(4);
		int a = controller.Multiplicar(2, 2);
		assertEquals(4,a);
	}
}
