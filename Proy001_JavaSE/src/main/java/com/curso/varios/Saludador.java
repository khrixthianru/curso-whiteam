package com.curso.varios;

public class Saludador {
	//atributos
	
	private String saludo;
	
	//constructores
		public Saludador() {
			super();
			this.saludo = "Hola";
		}
		//sobrecarga de constructores
		public Saludador(String saludo) {
			this.saludo = saludo;
		}
		
	//metodos
		
		public String saluda(String nombreUsuario) {
			return this.saludo + nombreUsuario;
		}
	
	//sobrecargar metodo, el mismo metodo pero con distintos argumentos
	
	public String saluda() {
		return this.saludo + " amigo";
	}

}
