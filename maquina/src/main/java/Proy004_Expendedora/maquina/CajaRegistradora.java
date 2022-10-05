package Proy004_Expendedora.maquina;

public class CajaRegistradora {

	private int moneda; //id de la moneda
	private int cantidad;
	private boolean vacio;
	
	// constructores
	public CajaRegistradora(int moneda, int cantidad, boolean vacio) {
		super();
		this.moneda = moneda;
		this.cantidad = cantidad;
		this.vacio = vacio;
	}

	public CajaRegistradora(int moneda, int cantidad) {
		this(moneda, cantidad, true);
		this.moneda = moneda;
		this.cantidad = cantidad;
	}
	
	//getter and setter
	public int getMoneda() {
		return moneda;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isVacio() {
		return vacio;
	}

	public void setVacio(boolean vacio) {
		this.vacio = vacio;
	}
	
	
	
}
