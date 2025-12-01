package test.interfacee;

public interface Animal{
    public abstract  void add();

    public static  void getString(){
        System.out.println("This is Static Class in interface");
    }

    public  static final int max_animal=100;


    default void get_pos(){
        System.out.println("Default Method is running");
    }


}