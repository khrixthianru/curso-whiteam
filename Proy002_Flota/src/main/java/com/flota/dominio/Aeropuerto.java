package com.flota.dominio;

public class Aeropuerto {

	public void gestionarVuelo(Volable v) {
		v.despegar();
		v.volar();
		v.aterrizar();
	}
	
	public static void main(String[] args) {
		/*
		 * la variable de ref v puede apuntar a cualkier obj que implemente el interface volable
		 */
		Volable x = new Avion("sdagfsadg", 3456);
		Aeropuerto aeropuerto = new Aeropuerto()
;
		aeropuerto.gestionarVuelo(x);
		
		Pajaro p = new Pajaro();
		aeropuerto.gestionarVuelo(x);
	}
}
