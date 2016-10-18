package week1.day2.homework.puppy;

/**
 * Created by Andriy on 14.10.2016.
 */
    class Puppy extends Dog {

    Puppy(int age, String name) {
        super(age, name);
    }


    @Override
    public String toString(){
        String yearWord;
        if (age > 1){
            yearWord = " years ";
        } else {
            yearWord = " year ";
        }
        return name + " is a puppy, and it is just " + age + yearWord + "old.";
    }

    @Override
    public void jump(){
        System.out.println("little jump...");
    }

    @Override
    void bite(){
        System.out.println("puppy bite...");
    }
}
