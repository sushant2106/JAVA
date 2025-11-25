package oops.inheritance.humans;

public class Test {
    public  static void main(String[] args){
        Child child=new Child(17,"Ram");
//        child.setName("Ram");
//        child.setAge(8);
//        System.out.println(child.hasSuperPowers());
        child.childMethod();
        System.out.println(child.getAge());



//        Parent parent=new Parent();
//        parent.setAge(30);
//        parent.setName("Mukesh");
    }
}
