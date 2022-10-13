package com.flota.dominio;

public class Moto extends Vehiculo{
	
	private int cilindrada;
	

	public Moto(double cargaMaxima, int cilindrada) {
		super(cargaMaxima);
		this.cilindrada = cilindrada;
	}


	@Override
	public double consumoFuel() {
		return 10;
	}
	
	@Override
	public void cargarCaja(Caja c) {
		//if(this.numCajas == 1) { si estan protected en la clase vehiculo
		if(this.getNumCajas() == 1) {
			throw new RuntimeException("La moto solo puede cargar una caja.");
		}
		super.cargarCaja(c);
	}

}
