package com.csalazar.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.csalazar.app.service.InterfaceService;


@RestController
public class ControlerImpl implements InterfaceController {

	@Autowired
	private InterfaceService service;
	
	
	@Override
	public String Sumar(int num1, int num2) {
		// TODO Auto-generated method stub
		return service.Sumar(num1, num2);
	}

	@Override
	public String Restar(int num1, int num2) {
		// TODO Auto-generated method stub
		return service.Dividir(num1, num2);
	}

	@Override
	public String Multiplicar(int num1, int num2) {
		// TODO Auto-generated method stub
		return service.Multiplicar(num1, num2);
	}

	@Override
	public String Dividir(int num1, int num2) {
		// TODO Auto-generated method stub
		return service.Dividir(num1, num2);
	}

}
