import java.util.*;

class Student implements Comparable<Student>{
    public String name;
    public int id;
    
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public int compareTo(Student that){
        if(this.id>that.id){
            return 1;
        }
        return -1;
    }
    public String toString(){
        return name+" "+id;
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
       List<Student>li=new ArrayList<>();
     
       for(int i=0;i<3;i++){
           String name=sc.next();
           int id=sc.nextInt();
           Student s=new Student(name,id);
           li.add(s);
        
       }
        Collections.sort(li);
       for(Student x:li){
           System.out.println(x);
       }
	
	
	}
}
