package pckg_fst_app;

public class MobileWSApp implements ObserverI{

    private float temp;
    private float press;
    private float humidity;
    private WeatherStation ws;

    public MobileWSApp(){
        System.out.println("MobileWSApp created and initialized");
    }

    @Override
    public void setWS(WeatherStation ws){
        this.ws = ws;
    }


    @Override
    public void update() {
        this.temp = ws.getTemp();
        this.press = ws.getPress();
        this.humidity = ws.getHumidity();
        System.out.println(this + " update data from WS: " + this.ws);
        System.out.println("temp: "+ this.temp);
        System.out.println("press: "+ this.press);
        System.out.println("humidity: "+ this.humidity);
        System.out.println("___________________");
        ws.notifyAllObservers();


    }
}
