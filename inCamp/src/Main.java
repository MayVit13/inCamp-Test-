public class Main {
    public static void main(String[] args) {
        Animal dog= new Dog("Bobik",3);
        System.out.println(dog);
        dog.sound();
        System.out.println("\n");

        Animal cat = new Cat("Sirko", 2);
        System.out.println(cat);
        cat.sound();
        System.out.println("\n");

        HuntingDog hd = new HuntingDog("Roll", 4);
        System.out.println(hd);
        hd.hunting();
        hd.sound();
        System.out.println("\n");

        Dog huntingDog = new HuntingDog("Hunter", 5);
        System.out.println(huntingDog);
        huntingDog.sound();
        huntingDog.bite();
        System.out.println("\n");



    }
}
