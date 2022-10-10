package com.curso.Proy007_Enumeraciones;

public class Carta {

	//atributos
	private Palos palo;
	private int valor;
	
	//constructor
	public Carta(Palos palo, int valor) {
		super();
		this.palo = palo;
		this.valor = valor;
	}
	
	//metodos
	public Palos getPalo() {
		return palo;
	}
	
	public int getValor() {
		return valor;
	}
	
}
