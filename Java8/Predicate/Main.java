package Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Main{

    private static class Student{
        String name;
        int id;

        public Student(String name,int id){
            this.name=name;
            this.id=id;
        }

        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }

        public void setId(int id){
            this.id=id;
        }

        public int getId(){
            return id;
        }
    }
    public static void main(String[] args){

        Predicate<Integer>salaryGreaterThanOnelac=x->x>1000;
       
        
        System.out.println(salaryGreaterThanOnelac.test(1));

        List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum=numbers.stream().filter(n->n%2 == 0).mapToInt(n->n).sum();
        System.out.println(sum);

        Predicate<Integer>isEven= x -> x%2 ==0;
        List<Integer>numbers2=Arrays.asList(1,2,3,4,5);
        for(Integer i: numbers2){
            if(isEven.test(i)){
                System.out.println(i);
            }
        }

        Predicate<String>startsWithLetterV=x -> x.toLowerCase().charAt(0)=='v';

        System.out.println(startsWithLetterV.test("Hello"));

        Predicate<String>endsWithLetterL=x->x.toLowerCase().charAt(x.length()-1)=='l';
        Predicate<String>and=startsWithLetterV.and(endsWithLetterL);
        System.out.println(and.test("Vipul"));

        System.out.println(startsWithLetterV.negate().test("Vipul"));

       

        Student s1=new Student("Vipul", 1);
        Student s2=new Student("Ram",2);

        Predicate<Student>studenPredicate1=x -> x.getId() >1;

        System.out.println(studenPredicate1.test(s2));

        Predicate<Object>predicate=Predicate.isEqual("Vipul");
       
        System.out.println(predicate.test("guju"));

        





        
        
    }
}