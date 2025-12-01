package print_type;

import com.sun.security.jgss.GSSUtil;

public class string {
    public static  void main(String[] args){
        int a=1;
        char c='a';
        boolean isPassed=true;
        String name="Ram Kumar";
        String name2="Ram KumaR";

        System.out.println(name);

        System.out.println(name.charAt(0));
        System.out.println(name.length());
//        for(int i=0;i<name.length();i++){
//            System.out.println(name.charAt(i));
//        }
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        int [] arr={4,3,1};

        String str1="remote";
        String str2="car";
        int i =str1.compareTo(str2);
        System.out.println("CompareTo:"+ i);
        System.out.println('r' + 0);

        // str1-str2 ascii value of str1[0]-str2[0] like this it work

        int j=str1.compareToIgnoreCase(str2);
        System.out.println(j);

        String name3="Amar Panchal";
        String substring=name.substring(0,3);
        System.out.println(substring);
        System.out.println(name3.toLowerCase());
        System.out.println(name3.toUpperCase());

        String name5="Amar Panchal";
       //Strings are immutable
        System.out.println("name5:"+name5);
        System.out.println(name.trim());
        System.out.println(name.stripLeading());
        String newName=name5.replace("Panchal","Gupta");
        System.out.println("name5:"+name5);
        System.out.println(newName);
        System.out.println(name5.contains("a"));
        System.out.println(name5.startsWith("Am"));
        System.out.println(name5.endsWith("al"));
        String str="";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        System.out.println(str.length());

        int [] arr4={1,2,3};
        int [] arr2=new int[5];
        System.out.println(name5.indexOf('a'));
        System.out.println(name5.lastIndexOf('b'));
        //String anotherName=name.indexOf("a",5,8);
        int a1=10;
        String s=String.valueOf(a);
        System.out.println(s);
        String formatted=String.format("My name is %s and I am %d","Jhon",25);
        System.out.println(formatted);
        System.out.println(name.substring(2,8));
        System.out.println(name.subSequence(2,8));
        //subtring part of string in continous
        //sunsequnce is part of string but not continous
       //APal
     // but in java both return the same subsequence and substring


    }
}
