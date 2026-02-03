package Lambda_Use.comparator;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    static class Student{
        public Integer id;
        public String name;

        public Student(Integer id,String name){
            this.id=id;
            this.name=name;

        }

        public String toString(){
            return this.id + ":" + this.name;
        }
    }

    public static void main(String[] args){
          List<Integer>list=new ArrayList<>();
     list.add(3);
     list.add(7);

    for(int i=1;i<=5;i++){
        list.add(i*2);
    }
    // Collections.sort(list,new MyClass());

    // Collections.sort(list,(a,b)->{
    //     return b-a;
    // }
    // );  


    //natural order a-b
    Collections.sort(list,(a,b)->b-a);//single line statement 
    System.out.println(list);



    //Example 2

    Set<Integer>s=new TreeSet<>();
    s.add(22);
    s.add(1);
    s.add(13);
    System.out.println("Before manual sortign: " +s);
    Set<Integer>ss=new TreeSet<>((a,b)->b-a);
    ss.add(22);
    ss.add(1);
    ss.add(13);
    System.out.println("After manual sorting desc: "+ ss);

      

    Student s1=new Student(2,"Ram");
    
    Student s2=new Student(3,"Vipul");
    
    Student s3=new Student(33,"Shyam");
    List<Student>li=new ArrayList<Student>();
    li.add(s1);
    li.add(s2);
    li.add(s3);
    Collections.sort(li,(b,a)->(b.id-a.id));
    System.out.println("Student: " + li);


    
    }

}
