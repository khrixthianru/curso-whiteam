package paketeKreado;


import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

import javax.management.RuntimeErrorException;

public class Makina {
	
	static ArrayList<Refresco> r1 = new ArrayList<Refresco>();
	static ArrayList<Moneda> m1 = new ArrayList<Moneda>();
	private int refrescosVendidos;
	private double caja;
	private double vuelta;
	
	//constructor
	public Makina(ArrayList<Refresco> r1, ArrayList<Moneda> m1) {
		super();
		this.r1 = r1;
		this.m1 = m1;
	}
	
	public Makina() {
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
		Makina.r1 = r1;
	}

	public ArrayList<Moneda> getM1() {
		return m1;
	}

	public void setM1(ArrayList<Moneda> m1) {
		this.m1 = m1;
	}
	
	
	//recargar refrescos al ppio.
	public static void cargarRefrescosPpio(){		
		
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

	//recargar monedas al ppio.
	public static void cargarMonedasPpio() {
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
	
	public double venderRefrescoSiHay(String bebida, double paga) {
		vuelta = 0;	
		
		for(int x=0;x<r1.size();x++) {
			String sabor = r1.get(x).getSabor();
			 if(sabor == bebida && r1.get(x).getPrecio()> paga) {
				 System.out.println("Importe insuficiente");
				 throw new RuntimeErrorException(null, "Importe insuficiente");
			  }else if(r1.get(x).getSabor() == bebida && r1.get(x).getStock()<1) {
				  System.out.println("Producto agotado");
					 throw new RuntimeErrorException(null, "Producto agotado");
			  }else if(r1.get(x).getSabor() == bebida && r1.get(x).getStock()>1) {
				  refrescosVendidos ++;
				  caja += paga;
				  vuelta = (paga * 100) - (r1.get(x).getPrecio() * 100);
				  r1.get(x).setStock(r1.get(x).getStock()-1);
			  }
			  
			}
		//ke devuelva las vueltas en double
		return vuelta;
	}
	
	//este me hace petar la vuelta, me devuelve negativo
	public String comprobarHayUnaMoneda(int monedaEntrante) {
		String resp = null;
		for(int i=m1.size()-1;i>=0;i--) {
			if(m1.get(i).getMoneda() == monedaEntrante && m1.get(i).getCantidad()<=0) {
				resp ="--------------------------\nNO DEVUELVE MONEDAS DE" + m1.get(i).getMoneda() +
						"\n--------------------------";
			}
		}
		
		return resp;
	}
	
	public String devolverVuelta(double x) {
		vuelta = x;
		
		for(int i=m1.size()-1;i>=0;i--) {
			if(m1.get(i).getCantidad()<=0) {				
				throw new RuntimeErrorException(null, "--------------------------\nNO DEVUELVE MONEDAS DE " + m1.get(i).getMoneda() +
						"\n--------------------------");
//				System.out.println("--------------------------\nNO DEVUELVE MONEDAS DE " + m1.get(i).getMoneda() +
//						"\n--------------------------");
			}
			// en el if de abajo ponia el metodo de comprobar hay una moneda == null
	//		if(vuelta>0) {
				if(m1.get(i).getMoneda() == 100 && vuelta >= 100 && m1.get(i).getCantidad() > 0) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
				}else if(m1.get(i).getMoneda() == 50 && vuelta >= 50.0 && m1.get(i).getCantidad() > 0) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
				}else if(m1.get(i).getMoneda() == 20 && vuelta >= 20 && m1.get(i).getCantidad() > 0) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
				}else if(m1.get(i).getMoneda() == 10 && vuelta >= 10.0 && m1.get(i).getCantidad() > 0) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
				}else if(m1.get(i).getMoneda() == 5 && vuelta >= 5 && m1.get(i).getCantidad() > 0)  {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
				}
		//	}
		}
		
		return "La vuelta es de " + (vuelta / 100) + " Euros.";
		
	}
	
	public String informeRefrescos() {
		String respuesta;
		respuesta = "\nSe han vendido "+ refrescosVendidos + " refrescos en total.\n"
				+ "Quedan:\n";
		for(Refresco r : r1) {
			respuesta += r.getStock() +" de " + r.getSabor() +".\n";
		}
		
		return respuesta;
	}
	
	public String informeMonedas() {
		String respuesta;
		respuesta = "Quedan:";
		for(Moneda m : m1) {
			respuesta += m.getCantidad() + " monedas de " + m.getMoneda() + ".\n";
		}
		System.out.println("TOTAL EN CAJA: " + caja + "€.");
		
		return respuesta;
	}
	
	
}
