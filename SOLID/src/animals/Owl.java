package animals;

import interfaces.IOwl;

public class Owl extends Bird implements IOwl{

    public Owl(String color, String descpriton)  {
        super(color,descpriton);
    }

    public void fly() {
        System.out.println("Owl is gliding silently through the air!");
    }

    public void skip() {
        System.out.println("Owl is skipping and hopping!");
    }

    public void jump() {
        System.out.println("Owl is jumping!");
    }

    public void sit() {
        System.out.println("Owl is squatting on dem eggs!");
    }

	public void run() {
		System.out.println("Owl is running!");
		
	}
	
	public void swim() {
		System.out.println("Owl is swimming!");
		
	}
	
	public void move() {
    	fly();
    	jump();
    	swim();
    	run();
    	sit();
    	skip();
    }

}
