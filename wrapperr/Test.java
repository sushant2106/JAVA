package wrapperr;

public class Test {
    public static void main(String[] args) {
        //Primitive DataType ko Wrap kar degi

        int a=1;

//        Integer k=Integer.valueOf(10);
        //Behind the Scene How Wrapper Class is Working
        //ek primitive Integer uthaya aur usko box mai daal diya

        //Integer m=Integer.valueOf(8);
        //Below Integer b=1 is called AutoBoxing
        System.out.println("This is Called AutoBoxing: Integer b=1");
        Integer b=1; //Integer type wrap the int value
        //value of Primitive type into an Object
        //Object ban jaye hum uske upar method laga sake
        boolean hasGraphicadrd=true;
        Boolean isAdult=true;

        //b is reference variable

        Float f=1.2f;
        Double d=1.2;
        Character c='c';
        Byte bb=1;
        Short s=2;
        Long l=123L;

        //UnBoxing
        //int i=b.intValue()
        System.out.println("Behind the Scene b.intValue()  called as Unboxing");
        int i=b;

        Integer num=null;
       // int sum=null; primitive can't hold Null


        System.out.println(Integer.max(1,2));
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.min('a','k'));

        String str="123";
        System.out.println(Integer.valueOf(str));













    }
}
