package com.curso.Proy4_2_makinaExp;

public class Moneda {

	private int moneda; //id de la moneda
	private int cantidad;
	private boolean vacio;
	
	// constructores
	public Moneda(int moneda, int cantidad, boolean vacio) {
		super();
		this.moneda = moneda;
		this.cantidad = cantidad;
		this.vacio = vacio;
	}

	public Moneda(int moneda, int cantidad) {
		this(moneda, cantidad, true);
		this.moneda = moneda;
		this.cantidad = cantidad;
	}
	
	//getter and setter
	public int getMoneda() {
		return moneda;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isVacio() {
		return vacio;
	}

	public void setVacio(boolean vacio) {
		this.vacio = vacio;
	}
	
	
	
}
