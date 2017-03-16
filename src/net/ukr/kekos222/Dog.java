package net.ukr.kekos222;

/**
 * Created by Олег on 14.03.2017.
 */
public class Dog extends Animal {

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println("Running...");
    }

    @Override
    public void jump(){
        System.out.println("Jumping...");
    }

    @Override
    public void voice(){
        System.out.println("Bark!");
    }

    @Override
    public void bite(){
        System.out.println("Biting...");
    }

    @Override
    public void consoleName(){
        System.out.println("Name : " + name);
    }

}
