package week1.day2.homework.Puppy;

/**
 * Created by Andriy on 14.10.2016.
 */
    class Puppy extends Dog {

    Puppy(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString(){
        if(age > 1){
            return name + " is a puppy, and it is just " + age + " years old.";
        }
        return name + " is a puppy, and it is just " + age + " year old.";
    }
}
