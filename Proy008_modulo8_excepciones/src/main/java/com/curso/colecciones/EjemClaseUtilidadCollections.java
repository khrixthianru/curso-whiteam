package com.curso.colecciones;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EjemClaseUtilidadCollections {

	public static void main(String[] args) {
		Set<Integer> valores = new HashSet();
		valores.add(25);
		valores.add(42);
		valores.add(3);
		valores.add(8);
		valores.add(12);
		
		for(Integer i: valores) {
			System.out.println(i);
		}
		
		// Collections.sort(valores);

	}

}
