package Modelo6_Herencia;

public class Granja {

	
	public void alimentarAnimales(Animal[] lista) {//puede dar de comer
		//a todos los animale xk son sus hijos
		for(Animal a : lista) {
			if(a instanceof PerroCaza) {
				((PerroCaza) a).olfatearPresa();
			}
			a.comer();
		}
	}
	
	public static void main(String[] args) {
		Animal [] animales = {
				new Perro(), 
				new Gato(),
				new PerroCaza(),
				new Perro(), 
				new Vaca()
		};
		
		Granja granja = new Granja();
		granja.alimentarAnimales(animales);//sobreescribe el metodo alimentaranimales
		//para cada animal
	}
	
	
	
}
