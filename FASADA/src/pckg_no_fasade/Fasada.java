package pckg_no_fasade;

public class Fasada {

    private Amplifier amplifier;
    private Player player;
    private Lights lights;
    private Screen screen;
    private Projector projector;

    public Fasada(Amplifier amp,  Player player, Lights lights, Screen screen, Projector projector){
        this.amplifier = amp;
        this.player = player;
        this.lights = lights;
        this.screen = screen;
        this.projector = projector;
    }

    public void watchMovie(){
        amplifier.turnOnAmp();
        player.turnOnPlayer();
        screen.pullDownScreen();
        projector.turnOnProjector();
        lights.turnOffLights();
    }

    public void stopMovie(){
        player.turnOffPlayer();
        lights.turnOnLight();
        screen.pullUpScreen();
        projector.turnOffProjector();
        amplifier.turnOffAmp();
    }


}
