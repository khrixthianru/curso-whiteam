package com.curso.varios;

public class EjemploVariablesReferenciaHeap {

	//main 1 metodo
	public static void main(String[] args) {
		Alumno a = new Alumno(1);
		metodo1(a);
		System.out.println("eL ID DEL ALUMNO ES " + a.getId());
		System.out.println("fin main");
	}
	
	public static void metodo1(Alumno a) {
		Alumno b = a;
		metodo2();
		System.out.println("fin metodo1");
	}
	
	public static void metodo2() {
		Alumno c = new Alumno(2);
		//provoco una excepcion 
//		if (c==3) throw new RuntimeException("la has liado parda");
		System.out.println("fin metodo2");
	}
}
