package com.flota.informes;

import java.io.PrintStream;

import com.flota.dominio.Vehiculo;

public class InformesCombustibleNecesarios {

	private Vehiculo[] flota;

	public InformesCombustibleNecesarios(Vehiculo[] flota) {
		super();
		this.flota = flota;
	}
	
	public void generateText(PrintStream out) {
		out.println(".... Informe consumo combustible");
		for(Vehiculo v : this.flota) {
			out.printf("El/La " + v.getClass().getSimpleName() + " con matricula %s consume %f %n",
			v.getMatricula(),
			v.consumoFuel());
		}
		//todo el tema del total de toda la flota
	}
}
