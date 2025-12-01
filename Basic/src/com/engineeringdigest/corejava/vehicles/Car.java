package com.engineeringdigest.corejava.vehicles;

public class Car {
    MiniCycle min=new MiniCycle();

    Cycle cycle=new Cycle();
    Cycle.BigCycle bigCycle=cycle.new BigCycle();

}
