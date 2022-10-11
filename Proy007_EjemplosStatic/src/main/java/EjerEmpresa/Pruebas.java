package EjerEmpresa;

import java.util.Date;

public class Pruebas {

	public static void main(String[] args) {
		Empleado e = new Empleado("Periko", 40000, new Date());
		Director d = new Director("Marta", 45000.0, new Date(), "Toda la empresa",2);
//		Gerente g = new Gerente();
		Gerente g2 = new Gerente("KHRIX", 50000.0, new Date(), "Informática");
		Ingeniero i = new Ingeniero("Maria");
		Secretario s = new Secretario("Ester");
		
		e.nombre = "Periko";
		e.salario = 40000;
		//System.out.println(e.getDetails());
		
//		g.nombre = "Maria";
//		g.salario = 45000;
//		g.setDepartamento("marketing");
		System.out.println(g2.getDetails());
		
//		d.nombre = "Marta";
//		d.salario = 50000;
//		d.setDepartamento("toda la empresa es suya");
//		d.vehiculoEmpresa = 2;
//		d.aumentarComision();
		System.out.println(d.getDetails());
		
//		Empleado[] array = {e,g2,d};
//		for(Empleado x : array) {
//			if(x instanceof Gerente)
//			x.getDetails();
//			if(x instanceof Director)
//			x.getDetails();
//		}
		
		//pruebas cliente
		// comparacion entre objetos
		Cliente c1 = new Cliente(1,"laura");
		Cliente c2 = new Cliente(1,"laura");
		
		System.out.println("c1== c2 " + (c1 == c2));//compara direcciones de memoria false
		// System.out.println("c1 equals c2 " + (c1.equals(c2)));//compara direcciones de memoria false
		//le he puesto en cliente la sobre escritura de  hascode y equals
		System.out.println("c1 equals c2 " + (c1.equals(c2))); // true, ya compara los objetos
		

	}

}
