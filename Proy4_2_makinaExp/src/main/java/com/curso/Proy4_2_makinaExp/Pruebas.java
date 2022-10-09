package com.curso.Proy4_2_makinaExp;

public class Pruebas {

	public static void main(String[] args) {
		Makina m1 = new Makina();
		m1.cargarRefrescosPpio();
		System.out.println(m1.getR1().size() + " tipos de refrescos");
		m1.cargarMonedasPpio();
		System.out.println(m1.getM1().size() + " tipos de monedas");		
		
//		System.out.print(m1.venderRefresco("Cola", 1.9));
		System.out.print(m1.venderRefrescoSiHay("Naranja", 1.5));
	//			System.out.print(m1.venderRefresco("Limon", 1.7));
	//		System.out.print(m1.venderRefresco("Agua", 2));
		m1.informeRefrescos();
		m1.informeMonedas();

	}

}
