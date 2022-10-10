package EjerEmpresa;

import java.util.Date;

public class Empleado {

	public String nombre;
	public double salario;
	public Date fechaNacimiento;
	
	public String getDetails() {
		return "Nombre:" + nombre + "\n salario: " + salario;
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
