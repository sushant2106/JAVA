package oops.accessModifier.test;

import oops.accessModifier.School.Student;
import oops.accessModifier.School.Utils;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        student.age=12;
        student.name="Ram";
        student.sayHello();

        System.out.println(Student.sayBye());

        Utils.sum();



    }
}
