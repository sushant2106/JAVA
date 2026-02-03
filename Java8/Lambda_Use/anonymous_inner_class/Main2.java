package Lambda_Use.anonymous_inner_class;

public class Main2 {
    
     public static void main(String[] args){
        int a=333;//Instance variable for Class 
        doSomething();
     }

     private static void doSomething(){
        //int a=2;//local variable can't be re assign in lambda expression
        Employee2 employee2=()-> {
        int x=10;
        System.out.println(x);//local varibale
        return "100";
       };
       
       Employee2 emppEmployee2=new Employee2(){
        int x=1000000;
        @Override
        public String getSalary(){
            System.out.println(this.x);
            return "1000";
        }
       };

       System.out.println( emppEmployee2.getSalary());




       //System.out.println(employee2.getSalary());

    }
}
