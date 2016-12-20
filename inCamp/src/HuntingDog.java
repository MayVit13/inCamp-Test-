public class HuntingDog extends Dog{

    public HuntingDog(String name, int age) {
        super(name, age);
    }

    public void hunting(){
        System.out.println("This dogs hunts with or for humans");
    }

    @Override
    public void sound() {
        System.out.println("This is hunting dog 'Woof'");
    }

}
