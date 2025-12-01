package oops.inheritance;

public class Animal {
    private String name;
    private int age;

    public  void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void eat(){
        System.out.println("This Animals Eats Food");

    }
    public void  sayHello(){
        System.out.println("...");
    }


}
