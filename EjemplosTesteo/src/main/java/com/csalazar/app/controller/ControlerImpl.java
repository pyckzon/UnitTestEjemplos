package com.csalazar.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.csalazar.app.service.InterfaceService;
import com.csalazar.app.service.ServiceImpl;

@RestController
public class ControlerImpl implements InterfaceController {

	@Autowired
	InterfaceService service = new ServiceImpl();
	
	@Override
	public String Sumar(int num1, int num2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Restar(int num1, int num2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Multiplicar(int num1, int num2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Dividir(int num1, int num2) {
		// TODO Auto-generated method stub
		return null;
	}

}
