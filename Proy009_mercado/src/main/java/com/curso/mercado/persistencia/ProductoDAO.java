package com.curso.mercado.persistencia;

import java.util.List;

public class ProductoDAO implements GenericDAO<T> {

	@Override
	public void add(T entidad) {
		System.out.println("grabar en bd " + entidad);
		
	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(T entidad) {
		// TODO Auto-generated method stub
		
	}

}