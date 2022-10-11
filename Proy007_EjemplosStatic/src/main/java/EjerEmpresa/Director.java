package EjerEmpresa;

import java.util.Date;

public class Director extends Gerente{

	public double vehiculoEmpresa;
	// constructores
	public Director(String nombre, double salario, Date fechaNacimiento, String departamento, double vehiculo) {
		super(nombre, salario, fechaNacimiento, departamento);
		this.vehiculoEmpresa = vehiculo;
	}
	
	public void aumentarComision() {
		this.salario += this.salario / 20;
	}
	
	public double getVehiculoEmpresa() {
		return vehiculoEmpresa;
	}
	
	public void setVehiculoEmpresa(double vehiculoEmpresa) {
		this.vehiculoEmpresa = vehiculoEmpresa;
	}

}
