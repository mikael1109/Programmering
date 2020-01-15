package sample;


import animals.*;

public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black", "Its a dog!"),
                            new Hedgehog("Blue", "Sonic!!"),
                            new Duck("Yellow", "Its a Duck!"),
                            new Owl("Brown", "Papa near!!"),
                            new Snake("Black and Yellow", "Holy heck its Snek!")};

        System.out.println("###############");
        System.out.println();

        activateAnimal(animals);
    }

    private static void activateAnimal(Animal[] animals) {
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.speak();
            animal.setColor("Grey");
            animal.move();
            animal.printDescritption();
            System.out.println();
            

            System.out.println("###############");
            System.out.println();
        }
    }
}
