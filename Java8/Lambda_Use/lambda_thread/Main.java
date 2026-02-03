package Lambda_Use.lambda_thread;


public class Main {
    public static void main(String[] args){
        // MyClass myclass=new MyClass();
 
        // Thread childThread=new Thread(myclass);
        // childThread.run();
        // for(int i=0;i<10;i++){
        //     System.out.println("Bye "+i);
        // }

        Runnable runnable=()->{
           for(int i=1;i<=10;i++){
             System.out.println("Hello "+i);
           } 
        };

        Thread chilThread=new Thread(runnable);
        chilThread.run();



    }
}
