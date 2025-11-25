package exception;

public class Test {

    public static  int divide(int a,int b){
        try{
            return a/b;
        }
        catch(ArithmeticException | NullPointerException  e){
            System.out.println(e);
            return  -1;
        }
        catch (RuntimeException e){
            System.out.println("I am runtime");
            return -1;
        }
        catch (Exception e){
            System.out.println(e);
            return  -1;
        }
    }

    public static void main(String[] args) {

        int[] numerator={10,20,30,40};
        int[] denomen={1,2,0,4};

        for(int i=0;i<numerator.length+1;i++){
           try{
               System.out.println(divide(numerator[i],denomen[i]));
           }
           catch (Exception e){
               System.out.println(e);
           }
        }

        System.out.println("Good Job:");
       // System.out.println(getClass().getName());
    }
}
