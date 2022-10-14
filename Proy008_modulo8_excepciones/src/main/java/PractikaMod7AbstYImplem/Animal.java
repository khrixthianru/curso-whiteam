package PractikaMod7AbstYImplem;

public  abstract class Animal {
	
	protected int legs;

	public Animal(int legs) {
		super();
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("me gusta andar con mis " + this.legs + " patas");
	}
	
	public abstract void eat();

}
