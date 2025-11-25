package staticpack;

//import oops.accessModifier.School.Utils;

public class Test {

//    public  int sum(int a,int b){
//        return a+b;
//    }

    // for direct  Call We need to declare as static

    public  static  int sum(int a,int b){
        return  a+b;
    }


    public static void main(String[] args) {

        Student.getCount();
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();
        Student student4=new Student();

        System.out.println(Student.count);
        System.out.println(Utils.trimAndUpperCase(" sjaib "));



//        Test obj=new Test();
//        System.out.println(obj.sum(1,2));

        System.out.println(sum(2,3));





    }
}
