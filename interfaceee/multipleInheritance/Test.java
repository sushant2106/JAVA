package interfaceee.multipleInheritance;

public class Test {

    public static void main(String[] args) {
        SmartPhone smartphone=new SmartPhone();
        smartphone.makeCall("10213334");
        smartphone.endCall();
        smartphone.playMusic();
        smartphone.StopMusic();
        smartphone.takePhoto();
        smartphone.recordVideo();

    }
}
