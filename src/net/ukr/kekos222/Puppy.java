package net.ukr.kekos222;

/**
 * Created by Олег on 14.03.2017.
 */
public class Puppy extends Dog {

    public Puppy(String name){
        super(name);
    }

    @Override
    public void voice(){
        System.out.println("Can't bark yet");
    }

    @Override
    public void bite(){
        System.out.println("Can't bite yet");
    }
}

