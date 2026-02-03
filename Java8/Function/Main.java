package Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
   
    private static class Student{
        private int id;
        private String name;

        public  Student(int id,String name){
            this.id=id;
            this.name=name;
        }

        public void setId(int id){
            this.id=id;
        }
        public int getId(){
            return id;
        }

        public void setName(String name){
            this.name=name;
        }

        public String getName(){
           return name;
        }

        @Override
        public String toString(){
            return "Student:" + id + name ;

        }



    }

    public static void main(String[] args){

       Function<String,Integer>function=x -> x.length();
        
       System.out.println(function.apply("Vipul"));

       Function<String,String>function2=s->s.substring(0,3);

       System.out.println(function2.apply("RamKumar"));


       Function<List<Student>,List<Student>>studnetsWithPrefix=li -> {
        List<Student>result=new ArrayList<>();
        for(Student s:li){
           if(function2.apply(s.getName()).equalsIgnoreCase("vip")){
            result.add(s);
           }
        }
        return result;
        
       };

       Student s1=new Student(1, "Vipul");
       Student s2=new Student(2, "Vipulav");
       Student s3=new Student(3,"Arnav");
        
       List<Student>students=Arrays.asList(s1,s2,s3);

       List<Student>filteredStudent=studnetsWithPrefix.apply(students);
       System.out.println(filteredStudent);


    }
}
