package com.csalazar.app.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements InterfaceService {
	
	@Override
	public String Sumar(int num1, int num2) {
		// TODO Auto-generated method stub
		return "Resultado= "+(num1+num2);
	}

	@Override
	public String Restar(int num1, int num2) {
		// TODO Auto-generated method stub
		return "Resultado= "+(num1-num2);
	}

	@Override
	public String Multiplicar(int num1, int num2) {
		// TODO Auto-generated method stub
		return "Resultado= "+(num1*num2);
	}

	@Override
	public String Dividir(int num1, int num2) {
		// TODO Auto-generated method stub
		return "Resultado= "+(num1/num2);
	}

}
