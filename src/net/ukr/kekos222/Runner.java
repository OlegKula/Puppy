package net.ukr.kekos222;

/**
 * Created by Олег on 14.03.2017.
 */
public class Runner {
    public static void main(String[] args) {

        Dog puppy = new Puppy("Trina");
        Dog dog = new Dog("Tanker");

        puppy.consoleName();
        puppy.voice();
        puppy.bite();

        dog.consoleName();
        dog.voice();
        dog.bite();
    }
}
