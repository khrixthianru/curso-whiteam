package EjerEmpresa;

public class Director extends Gerente{
	public double vehiculoEmpresa;
	
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
