import java.util.Random;

public class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+":"+name+"-"+age+"years old";
    }

    protected int moodGenerator(){
        Random random = new Random();
        int mood = random.nextInt(100);
        return mood;
    }

}
