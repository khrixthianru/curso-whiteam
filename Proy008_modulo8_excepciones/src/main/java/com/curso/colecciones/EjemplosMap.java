package com.curso.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EjemplosMap {

	public static void main(String[] args) {
		//Map<Interface>
		
		Map map;
		/*
		 * solo trabaja con objetos
		 * key es unico
		 * value si pueden estar duplicados
		 * 
		 * 
		 * 
		 * map.put(key,value);
		 * map.get(key):value;
		 */
		
		map = new HashMap(); //no tiene orden
		
		Map<Integer, Punto> figura = new HashMap();
		figura.put(1, new Punto(0,0));
		figura.put(10, new Punto(4,6));
		figura.put(8, new Punto(4,6));
		figura.put(11, new Punto(4,6));
		figura.put(12, new Punto(8,8));// este machaca al anterior key 10

		System.out.println(figura.get(10));
		
		
		figura.remove(1);
		System.out.println(figura.get(1));
		
		Collection<Punto> valores = figura.values();
		Set<Integer> claves = figura.keySet();
		
		System.out.println("...recorre los valores");
		
		for(Integer clave: claves) {
			System.out.println(clave + " " + figura.get(clave));
		}
		
		//HashMap recorre la coleccion a traves de la key sin ordenar
		
		//LinkedHashMap recorre la coleccion a traves de la key x orden de insercion
		
		//TreeMap recorre la coleccion a traves de la key por orden de comparacion
		
		Map<Integer, Punto> figura2 = new HashMap<>();
		figura2.put(1, new Punto(0,0));
		figura2.put(10, new Punto(4,6));
		figura2.put(8, new Punto(4,6));
		figura2.put(11, new Punto(4,6));
		figura2.put(12, new Punto(8,8));
		
System.out.println(figura2.get(1));
		
		Collection<Punto> valores2 = figura2.values();
		Set<Integer> claves2 = figura2.keySet();
		
		System.out.println("...recorre los valores");
		
		for(Integer clave: claves2) {
			System.out.println(clave + " " + figura2.get(clave));
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}
