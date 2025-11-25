package multithreadingg.lambdaexpression;

public class LambdaExpression {
    public static void main(String[] args) {
//        Runnable runnable=() -> {
//            System.out.println("Hello");
//        };
//        Runnable task1=() -> {
//            System.out.println("Hello");
//        };
//        Thread t1=new Thread(task1);
//        t1.start();


        //Another WAY

//        Thread t1=new Thread(()-> System.out.println("Hello Its Single Line"));
//        t1.start();

        Thread t1=new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("Hello World");
            }
        });

        t1.start();



    }
}
