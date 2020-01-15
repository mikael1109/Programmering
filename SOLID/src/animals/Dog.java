package animals;

import interfaces.IDog;

public class Dog extends Animal implements IDog{
    public Dog(String color, String descpriton)  {
        super(color,descpriton);
    }

    public void speak() {
        System.out.println("Dog is barking!");
    }

    public void sleep() {
        System.out.println("Dog is sleeping!");
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void trot() {
        System.out.println("Dog is a champion!");
    }

    public void skip() {
        System.out.println("Dog is happy!");
    }


    public void jump() {
        System.out.println("Dog is agile!");
    }

    public void swim() {
        System.out.println("Dog is swimming!");
    }

    public void run() {
        System.out.println("Dog running!");
    }

    public void roll() {
        System.out.println("Who's a good boi!");
    }

    public void sit() {
        System.out.println("Staaaaay!");
    }

    public void dash() {
        System.out.println("Dog so fast!");
    }
    
    public void move() {
    	dash();
    	roll();
    	skip();
    	trot();
    	jump();
    	swim();
    	run();
    	sit();
    }
}
