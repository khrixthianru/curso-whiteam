package Modelo6_Herencia;

public class Prueba {

	public static void main(String[] args) {

		Empleado e = new Empleado();
		e.setNombre("Evaristo");
		e.setSalario(40000);
		
		Gerente g = new Gerente();
		g.setNombre("Maria Juana");
		g.setDepartamento("Desarrollo");
		g.setSalario(70000);
		
		System.out.println("g es un gerente? " + (g instanceof Gerente));
		
		System.out.println("g es un empleado? " + (g instanceof Empleado));
		
		System.out.println("e es un gerente? " + (e instanceof Gerente));
		
		//una variable de referencia puede apuntar a objetos de su clase
		// o a clases hijas
		
		Empleado marta = new Gerente();
		marta.setNombre("Marta Aguilar");
		marta.setSalario(50000);
		// marta.setDepartamento("..."); no puede acceder por que es empleada
		// a la izkierda
		
		//marta solo es un empleado por lo que solo puede usar los metodos de
		//empleado, no a los de gerente

	}

}
