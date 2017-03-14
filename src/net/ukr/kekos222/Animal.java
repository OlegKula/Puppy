package net.ukr.kekos222;

/**
 * Created by Олег on 14.03.2017.
 */
public abstract class Animal {
    protected String name;

    public void run(){
        System.out.println("Running...");
    }

    public void jump(){
        System.out.println("Jumping...");
    }

    public void voice(){
        System.out.println("Giving voice...");
    }

    public void bite(){
        System.out.println("Biting...");
    }

    public void consoleName(){
        System.out.println("Name : " + name);
    }


}
