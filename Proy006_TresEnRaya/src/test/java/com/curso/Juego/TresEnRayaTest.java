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
	
	@Test (expected = RuntimeException.class)
	public void ponerFichaEnCoordenaXMalLanzaUnaExcepcion() {
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(2,4); //falla si no lanza la exception
			
	}
	

	@Test(expected = RuntimeException.class)
	public void ponerFichaEnCoordenaYMalLanzaUnaExcepcion() {
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(2, 4); // falla si no lanza la exception

	}
	
	@Test(expected = RuntimeException.class)
	public void PonerFichaEnPosicionQyeYaHayOtraFichaLanzaExcepcion() {
		//Preparar el escenario
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		juego.jugar(0, 0);//debe lanzar excepcion
	}
	
	@Test
	public void ponerFichaXeYBienEsperaQueEnEstaPosicionYaNoSeaNul() {
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		
		if(juego.verFicha(0,0) == null) {
			fail("La ficha debe estar en esta posición y no hay ficha");
		}
	}// fin requisito 1
	
	@Test
	public void primerValorEsX() {
		TresEnRaya juego = new TresEnRaya();
		
		if(juego.getJugadorActual() != 'X') {
			fail("El primer jugador debe ser X ");
		}
	}
	
	@Test
	public void siAnteriorJugadorEsXAhoraEsO() {
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		
		if(juego.getJugadorActual() != 'O') {
			fail("El primer jugador debe ser O ");
		}
	}
	
	@Test
	public void siAnteriorJugadorEsOAhoraEsX() {
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		juego.jugar(0, 2);
		
		if(juego.getJugadorActual() != 'X') {
			fail("El primer jugador debe ser X ");
		}
	}
	
	@Test
	public void hayTresEnLinea() {
		TresEnRaya juego = new TresEnRaya();
		
	}
	
	
	
}
	
	

