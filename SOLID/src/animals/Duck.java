package animals;

import interfaces.IDuck;

public class Duck extends Bird implements IDuck {

    public Duck(String color, String descpriton)  {
        super(color,descpriton);
    }

    
    public void fly() {
        System.out.println("Duck is soaring majestically!");
    }


    public void jump() {
        System.out.println("Duck is jumping!");
    }

    
    public void swim() {
        System.out.println("Duck is zooming like a speed boat!");
    }

    
    public void run() {
        System.out.println("Duck is running for takeoff!");
    }

    
    public void sit() {
        System.out.println("Duck is squatting on dem eggs!");
    }
    
    public void roll() {
        System.out.println("Duck is good boi!");
    }
    
    public void move() {
    	fly();
    	jump();
    	swim();
    	run();
    	sit();
    	roll();
    }

}
