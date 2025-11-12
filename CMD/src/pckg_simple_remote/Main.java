package pckg_simple_remote;

public class Main {

    public static void main(String[] args) {

        RemoteController simpleRC = new RemoteController();
        GarageDoor garageDoor = new GarageDoor();
        Light light = new Light();
        simpleRC.setCommand(new GarageDoorCmd(garageDoor));
        simpleRC.remoteButtonPressed();
        simpleRC.remoteButtonPressed();
        simpleRC.setCommand(new LightCommand(light));
        simpleRC.remoteButtonPressed();
        simpleRC.remoteButtonPressed();
    }
}
