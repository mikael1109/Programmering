package animals;

import interfaces.ISnake;

public class Snake extends Animal implements ISnake{

    public Snake(String color, String descpriton)  {
        super(color,descpriton);
    }

    public void speak() {
        System.out.println("Snake is hissing!");
    }

    public void sleep() {
        System.out.println("Snake is sleeping!");
    }

    public void eat() {
        System.out.println("Snake is devouring!");
    }

    public void slither() {
        System.out.println("Snake is slithering!");
    }

    public void jump() {
        System.out.println("Snake is shooting off the ground to bite you with his mouth needles!");
    }

    public void swim() {
        System.out.println("Snake is swimming");
    }

    public void roll() {
        System.out.println("Snake is rolling over!");
    }
    
    public void move() {
    	slither();
    	jump();
    	swim();
    	roll();
    }

}
