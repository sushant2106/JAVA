package interfaceee.multipleInheritance;

public class SmartPhone implements Camera,MusicPlayer,Phone{

    @Override
    public void takePhoto() {
        System.out.println("Take Photo on SmartPhone");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record The Video on SmartPhone");
    }

    @Override
    public void playMusic() {
        System.out.println("Play Music on SmartPhone");
    }

    @Override
    public void StopMusic() {
        System.out.println("StopMusic  on SmartPhone");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("MakeCall on " + number);
    }

    @Override
    public void endCall() {
        System.out.println("End THE Call on SmartPhone");
    }
}
