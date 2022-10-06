package com.curso.pruebas;

public class EjemploVConversionTipos {

	public static void main(String[] args) {

		//8 tipos primitivos
		
		//entero
		byte a = 1; // 8 bits
		short b = 1; //16 bits
		int i =1; //32 bits
		long l = 11; //64 bits

		//literales enteros
		int num = 1; // literal d etipo int 32 bits
		long n2 = 1; //entero 32 bits cabe en un long
		long n3 = 1L; // literal long de 64 nits
		
//		casting enteros
		int x = 2;
		long y = x; //casting implicito
		
		long z =1L;
		int zz = (int)z; //casting explicito. la makina virtual java kita los 1ºs 33 bits del long
		System.out.println(z);
		System.out.println(zz);
		
		//decimales
		
		float f= 45.5f;  //32 bits  literal 1.0f, sin la f peta
		double d = 333.0; //64 bits  literal 1.0
		
		//caracter
		char c = 'x';
		char c2 = '\u03A6';
		System.out.println(c2);

	}

}
