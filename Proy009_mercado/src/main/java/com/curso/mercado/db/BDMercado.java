package com.curso.mercado.db;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import com.curso.mercado.entidades.Producto;

public class BDMercado {
	

	private static Map<Integer, Producto> tablaProducto;
	private static int contador = 0;
	//iniciar el static tablaProducto
	static {
		tablaProducto = new TreeMap();
		tablaProducto.put(contador++, new Producto(1, "Libro Recetas", 30.0));
		tablaProducto.put(contador++, new Producto(2, "Jarrón", 20.0));
		tablaProducto.put(contador++, new Producto(3, "lápiz", 3.0));
	}
	
	
	
	//crear los metodos añadir, borrar, modificar, solicitar por id y todos
	
	public static void anyadirProducto(String nombre, double precio) {
		contador++;
		tablaProducto.put(contador, new Producto(contador, nombre,precio));
	}
	
	public static Collection<Producto> getAll(){
		return tablaProducto.values();
		
	}
	
	public static Producto get(int id) {
		return tablaProducto.get(id);
	}
	
	public static void update(Producto pModif) throws Exception {
		Producto p = get(pModif.getIdProducto());
		if(p == null) {
			throw new Exception("Producto no encontrado para ser modificado");
		}
		tablaProducto.put(pModif.getIdProducto(), pModif);
	}
	
	public static void delete(int id) {
		tablaProducto.remove(id);
	}

	public static Object getContador() {
		
		return contador;
	}

}
