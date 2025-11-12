package pckg_no_fasade;

public class App {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Lights lights = new Lights();
        Player player = new Player();
        HomeTheatre homeTheatre = new HomeTheatre(amplifier, player, lights, screen, projector);
        homeTheatre.projectorOn();
        homeTheatre.turnOnPlayer();
        homeTheatre.turnOnAmplifier();
        homeTheatre.pullUpScreen();
        homeTheatre.turnOffLights();
        // some time has passed

        homeTheatre.turnLights();
        homeTheatre.projectorOff();
        homeTheatre.turnOffPlayer();
        homeTheatre.turnOffAmplifier();
        homeTheatre.pullUpScreen();

    }
}
