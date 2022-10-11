package EjerEmpresa;

import java.util.Date;

public class Gerente extends Empleado{

	//atributos los del padre mas los suyos
	private String departamento;
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	//constructor

	public Gerente(String nombre, double salario, Date fechaNacimiento, String departamento) {
		super(nombre, salario, fechaNacimiento); //constructor del padre (empleado)
		this.departamento = departamento;
	}
	
	public Gerente(String nombre, String departamento) {
		super(nombre);  //constructor del padre (empleado)
		this.departamento = departamento;
	}
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails() + "\n Gerente de: " + departamento;
	}
	
}
