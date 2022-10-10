package com.curso.Proy007_EjemplosStatic;

public class EjStatic {
	
	private  int serialNumber;
	private static int counter = 0;
	
	public EjStatic() {
		this.serialNumber = ++counter;
	}
	
	public static int getCounter() {
		return counter;
	}
	
	public  int getSerialNumber() {
		return serialNumber;
	}

}
