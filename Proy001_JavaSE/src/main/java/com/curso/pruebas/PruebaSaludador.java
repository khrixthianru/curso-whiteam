package com.curso.pruebas;

import java.util.Date;

import com.curso.varios.Saludador;
//import com.mybank.domain.Proy003_bank.Pedido;

public class PruebaSaludador {

	public static void main(String[] args) {
		// Uso de la clase Saludador
		
		//se puede crear un objeto saludador
			// com.curso.varios.Saludador;   o el import de arriba
			Saludador s1 = new Saludador(); //variable de referencia, apuntador
		
		//pedir saludar pasando nombre
			System.out.println(s1.saluda(" Khrixthian"));
		
		//pedir saludar sin nombre
			System.out.println(s1.saluda());
			
		// crear un saludador en el que indique el saludo
			Saludador s2 = new Saludador("Buenos dias");
			
		//pedir saludo sin nombre
			System.out.println(s2.saluda());
			
			//pruebas modulo 4 begoña
			Pedido p = new Pedido(1);
			
			p.setCantidad(10);
			p.setIdPedido(45);
			p.setFechaPedido(new Date());
			p.setObservaciones("urgente");
			
			System.out.println(p);
			
			Pedido p3 = p;
			System.out.println(p3.toString());

	}

}
