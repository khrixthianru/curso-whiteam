package com.curso.Proy007_EjemplosStatic;

public class EjFinal {
	
	private static final double DESCUENTO_MAX = 30.0;
	private String nombre;
	
	
	public void verDatos() {
		System.out.println("dñflasfkjashdflkjsad");
	}
	
	public final void hazAlgo() {
		System.out.println("trabajando....");
	}

}


final class ClienteVIP extends EjFinal{
	@Override
	public void verDatos() {
		System.out.println("dñflasfkjashdflkjsad");
	}
	
	//este no me deja por que es un metodo final
//	@Override
//	public final void hazAlgo() {
//		System.out.println("trabajando....");
//	}
	
}


//class ClienteExtraVIP extends ClienteVIP{ // error compilacion
//	
//}
