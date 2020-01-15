package animals;

import interfaces.IBird;

public abstract class Bird extends Animal implements IBird{

    public Bird(String color, String descpriton)  {
        super(color,descpriton);
    }

    public void speak() {
        System.out.println("Bird is chirping!");
    }

    public void sleep() {
        System.out.println("Bird is sleeping!");
    }

    public void eat() {
        System.out.println("Bird is peck-peck-pecking away!");
    }
    
    public void fly() {
    	System.out.println("Bird is flying");
    }
    
    public void jump() {
    	System.out.println("Bird is jumping");
    }
    
    public void swim() {
    	System.out.println("Bird is swimming");
    }
    
    public void run() {
    	System.out.println("Bird is running");
    }
    
    public void sit() {
    	System.out.println("Bird is sitting");
    }
    
    public void move() {
    	fly();
    	jump();
    	swim();
    	run();
    	sit();
    }
}
