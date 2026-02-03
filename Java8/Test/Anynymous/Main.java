package Test.Anynymous;

public class Main {
    public static void main(String[] args){

        Software obj=new Software();

        System.out.println("Implemtation in sSoftware Class:" + obj.getName());


        Employee employee=()->{
            return "I am Lambda Expression of GetName";
        };

        System.out.println(employee.getName());

        Employee employee2=new Employee(){

            @Override
            public String getName(){
                return "I am AnonyMOUS Inner Class for getName...";
            }
        };

        System.out.println(employee2.getName());
    
    }
}
