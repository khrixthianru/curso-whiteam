package Modelo6_Herencia;

public class Animal {

	private String sonido;
	
	public void comer() {
		System.out.println("Estoy comiendo");
	}
	
	public static void main(String[] args) {
		
		/*Gato g = new Gato();  si
		*g = new Perro();   no
		*g = new Animal();  no
		*
		*
		*Animal a = service.getAnimal(2);
		*g=a; //  no
		*
		*/
		Animal a = new Perro();
		Perro p = new Perro();
		
		//polimorfismo  puede acceder a su clase y sus clases hijos
		PerroCaza p2 = new PerroCaza();
		a= p2;
		p = p2;
		
		if(p instanceof PerroCaza) {
			PerroCaza caza = (PerroCaza)p;
			caza.olfatearPresa();
		}
	}
}

class Perro extends Animal{
	
	private String raza;
	/*
	 * al sobreescribir el metodo comer en cada animal 
	 * muestra lo de cada animal
	 */
	@Override
	public void comer() {
		System.out.println("Estoy comiendo huesos o pienso");
	}
}

class PerroCaza extends Perro{
	
	private int altura;

	public void olfatearPresa() {
		System.out.println("Oliendo la presa");
	}
	
	@Override
	public void comer() {
		System.out.println("Como lo que he cazado");
	}
}

class Gato extends Animal{
	@Override
	public void comer() {
		System.out.println("Como ratones");
	}
}

class Vaca extends Animal{
	@Override
	public void comer() {
		System.out.println("Como hierba fresca");
	}
}


/*
*Gato g = new Gato();  si
*g = new Perro();   no
*g = new Animal();
*
*
*Animal a = serrvice.getAnimal(2);
*g=a; //  no
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*

*/