package com.curso.Juego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TresEnRayaTest {

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
	public void sumarDosmasDosDaCuatro() {
		
		//datos entrada
		TresEnRaya juego = new TresEnRaya();
		int x =2;
		int y=2;
		
		//resultado esperado
		int espero = 4;
		
		//resultado real obtenido
		
		int resul = juego.suma(x,y);
		
		
		//si no coinciden dara fallo
		if(espero != resul) {
			fail("no sumado 2+2 = 4 sino que el resul " + resul);
		}
	}
	
	

}
