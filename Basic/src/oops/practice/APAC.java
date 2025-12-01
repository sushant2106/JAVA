package oops.practice;

public class APAC {

    public String name;

    public void setName(String name){
        this.name=name;
    }

    public void getName(){
        System.out.println("My name is" + name);
    }
    public void sum(int a, int b) {
        int result = add(a, b);
        System.out.println(result);
    }

    private int add(int x, int y) {   // helper method
        return x + y;
    }

}
