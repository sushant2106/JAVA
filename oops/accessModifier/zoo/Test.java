package oops.accessModifier.zoo;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("Duke");
        dog.makeSound();
        dog.changeSound("Woff");
        dog.makeSound();
    }
}
