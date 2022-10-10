package Modelo6_Herencia;

public class Empleado {

	private String nombre;
	private double salario;
	
	public String getDetails() {
		return nombre + " tiene salario" + salario;
	}
	
	//getter and setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
