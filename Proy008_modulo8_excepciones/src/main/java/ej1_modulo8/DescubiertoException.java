package ej1_modulo8;

public class DescubiertoException extends Exception {
	
	private double deficit;

	public DescubiertoException(String msg, double deficit) {
		super(msg);
		this.deficit = deficit;
	}
	
	public double getDeficit() {
		return deficit;
	}

}
