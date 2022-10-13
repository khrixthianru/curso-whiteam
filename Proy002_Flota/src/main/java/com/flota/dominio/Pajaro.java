package com.flota.dominio;

public class Pajaro implements Volable {

	@Override
	public void despegar() {
		System.out.println("despego como un helicoptero");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("aterrizo como un helicoptero");
		
	}

	@Override
	public void volar() {
		System.out.println("vuelo como un helicoptero");
		
	}

}
