package com.curso.varios;

public class EjemploVariablesPila {

	//main 1 metodo
	public static void main(String[] args) {
		int a = 2;
		metodo1(a);
		System.out.println("fin main");
	}
	
	public static void metodo1(int numero) {
		int b = numero;
		metodo2();
		System.out.println("fin metodo1");
	}
	
	public static void metodo2() {
		int c = 3;
		//provoco una excepcion 
//		if (c==3) throw new RuntimeException("la has liado parda");
		System.out.println("fin metodo2");
	}
}
