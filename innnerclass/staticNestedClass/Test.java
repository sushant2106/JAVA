package innnerclass.staticNestedClass;

public class Test {
    public static void main(String... args) {

        Computer computer=new Computer("HP","pavallion","Windows11");
        computer.getOs().displayInfo();

        Computer.USB usb=new Computer.USB("TYPE-C");


    }
}
