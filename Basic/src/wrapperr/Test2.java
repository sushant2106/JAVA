package wrapperr;

class Student{
    public int id;
}
public class Test2 {

    public static  void fun1(Integer a){
        a=2;
    }
    public static  void fun(Student a){
        System.out.println("A before:"+a.id);
        Student x=new Student();
        x.id=2;
        a=x;
        System.out.println(a.id);

        //a.id=2

    }

    public static  void main(String[] args){

        Student student=new Student();
        student.id=1;
        fun(student);//we are passing the reference/address
        System.out.println(student.id);

        System.out.println("Integer fun1 is calling ");
        Integer b=1;
        fun1(b);
        System.out.println(b);


    }

}
