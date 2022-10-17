package com.curso.mercado.persistencia;

import java.util.ArrayList;
import java.util.List;

import com.curso.mercado.db.BDMercado;
import com.curso.mercado.entidades.Producto;
/**
 * DAO Data Access Object
 * 
 * @author alumno
 *
 */

public class ProductoDAO implements GenericDAO<Producto> {
	
	private BDMercado bdm = new BDMercado();

	@Override
	public void add(Producto entidad) {
	   System.out.println("graba en bd " + entidad);
		
	}

	@Override
	public List<Producto> getAll() {
		return new ArrayList<>(BDMercado.getAll());
	}

	@Override
	public Producto getById(int id) {
		return BDMercado.get(id);
	}

}
