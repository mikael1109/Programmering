package animals;

import interfaces.IHedgehog;

public class Hedgehog extends Animal implements IHedgehog{

    public Hedgehog(String color, String descpriton)  {
        super(color,descpriton);
    }

    public void speak() {
        System.out.println("Hedgehog is squeeking!");
    }

    public void sleep() {
        System.out.println("Hedgehog is napping!");
    }

    public void eat() {
        System.out.println("Hedgehog is omnomnoming!");
    }


     
    public void trot() {
        System.out.println("Hedgehog is trotting!");
    }

     
    public void skip() {
        System.out.println("Hedgehog is skipping and hopping!");
    }

     
    public void swim() {
        System.out.println("Hedgehog is stalking snaek!");
    }

     
    public void roll() {
        System.out.println("Sonic is rolling so fast!");
    }

     
    public void sit() {
        System.out.println("Hedgehog sitting for tea!");
    }

     
    public void dash() {
        System.out.println("Sonic the speedster!");
    }
    
    public void move() {
    	swim();
    	sit();
    	roll();
    	dash();
    	skip();
    	trot();
    }

}
