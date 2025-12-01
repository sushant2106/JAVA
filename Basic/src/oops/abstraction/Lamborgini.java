package oops.abstraction;

import test.abstraction.PrimitiveCar;

public class Lamborgini extends PrimitiveCar {

    public static int count=0;

    @Override
    public void accelerate() {
        count++;
    }

    @Override
    public void deaccelerate() {
        count--;
    }

    void show(){
        System.out.println("I am in Car Class");
    }

    @Override
    protected void ChangeGear() {
        System.out.println("I am inside Car Class with same Package");
    }
}
