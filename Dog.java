package week1.day2.homework.Puppy;

/**
 * Created by Andriy on 14.10.2016.
 */
    class Dog extends Animal {

    String name;

    Dog(int age, String name) {
        super(age);
        this.name = name;
    }

    void bark(){
        System.out.println("Woof!");
    }

    void jump(){
        System.out.println("jump...");
    }

    void run(){
        System.out.println("run...");
    }

    void bite(){
        System.out.println("bite...");
    }

    @Override
    public String toString(){
        return name + " is a dog, and it is " + age + " years old.";
    }

}
