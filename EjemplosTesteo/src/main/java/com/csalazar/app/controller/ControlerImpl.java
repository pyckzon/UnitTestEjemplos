package com.csalazar.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.csalazar.app.service.InterfaceService;


@RestController
public class ControlerImpl implements InterfaceController {

	@Autowired
	private InterfaceService service;
	
	@Override
	public int Sumar(int num1, int num2) {
		// TODO Auto-generated method stub
		int  a = service.Sumar(num1, num2);
		return a;
	}
	@Override
	public int Restar(int num1, int num2) {
		// TODO Auto-generated method stub
		return service.Restar(num1, num2);
	}
	@Override
	public int Multiplicar(int num1, int num2) {
		// TODO Auto-generated method stub
		return service.Multiplicar(num1, num2);
	}

	@Override
	public int Dividir(int num1, int num2) {
		// TODO Auto-generated method stub
		return service.Dividir(num1, num2);
	}

}
