import java.util.*;
class Base{
    int x;
   public int getx()
    {
        return x;
    }
   public void setx(int x)
   {
       this.x=x;
       System.out.println("I am in x");
   }
}
class Derived extends Base{
    int y;
    public int gety()
    {
        return y;
    }
    public void sety(int y){
        this.y=y;
        System.out.println("I am in y");
    }
}
public class Hello{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        // Base v=new Base();
        // v.setx(x);
         int x=sc.nextInt();
         int y=sc.nextInt();
        Derived v=new Derived();
        v.setx(x);
        v.sety(y);
        
        
        
    }
}
