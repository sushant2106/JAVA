package ENUMERATION;

public enum Day {


    SUNDAY("SUNDAY","SOMWAR"),
    MONDAY("MONDAY","SOMWAR"),
    TUESDAY("TUESDAY","SOMWAR"),
    WEDNESDAY("WEDNESDAY","SOMWAR");

    //They are final Instanc e of same Class

    public void display(){
        System.out.println("Today is"+this.name());
    }

    private Day(String lower,String hindi){
        System.out.println("our constructor called");
        this.lower=lower;
        this.hindi=hindi;
    }
    private String lower;
    private String hindi;

    public String getLower(){
        return lower;
    }
    public String getHindi(){
        return this.hindi;
    }


}
