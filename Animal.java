package week1.day2.homework.Puppy;

/**
 * Created by Andriy on 14.10.2016.
 */
    class Animal {

    int age;

    Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "This animal is " + age + " years old.";
    }
}
