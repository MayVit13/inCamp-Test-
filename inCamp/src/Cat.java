public class Cat extends Pet implements Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        int mood = moodGenerator();

        if (mood<30){
            System.out.println("Meoow");}
        if (mood > 30 && mood < 70){
            System.out.println("Meow meow meow");
        }
        if (mood > 70 && mood <= 100){
            System.out.println("Meow!");
        }
    }

}
