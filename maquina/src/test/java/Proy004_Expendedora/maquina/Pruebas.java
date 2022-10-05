package Proy004_Expendedora.maquina;

public class Pruebas {

	public static void main(String[] args) {
		Maquina m1 = new Maquina();
		m1.cargarRefrescosPpio();
		System.out.println(m1.getR1().size() + " tipos de refrescos");
		m1.cargarMonedasPpio();
		System.out.println(m1.getM1().size() + " tipos de monedas");
		
		
		System.out.println(m1.venderRefresco("Limon", 2));

	}

}
