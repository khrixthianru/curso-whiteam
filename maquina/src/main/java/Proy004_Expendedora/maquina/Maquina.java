package Proy004_Expendedora.maquina;

import java.util.ArrayList;

public class Maquina {
	
	static ArrayList<Refresco> r1 = new ArrayList<Refresco>();
	static ArrayList<Moneda> m1 = new ArrayList<Moneda>();
	
	//constructor
	public Maquina(ArrayList<Refresco> r1, ArrayList<Moneda> m1) {
		super();
		this.r1 = r1;
		this.m1 = m1;
	}
	
	public Maquina() {
		super();
	}
	
//	//recargar refrescos
//	public Maquina(ArrayList<Refresco> r1) {
//		this(r1, m1);
//		this.r1 = r1;
//	}
//	
//	// recargar monedas
//	public Maquina(ArrayList<Moneda> m1) {
//		this(r1, m1);
//		this.m1 = m1;
//	}
	
	//getter and setter	
	public static ArrayList<Refresco> getR1() {
		return r1;
	}

	public static void setR1(ArrayList<Refresco> r1) {
		Maquina.r1 = r1;
	}

	public ArrayList<Moneda> getM1() {
		return m1;
	}

	public void setM1(ArrayList<Moneda> m1) {
		this.m1 = m1;
	}
	
	
	//recargar refrescos al ppio.
	public static void cargarRefrescosPpio(){		
		for(int i=0;i<1;i++) {
			Refresco r = new Refresco("Naranja",1.2);
			r.setStock(100);
			r1.add(r);	
			Refresco r2 = new Refresco("Cola",1.35);
			r2.setStock(100);
			r1.add(r2);	
			Refresco r3 = new Refresco("Limon",1.5);
			r3.setStock(100);
			r1.add(r3);	
			Refresco r4 = new Refresco("Agua",0.9);
			r4.setStock(100);
			r1.add(r4);	
		}
	}

	//recargar monedas al ppio.
	public static void cargarMonedasPpio() {
		for(int i=0;i<1;i++) {
			Moneda m = new Moneda(5,100);//valor, cantidad
			m1.add(m);
			Moneda m2 = new Moneda(10,100);
			m1.add(m2);
			Moneda m3 = new Moneda(20,100);
			m1.add(m3);
			Moneda m4 = new Moneda(50,100);
			m1.add(m4);
			Moneda m5 = new Moneda(100,100);
			m1.add(m5);
		}
	}
	
	public String venderRefresco(String bebida, double paga) {
		double vuelta = 0;
		// String respuesta = "La vuelta es de ";
		for(int x=0;x<r1.size();x++) {
			  if(bebida == r1.get(x).getSabor()) {
				  vuelta = (paga * 100) - (r1.get(x).getPrecio() * 100);
				  if(vuelta<0) {
					  System.out.println("Importe insuficiente");
				  }else {
					  r1.get(x).setStock(r1.get(x).getStock()-1);
				  }
			  }
			}
		
		for(int i=m1.size();i<0;i--) {
			if(vuelta>0) {
				if(m1.get(i).getMoneda() == 100 && vuelta >= 100) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
					vuelta -= 100;
				//		respuesta += "1€ ";
				}else if(m1.get(i).getMoneda() == 50 && vuelta >= 50.0) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
					vuelta -= 50;
				//		respuesta += " 50cts ";
				}else if(m1.get(i).getMoneda() == 20 && vuelta >= 20) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
					vuelta -= 20;
				//		respuesta += " 20cts ";
				}else if(m1.get(i).getMoneda() == 10 && vuelta >= 10.0) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
					vuelta -= 10;
				//	respuesta += " 10cts ";
				}else {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
					vuelta -= 5;
				//	respuesta += " 5cts ";
				}
			}
		}
		
		if(vuelta>0) {
			return "La vuelta es de " + (vuelta / 100) + " Euros.";
		}else {
			return "";
		}
		
	}
	
	
}
