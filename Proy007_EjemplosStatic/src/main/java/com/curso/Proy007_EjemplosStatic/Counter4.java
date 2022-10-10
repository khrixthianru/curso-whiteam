package com.curso.Proy007_EjemplosStatic;

public class Counter4 {
	
	//opcion 1 declaracion e inicializacion
	private static int count = 0;
	private static int count2;
	
	//opcion 2 inicializarlo en un bloque static
	
	static {
		count2 = 0;
	}
}
