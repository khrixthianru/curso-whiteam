package com.curso.Juego;

import javax.management.RuntimeErrorException;

/**
 * Implementa el juego 3 en raya
 * @author alumno
 *
 */
public class TresEnRaya {
	
	//atributos
	private Character [][] tablero;
	private Character jugadorActual;
	
	//constructor

	public TresEnRaya() {
		super();
		this.tablero = new Character[3][3];//todas las letras tendran null
		this.jugadorActual = 'X';
	}
	
	//getter and setter
	public Character getJugadorActual() {
		return jugadorActual;
	}
	
	//metodos

	public int suma(int x, int y) {
		return x + y;
	}


	public void jugar(int x, int y) {
		
		validarCoordenada(x);
		
		validarCoordenada(y);
		
		ponerFicha(x,y);		
		
	}
	
	public Character verFicha(int x, int y) {		
		validarCoordenada(x);
		validarCoordenada(y);
		return this.tablero[x][y];
	}
	
	private void validarCoordenada(int x) {
		if(x<0 || x>2) {
			throw new RuntimeException("La ficha no se puede posicionar "
					+ "fuera del tablero. "
					+ "Coordenada x mal.");
		}
	}
	
	private void ponerFicha(int x, int y) {
		//valida que no hay ya una pieza en x,y
		if(tablero[x][y] != null) {
			throw new RuntimeException("ya hay un ficha en esta posicion");
		}
		
		tablero[x][y]= this.jugadorActual;
		
		if(this.jugadorActual == 'X') {
			this.jugadorActual = 'O';
		}else {
			this.jugadorActual = 'X';
		}
	}
	
}
