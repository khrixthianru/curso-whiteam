package PractikaMod7AbstYImplem;

public class Caja {
	//atrib
	private double peso = 0.0;

	
	//constructor

	public Caja() {
		this.peso = 100;
	}
	
	//metodos

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso <=0) {
			throw new RuntimeException("La caja debe pesar algo.");
		}
		this.peso = peso;
	}
	
}
