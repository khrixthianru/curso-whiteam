package com.curso.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class EjemploColecciones {

	public static void main(String[] args) {
		
		//tamaño ilimitado, solo admiten objetos, muchos tipos
		/*
		 * Collection es un interface
		 * Set <<I>> alamacenan un valor   no permite duplicados
		 * 	HashSet     no ordenados
		 * 	LinkedHashSet   ordenados por orden de insercion
		 * 	TreeSet   orden natural (Comparable/Comparator)
		 * 
		 * 
		 * List <<I>>
		 * Map <<I>> almacenan key - value
		 * 
		 * clase utilidad collections y arrays
		 * 
		 * 
		 * 
		 * collections genericas
		 * 
		 * comparable y comparator
		 */
		
		Collection c;
		Set<String> s2; //interface colleciones no duplicados
		Set s = new HashSet();
		s.add("Zapato");
		s.add("Avion");
		s.add(new Integer(2));
		s.add(3);
		s.add(3);
		
		Set<String> nombres = new TreeSet<>(); //orden alfabetico
				// new LinkedHashSet<>(); // orden de insercion
				// new HashSet<>(); sin orden
		nombres.add("Maria");
		nombres.add("Juana");
		nombres.add("Periko");
		nombres.add("Karlota");
		boolean anyadido = nombres.add("Maria");
		
		if(!anyadido)System.out.println("No se puede anyadir repetido");
		
		
		System.out.println("--------------------------------");
		
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(0,2);
		Punto p3 = new Punto(1,5);
		Punto p4 = new Punto(1,5);
		
		//no permite duplicado - no hay orden
		Set<Punto> figura = new TreeSet();
		figura.add(p4);
		figura.add(p3);
		figura.add(p2);
		figura.add(p1);
		
		for(Punto p : figura) {
			System.out.println(p);
		}
		
		
		/*
		 * List <<I>>  permiten duplicados y los elementos estan indexados
		 * 	Arraylist	.add(obj)	.add(index,obj)
		 */
		List<String> paises = new ArrayList<String>();
		paises.add("China");
		paises.add("Francia");
		paises.add("Cuba");
		paises.add("Panama");
		

		paises.add(0,"Nicaragua");
		
		System.out.println("Lista de paises-------------------");
		for(String p : paises) {
			System.out.println(p);
		}
		
		Collections.sort(paises);
		
		System.out.println("Lista de paises ordenados-------------------");
		for(String p : paises) {
			System.out.println(p);
		}
		
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("hola");
		lista.addFirst("holafirst");
		lista.addLast("holalast");
		
		//colas
		PriorityQueue<Integer> cola = new PriorityQueue<Integer>();
		cola.add(39);
		cola.add(1);
		cola.add(10);
		cola.add(59);
		cola.add(30);
		
		for(Integer i : cola) {
			System.out.println(i);
		}
		
		Integer trato = cola.peek();
		System.out.println("Me entrega " + trato);// lo entrega y lo mantien
		
		System.out.println(cola.poll());// lo entrega y lo elimina
		
		
		
	}

}
