package Lambda_Use.anonymous_inner_class;



public class Main {
    public static void main(String[] args){
     
       // Employee employee=new SoftwareEngineer();
        // Employee employee=()-> {
        //     return "10";
        // };
        
    

        System.out.println("Same thing can Implement through Anonymus Inner Class");

        Employee employee=new Employee(){
            @Override
            public String getSalary(){
                return "100";
            }

            @Override
            public String getDesignation(){
                return "Software Engineer";
            }


        };


        System.out.println(employee.getSalary());


    }
}
