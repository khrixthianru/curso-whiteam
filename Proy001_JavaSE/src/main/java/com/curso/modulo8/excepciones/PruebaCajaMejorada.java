package com.curso.modulo8.excepciones;

import PractikaMod7AbstYImplem.Caja;
import PractikaMod7AbstYImplem.CargaException;

public class PruebaCajaMejorada {

	public static void main(String[] args) {


		VehiculoMejorado vm = new VehiculoMejorado("aa", 300);
		
		Caja c = new Caja();
		c.setPeso(350);
		
		try {
			vm.cargarCaja(c.getPeso());
		} catch (CargaException e) {
			System.out.println("error " + e.getMessage());
			System.out.println("exceso de carga " + e.getExcesoCarga());
		}

	}

}
