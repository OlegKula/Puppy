package net.ukr.kekos222;

/**
 * Created by Олег on 14.03.2017.
 */
public class Dog extends Animal {

    public Dog(String name){
        this.name = name;
    }
    @Override
    public void voice(){
        System.out.println("Bark!");
    }

}
