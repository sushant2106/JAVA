package ENUMERATION;

public class Test {
    public static void main(String[] args) {

        Day day=Day.MONDAY;

        switch(day){
            case MONDAY :{
                System.out.println("Today is Monday");
                break;
            }
//            case TUESDAY -> {
//                System.out.println("This is TUesday");
//                break;
//            }
            default:{
                System.out.println("Weekend");
                break;
            }
        }

//        String res=switch(day){
//            case MONDAY -> "M";
//            case  TUESDAY -> "T";
//
//        };

    }
}
