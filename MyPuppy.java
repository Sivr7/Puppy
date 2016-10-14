package week1.day2.homework.Puppy;

/**
 * Created by Andriy on 14.10.2016.
 */
public class MyPuppy {
    public static void main(String[] args){


        Puppy fluffy = new Puppy(2, "Fluffy");

        System.out.println(fluffy.toString());

        fluffy.bark();
        fluffy.jump();
        fluffy.run();
        fluffy.bite();

    }
}
