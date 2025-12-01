package oops.accessModifier.zoo;
;

public class Dog  extends Animal {

    public  Dog(String name){
        super(name,"Bark");
    }
    public void wagTail(){
        System.out.println(getName() + "is wagging its tails.");
    }
    private String getName(){
        return getClass().getSimpleName();
    }
    public void SetDogSound(String newSound){
        changeSound(newSound);
    }
}
