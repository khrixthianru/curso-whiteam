package com.curso.Proy007_Enumeraciones;

//con esta import te evitas poner siempre Palos.Oros o lo ke sea, 
//mejor no hacerlo para saber de donde estamos cogiendolos
import static com.curso.Proy007_Enumeraciones.Palos.*;

public class JuegoCartas {

	public static void main(String[] args) {
		Carta c1 = new Carta(Palos.OROS,2);
		
		Palos[] valores = Palos.values();
		System.out.println(Palos.OROS.ordinal());//posicion en el enum
		
		System.out.println("...los palos son");
		for (Palos p: valores) {
			System.out.println(p);
			System.out.printf("%s ordinal %d %n", p, p.ordinal());
		}
		
		if(c1.getPalo() == Palos.OROS) {
			System.out.println("....eres el mejor");
		}
		
		
	}
}
