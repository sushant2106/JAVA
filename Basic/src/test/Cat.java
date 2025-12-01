package test;

import test.abstraction.PrimitiveCar;

public class Cat   extends  PrimitiveCar{

    public  static  int count=0;
        String speek="Meow";
        @Override
        public void accelerate() {
            count++;
            System.out.println("Cat accelerating...");
        }

        @Override
        public void deaccelerate() {
            count--;
            System.out.println("Cat slowing down...");
        }
        @Override
        public void ChangeGear(){
            System.out.println("yES");
        }





}
