package oops.inheritance.humans;

public class Grandparent{
    private String name;
    private  int age;

    public boolean hasSuperPowers() {
        return hasSuperPowers;
    }

    private boolean hasSuperPowers;

    public Grandparent(int age,String name){
        this.age=age;
        this.name=name;

        hasSuperPowers=false;
        System.out.println("GrandParent Constructor Called");
    }

    public void setName(String name){
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


}
