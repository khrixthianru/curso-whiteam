package com.flota.pruebas;

import com.flota.dominio.Caja;
import com.flota.dominio.Vehiculo;

public class Pruebas {

	public static void main(String[] args) {
		Vehiculo camion = new Vehiculo("1234ttt",500.12);
		//camion.cargaMaxima= 555.25;
		camion.setCargaMaxima(6000);
		camion.cargarCaja(500);
		System.out.println(camion.getCargaActual());
		System.out.printf("El camion con matricula %s "+
				"tiene una carga actual de %f kg %n",
				camion.getMatricula(),
				camion.getCargaActual());
		
		System.out.println("Cargo una caja de 560 kg");
		camion.cargarCaja(560);
		
		System.out.printf("El camion con matricula %s "+
				"tiene una carga actual de %f kg %n",
				camion.getMatricula(),
				camion.getCargaActual());
		
//		System.out.println("Cargo una caja de 100 kg");
//		camion.cargarCaja(100);
		
		//prueba con el objeto caja
		System.out.println("Cargo una caja de 300.45 kg");
		Caja c1 = new Caja();
		c1.setPeso(345.56);
		camion.cargarCaja(c1);
		
		System.out.printf("El camion con matricula %s "+
				"tiene una carga actual de %f kg %n",
				camion.getMatricula(),
				camion.getCargaActual());
	}

}
