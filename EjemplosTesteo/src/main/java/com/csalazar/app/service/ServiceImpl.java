package com.csalazar.app.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements InterfaceService {
	
	@Override
	public int Sumar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int Restar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public int Multiplicar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int Dividir(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}

}
