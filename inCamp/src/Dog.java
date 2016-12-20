public class Dog extends Pet implements Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        int mood = moodGenerator();

        if (mood<30){
            System.out.println("Woooooof");}
        if (mood > 30 && mood < 70){
            System.out.println("Woof woof woof");
        }
        if (mood > 70 && mood <= 100){
            System.out.println("Woof!");
        }
    }

    public void bite(){
        System.out.println("I can bite");
    }

}
