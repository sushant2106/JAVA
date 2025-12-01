package oops.abstraction;

public abstract class Animal {

    private int age;
    private String name;
    public  abstract  void sayHello();
    private  boolean hasSuperPowers;

    public  Animal(){
        this.hasSuperPowers=true;
    }


    public void sleep(){
        System.out.println("zzz...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
