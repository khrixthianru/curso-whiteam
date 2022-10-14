package ej1_modulo8;

public class TestBanking {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("Jane", "Smith");
		CheckingAcount cuentac1 = new CheckingAcount(200.0, 500.0);
		try {
			cuentac1.withdraw(150);
		} catch (DescubiertoException e) {
			System.out.println("Fondos insuficientes");
		}
		
	}

}
