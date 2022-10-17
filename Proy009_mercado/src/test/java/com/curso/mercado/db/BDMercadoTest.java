package com.curso.mercado.db;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.curso.mercado.entidades.Producto;
import com.curso.mercado.servicios.VentasService;

import Excepciones.VentasException;

public class BDMercadoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void insertarUnNuevoProductoDebeDevolverCount4() {
		int contadorEspero = 4;
		
		BDMercado.anyadirProducto("Camisa", 5.0);
		
		assertEquals(BDMercado.getContador(), contadorEspero);
		
		assertEquals(BDMercado.get(4).getDescripcion(), "Camisa");
	}
	
	@Test
	public void getAllProductos() {
		
		Collection<Producto> lista = BDMercado.getAll();
		
		// assertEquals(BDMercado.getContador(), contadorEspero);
	}
	
	@Test
	public void compro4Lapicestodook() throws VentasException {
		
		VentasService ventas = new VentasService();
		
		try {
			ventas.comprarProducto(3, 4);
			assertEquals(BDMercado.get(3).getStock(),1);
			
		} catch (VentasException e) {
			fail("no puede lanzar esta exception. hay lapices");
		}
		
		
		// assertEquals(BDMercado.getContador(), contadorEspero);
	}
	
	@Test
	public void comproMasLapicesdeloskehay() throws VentasException {
		
		VentasService ventas = new VentasService();
		ventas.comprarProducto(3, 7777);
	}

}
