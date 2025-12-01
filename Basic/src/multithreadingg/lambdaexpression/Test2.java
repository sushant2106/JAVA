package multithreadingg.lambdaexpression;

public class Test2 {
    public static void main(String[] args) {
        Student engineeringStudent=new Student() {
            @Override
            public String getBio(String name) {
                return name + " is Engineering Student";
            }
        };
        Student lawStudent=(name)
                ->{return name +" is law student";};



       String bio= engineeringStudent.getBio("Ram");
       System.out.println(bio);


    }
}
