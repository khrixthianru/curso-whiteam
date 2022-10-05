package com.flota.dominio;

/**
 * 
 * Clase que representa un vehiculo de una flota
 * puede transportar cajas
 * pero tiene una carga maxima permitida
 * 
 * @author khrixthian
 * @version 1
 *
 */

public class Vehiculo {

	//atributos
	private double cargaMaxima = 3000.0;
	private double cargaActual =0.0;
	private String matricula = "";
	private int numCajas = 0;

	
	//constructores  crea el objeto reservando la memoria para guardar sus
	// atributos y los inicializa xa ke el objeto sea consistente (preparado)
	public Vehiculo(double cargaMaxima) {
		super();
		this.cargaMaxima = cargaMaxima;
	}

	public Vehiculo() {
		//validar matricula no null
		// validar carga maxima > 0
		super();
	}
	
	public Vehiculo( String matricula, double cargaMaxima) {
		super();
		this.cargaMaxima = cargaMaxima;
		this.matricula = matricula;
	}

	//metodos
	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		if(cargaMaxima < 0) {
			throw new RuntimeException("No puede pasar una carga negativa.");
		}
		this.cargaMaxima = cargaMaxima;
	}

	public double getCargaActual() {
		return cargaActual;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * Metodo que recibe el peso de la caja a cargar 
	 * e incrementa el peso actual del camion
	 * y el numero de cajas cargadas.
	 * Si el peso no es valido (<0) lanza una excepcion
	 * 
	 * si el peso a cargar supera el max permitido exception
	 * 
	 * @param peso peso de la caja a cargar en kg
	 * 
	 * throws RuntimeException el peso de la caja no es valido o supera la tara
	 */
	public void cargarCaja(double peso) {
		//validar que el peso es > 0
		if(peso <=0) {
			throw new RuntimeException("La caja debe pesar algo.");
		}
		
		//validar que no se pasan de la carga maxima
		if (peso + cargaActual > cargaMaxima) {
			throw new RuntimeException("No caben mas cajas.");			
		}
		
		this.cargaActual += peso;
		this.numCajas ++;
	}
	
	//sobrecargo el metodo anterior con un objeto caja
	public void cargarCaja(Caja c1) {
		cargarCaja(c1.getPeso());
	}

	public int getNumCajas() {
		return numCajas;
	}

//	public void setNumCajas(int numCajas) {
//		this.numCajas = numCajas;
//	}

	
}
