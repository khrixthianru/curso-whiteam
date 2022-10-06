package com.curso.pruebas;
import java.io.Serializable;
/*
 * mover a lo de begoña modulo 4
 */
import java.util.Date;
/*
 * Clase entidad
 * Representa los datos de un pedido
 */
public class Pedido implements Serializable { //extends Object todas las clases tienen esto
	//Serializable permite pausarlo y guardarlo en disco duro entre otras cosas
	private int idPedido;
	private Date fechaPedido;
	private int idProducto;
	private int cantidad;
	private String observaciones;
	
	//constructores
	public Pedido(int idPedido, Date fechaPedido, int idProducto, int cantidad, String observaciones) {
		super();
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.observaciones = observaciones;
	}

	public Pedido(int idPedido) {
		// super(); esto da error por que llama 2 veces al const del padre
		this(idPedido, new Date(), 0, 0, "");
		this.idPedido = idPedido;
	}
	
	//get set

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fechaPedido=" + fechaPedido + ", idProducto=" + idProducto
				+ ", cantidad=" + cantidad + ", observaciones=" + observaciones + "]";
	}
	
	
	
	
	
	
	
	
}
