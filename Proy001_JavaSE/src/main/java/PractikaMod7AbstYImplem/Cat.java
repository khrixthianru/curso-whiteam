package PractikaMod7AbstYImplem;

public class Cat extends Animal implements Pet{
	
	private String name;

	public Cat( String name) {
		super(4);
		this.name = name;
	}

	public Cat() {
		this("");
	}

	@Override
	public String getName() {
		return "gatito";
	}

	@Override
	public void setName(String n) {
		System.out.println(n);
		
	}

	@Override
	public void play() {
		System.out.println("soy un gato yestoy jugando");
		
	}

	@Override
	public void eat() {
		System.out.println("Soy un gato y estoy comiendo.");
		
	}
	
	

}
