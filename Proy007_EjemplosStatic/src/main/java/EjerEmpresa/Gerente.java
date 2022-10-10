package EjerEmpresa;

public class Gerente extends Empleado{

	//atributos los del padre mas los suyos
	private String departamento;
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getDetails() {
		return "Nombre:" + nombre + "\n salario: " + salario + "\n gerente de: " + departamento;
	}
	
}
