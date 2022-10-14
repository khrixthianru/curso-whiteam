package com.curso.Proy008_modulo8_excepciones;

import PractikaMod7AbstYImplem.Caja;
import PractikaMod7AbstYImplem.CargaException;

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

public class VehiculoMejorado {

	//atributos
	private double cargaMaxima = 3000.0;
	private double cargaActual =0.0;
	private String matricula = "";
	private int numCajas = 0;
	//protegido y asi los hijos pueden acceder a esta variable
//	protected String matricula = "";
//	protected int numCajas = 0;

	
	//constructores  crea el objeto reservando la memoria para guardar sus
	// atributos y los inicializa xa ke el objeto sea consistente (preparado)
	public VehiculoMejorado(double cargaMaxima) {
		super();
		this.cargaMaxima = cargaMaxima;
	}

	public VehiculoMejorado() {
		//validar matricula no null
		// validar carga maxima > 0
		super();
	}
	
	public VehiculoMejorado( String matricula, double cargaMaxima) {
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
	public void cargarCaja(double peso) throws CargaException {
		//validar que el peso es > 0
		if(peso <=0) {
			throw new CargaException("La caja debe pesar algo.",0);
		}
		
		//validar que no se pasan de la carga maxima
		if (peso + cargaActual > cargaMaxima) {
			double exceso =  (peso + cargaActual) - cargaMaxima ;
			throw new CargaException("No caben mas cajas.",0);			
		}
		
		this.cargaActual += peso;
		this.numCajas ++;
	}
	
	//sobrecargo el metodo anterior con un objeto caja
	public void cargarCaja(Caja c1) throws CargaException {
		cargarCaja(c1.getPeso());
	}

	public int getNumCajas() {
		return numCajas;
	}

//	public void setNumCajas(int numCajas) {
//		this.numCajas = numCajas;
//	}
	
	//devolver el consumo de cada vehiculo
	//public  abstract double consumoFuel();

	
}
