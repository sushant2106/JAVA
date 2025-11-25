package oops.practice;

public class Laptop {

    private static Laptop laptop;

    private  void show(){
        System.out.println("I am Private Method");
    }

    public  void sum(){
        System.out.println("I am sum in public Method");
    }

    public static Laptop getInstance(){
        if(laptop==null){
            laptop=new Laptop();
        }
        return laptop;
    }

//    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        lap.show();
//    }


}


