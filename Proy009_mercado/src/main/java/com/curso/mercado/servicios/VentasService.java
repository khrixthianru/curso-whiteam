package com.curso.mercado.servicios;

import java.util.List;

import com.curso.mercado.entidades.Producto;
import com.curso.mercado.persistencia.GenericDAO;
import com.curso.mercado.persistencia.ProductoDAO;

import Excepciones.VentasException;

public class VentasService {

	private ProductoDAO productoDAO = new ProductoDAO();
	
	//todos los metodos relacionados con las ventas
	
	public void comprarProducto(int id, int cantidad) throws VentasException {
		/*
		 * si no existe salta exception
		 * si existe y hay stock resta uno
		 * si existe pero no hay stock salta exception
		 */
		 Producto pAVender = productoDAO.getById(id);
		 
		if(productoDAO.getById(id) == null) {
			throw new VentasException("Error en la venta no existe el producto con id: "+id);
		}
		if(pAVender.getStock()<0) {
			throw new VentasException("Error en la venta no queda stock");
		}
		
		// resto la cantidad al stock actual
		pAVender.setStock(pAVender.getStock() -  cantidad);
		
	}
	
	public List<Producto> listaProductoVenta(){
		return productoDAO.getAll();
	}
	
	
	
	
}
