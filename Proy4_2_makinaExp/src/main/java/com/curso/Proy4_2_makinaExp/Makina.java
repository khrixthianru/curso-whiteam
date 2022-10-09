package com.curso.Proy4_2_makinaExp;


import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class Makina {
	
	static ArrayList<Refresco> r1 = new ArrayList<Refresco>();
	static ArrayList<Moneda> m1 = new ArrayList<Moneda>();
	private int refrescosVendidos;
	private double caja;
	
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
	
//	public String venderRefresco(String bebida, double paga) {
//		double vuelta = 0;
//		double vueltaReal;		
//		
//		for(int x=0;x<r1.size();x++) {
//			  if(bebida == r1.get(x).getSabor() && r1.get(x).getStock()>1) {
//					refrescosVendidos ++;
//					caja += paga;
//				  vuelta = (paga * 100) - (r1.get(x).getPrecio() * 100);
//				  if(vuelta<0) {
//					  System.out.println("Importe insuficiente");
//				  }else {
//					  r1.get(x).setStock(r1.get(x).getStock()-1);
//				  }
//			  }
//			}
//		
//		vueltaReal = vuelta;
//		for(int i=m1.size()-1;i>=0;i--) {
//			if(m1.get(i).getCantidad()<=0) {
//				System.out.println("--------------------------\nNO DEVUELVE MONEDAS DE" + m1.get(i).getMoneda() +
//						"\n--------------------------");
//			}
//			if(vuelta>0) {
//				if(m1.get(i).getMoneda() == 100 && vuelta >= 100 && m1.get(i).getCantidad() > 0) {
//					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
//					vuelta -= 100;
//				}else if(m1.get(i).getMoneda() == 50 && vuelta >= 50.0 && m1.get(i).getCantidad() > 0) {
//					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
//					vuelta -= 50;
//				}else if(m1.get(i).getMoneda() == 20 && vuelta >= 20 && m1.get(i).getCantidad() > 0) {
//					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
//					vuelta -= 20;
//				}else if(m1.get(i).getMoneda() == 10 && vuelta >= 10.0 && m1.get(i).getCantidad() > 0) {
//					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
//					vuelta -= 10;
//				}else if(m1.get(i).getMoneda() == 5 && vuelta >= 5 && m1.get(i).getCantidad() > 0)  {
//					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
//					vuelta -= 5;
//				}
//			}
//		}
//		
//		return "La vuelta es de " + (vueltaReal / 100) + " Euros.";
//		
//	}
	
	public double venderRefrescoSiHay(String bebida, double paga) {
		double vuelta = 0;		
		
		for(int x=0;x<r1.size();x++) {
			  if(bebida == r1.get(x).getSabor() && r1.get(x).getStock()>0) {
					refrescosVendidos ++;
					caja += paga;
				  vuelta = (paga * 100) - (r1.get(x).getPrecio() * 100);
				  if(vuelta<0) {
					  System.out.println("Importe insuficiente");
				  }else {
					  r1.get(x).setStock(r1.get(x).getStock()-1);
				  }
			  }
			}
		return vuelta;
	}
	
	public String devolverVuelta(double vueltaReal) {
		double vuelta = 0;
		vuelta = vueltaReal;
		
		for(int i=m1.size()-1;i>=0;i--) {
			if(m1.get(i).getCantidad()<=0) {
				System.out.println("--------------------------\nNO DEVUELVE MONEDAS DE" + m1.get(i).getMoneda() +
						"\n--------------------------");
			}
			if(vuelta>0) {
				if(m1.get(i).getMoneda() == 100 && vuelta >= 100 && m1.get(i).getCantidad() > 0) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
					vuelta -= 100;
				}else if(m1.get(i).getMoneda() == 50 && vuelta >= 50.0 && m1.get(i).getCantidad() > 0) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
					vuelta -= 50;
				}else if(m1.get(i).getMoneda() == 20 && vuelta >= 20 && m1.get(i).getCantidad() > 0) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
					vuelta -= 20;
				}else if(m1.get(i).getMoneda() == 10 && vuelta >= 10.0 && m1.get(i).getCantidad() > 0) {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
					vuelta -= 10;
				}else if(m1.get(i).getMoneda() == 5 && vuelta >= 5 && m1.get(i).getCantidad() > 0)  {
					m1.get(i).setCantidad(m1.get(i).getCantidad()-1);
					vuelta -= 5;
				}
			}
		}
		
		return "La vuelta es de " + (vueltaReal / 100) + " Euros.";
	}
	
	public void informeRefrescos() {
		System.out.println("\nSe han vendido "+ refrescosVendidos + " refrescos en total.\n"
				+ "Quedan:\n");
		for(Refresco r : r1) {
			System.out.println(
					 r.getStock() +" de " + r.getSabor() +".\n"
					 );
		}
	}
	
	public void informeMonedas() {
		System.out.println("Quedan:");
		for(Moneda m : m1) {
			System.out.println(m.getCantidad() + " monedas de " + m.getMoneda());
		}
		System.out.println("TOTAL EN CAJA: " + caja + "€.");
	}
	
	
}
