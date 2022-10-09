package paketeKreado;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MakinaTest {

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
	public void intentaDevolverUnaMonedaInexistente() {
		// fail("Not yet implemented");
		
		//datos entrada
		Makina m = new Makina();
		
		// resultado esperado
		
		// resultado real
		String resultado = m.comprobarHayUnaMoneda(20);
		// comparacion
		if(resultado != null) System.out.println("OK");
	}
	
	@Test
	public void intentaVenderRefrescoAgotado() {
		// fail("Not yet implemented");
		
		//datos entrada
		Makina m = new Makina();
		String bebida = "Naranja";
		double paga = 1;
		
		// resultado esperado
		String espero = "Producto agotado";
		
		// resultado real
		String resul = m.venderRefrescoSiHay(bebida, paga);
		
		// comparacion
		if(espero == resul) System.out.println("OK");
	}
	
	@Test
	public void intentaVenderRefrescoConMenosDinero() {
		// fail("Not yet implemented");
		
		//datos entrada
		Makina m = new Makina();
		String bebida = "Naranja";
		double paga = 1;
		
		// resultado esperado
		String espero = "Importe insuficiente";
		
		// resultado real
		String resul = m.venderRefrescoSiHay(bebida, paga);
		
		// comparacion
		if(espero == resul) System.out.println("OK");
	}

	@Test
	public void devuelveLaVueltaDeRefrescoExistente() {
		// fail("Not yet implemented");
		
		//datos entrada
		Makina m = new Makina();
		String bebida = "Naranja";
		double paga = 1.5;
		
		// resultado esperado
		String espero = "La vuelta es de 0.3 Euros.";
		
		// resultado real
		String resul = m.devolverVuelta(m.venderRefrescoSiHay(bebida, paga));
		
		// comparacion
		if(espero.equals(resul)) System.out.println("OK");
		//assertEquals("La vuelta es de 0.3 Euros.", resul);
	}
	
	@Test
	public void comprobarInformeRefrescos() {
		// fail("Not yet implemented");
		
		//datos entrada
		Makina m = new Makina();
		
		// resultado esperado
		String resul = m.informeRefrescos();
		
		// resultado real
		
		// comparacion
		if(resul != null) System.out.println("OK");
		
	}
	
	@Test
	public void comprobarInformeMonedas() {
		// fail("Not yet implemented");
		
		//datos entrada
		Makina m = new Makina();
		
		// resultado esperado
		String resul = m.informeMonedas();
		
		// resultado real
		
		// comparacion
		if(resul != null) System.out.println("OK");
		
	}

}
