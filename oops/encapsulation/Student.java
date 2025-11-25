package oops.encapsulation;

public class Student {
    //properties/field/instance variable and behavior

    private String name;//Instance variable
    private int rollNumber;
    private int age;

    public Student(String name,int rollNumber,int age){
        this.age=age;
        this.rollNumber=rollNumber;
        this.name=name;
    }
    public  Student(String name){
        this.name=name;
    }
    public  Student(int rollNumber){
        this.rollNumber=rollNumber;
    }

    public void setAge(int age){
        if(age<0){
            age=0;
        }
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }


    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    public static  void main(String[] args){
//       String name;//Local Varibale
//
//
//
//    }

}
