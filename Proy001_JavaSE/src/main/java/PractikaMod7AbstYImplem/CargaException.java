package PractikaMod7AbstYImplem;

public class CargaException extends Exception{
	
	//atributos que quiero informar
	private double excesoCarga;

	public CargaException(String msg, double exceso) {
		super(msg);
		this.excesoCarga = exceso;
	}
	
	public double getExcesoCarga() {
		return excesoCarga;
	}
	
	

}
