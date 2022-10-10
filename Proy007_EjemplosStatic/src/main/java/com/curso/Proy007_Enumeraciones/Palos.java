package com.curso.Proy007_Enumeraciones;

public enum Palos {

	OROS, BASTOS, COPAS, ESPADAS
}

enum ModelosCoche{
	//si tiene otros atributos y construc se termina la serie con ;
	BASICO("Solo tiene motor y ruedas"),
	MEDIO("además tiene aire"),
	SUPERIOR("con navegador");
	
	//ATRIBUTOS
	private String descripcion;
	
	//constructores
	private ModelosCoche(String s) {
		this.descripcion = s;
	}
	
	//metodos
	public String getDescripcion() {
		return descripcion;
	}
	//si ponemos set afecta a toda la aplicacion, mejor no usar
//	public void setDescripcion(String descripcion) {
//		this.descripcion = descripcion;
//	}
	
	
}
