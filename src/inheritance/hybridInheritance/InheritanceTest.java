package inheritance.hybridInheritance;

public class InheritanceTest {

    public static void main(String[] args){

        Dog dog = new Dog();
        dog.setName("Piku");
        dog.displayName();
        dog.eat();
        dog.setNoOfHeart(1);
        dog.displayNoHeart();

        System.out.println("*********************************");

        Cat cat = new Cat();
        cat.setName("Kiku");
        cat.displayName();
        cat.eat();
        cat.setNoOfHeart(1);
        cat.displayNoHeart();

        System.out.println("*********************************");

        Octopus octopus = new Octopus();
        octopus.setName("ocotpus");
        dog.displayName();
        dog.eat();
        dog.setNoOfHeart(1);
        dog.displayNoHeart();

        System.out.println("*********************************");
    }
}


