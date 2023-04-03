import java.util.*;

class Student {
    public String name;
    public int id;
    
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
  
    public String toString(){
        return name+" "+id;
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    Comparator<Student>cmp=new Comparator<Student>(){
	        public int compare(Student i,Student j){
	            if(i.id>j.id)return 1;
	            return -1;
	        }
	    };
	    Scanner sc=new Scanner(System.in);
       List<Student>li=new ArrayList<>();
     
       for(int i=0;i<3;i++){
           String name=sc.next();
           int id=sc.nextInt();
           Student s=new Student(name,id);
           li.add(s);
        
       }
        Collections.sort(li,cmp);
       for(Student x:li){
           System.out.println(x);
       }
	
	
	}
}
