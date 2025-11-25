package staticpack;

public class Student {

    public static int count=0;
    private int id;
    private String name;
    public int age;

    static {
        count=22;
        System.out.println("Static Block help to initialize static variable");


    }

    public  Student(){
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  static  void getCount(){
        System.out.println("Total Student Count:"+count);
    }
}
