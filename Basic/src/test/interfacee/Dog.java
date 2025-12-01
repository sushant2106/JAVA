package test.interfacee;



public class Dog  implements Animal ,HybridDog{

    @Override
    public void add() {
        System.out.println("Lets add in Implements..");
    }


    @Override
    public  void newdog(){
        System.out.println("New DOG IS excellent");
    }


}
