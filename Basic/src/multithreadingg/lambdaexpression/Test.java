package multithreadingg.lambdaexpression;

public class Test {

    public static void main(String[] args) {
        EngineeringStudent engineeringStudent=new EngineeringStudent();
        String name=engineeringStudent.getBio("Ram");

        System.out.println(name);
    }
}
