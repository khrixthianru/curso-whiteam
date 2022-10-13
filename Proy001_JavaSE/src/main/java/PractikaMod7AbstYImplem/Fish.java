package PractikaMod7AbstYImplem;

public class Fish extends Animal implements Pet {

	private String name;
	
	public Fish() {
		super(0);
	}

	@Override
	public String getName() {
		return "flipy";
	}

	@Override
	public void setName(String n) {
		System.out.println(n);
		
	}

	@Override
	public void play() {
		System.out.println("soy un pez y estoy jugando");
		
	}

	@Override
	public void eat() {
		System.out.println("Soy un pez y estoy comiendo");
		
	}
	
	@Override
	public void walk() {
		System.out.println("Soy un pez y no ando, nado");
		
	}
	
	
}
