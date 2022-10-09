package com.curso.Proy4_2_makinaExp;

public class Refresco {
	//atrib
	private String sabor; //idproducto
	private int cl;
	private double precio;
	private int stock;
	private boolean agotado;
	
	//constructores
	public Refresco(String sabor, int cl, double precio, int stock, boolean agotado) {
		super();
		this.sabor = sabor;
		this.cl = cl;
		this.precio = precio;
		this.stock = stock;
		this.agotado = agotado;
	}
	//para modificar el precio
	public Refresco(String sabor, double precio) {
		this(sabor, 33, precio, 100, true);
		this.sabor = sabor;
		this.precio = precio;
	}
	//para modificar el stock
	public Refresco(String sabor, int stock) {
		this(sabor, 33, 2.0, stock, true);
		this.sabor = sabor;
		this.stock = stock;
	}
	
	//setter and getter
	public String getSabor() {
		return sabor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isAgotado() {
		return agotado;
	}
	public void setAgotado(boolean agotado) {
		this.agotado = agotado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
