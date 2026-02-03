package Lambda_Use;

public class Main {
    public static void main(String[] args){
         
    // SoftwareEngineer employee=new SoftwareEngineer();
    // System.out.println(employee.getName());
    
    Employee employee=() -> "Software Engineer..";

    System.out.println(employee.getName());

    Employee editor=()-> "I am editor of Indian Express";
    System.out.println(editor.getName());

    


    }
}
