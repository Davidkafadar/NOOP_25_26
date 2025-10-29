package pckg_Event_solution;

import java.time.Instant;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WSUpdated implements ObservableWS<WeatherSensorReadings>{

    private final List<GenObserver<WeatherSensorReadings>> observers;
    private WeatherSensorReadings wsr;

    public WSUpdated(float temp, float press, float humidity){
        this.observers = new CopyOnWriteArrayList<>();
        this.wsr = new WeatherSensorReadings(temp, press, humidity, Instant.now());
    }

    public void setDataFromSensors(float t, float p, float h){
        this.wsr = new WeatherSensorReadings(t, p, h, Instant.now());
    }


    @Override
    public void registerObserver(GenObserver<WeatherSensorReadings> genObs) {
        if(this.observers.contains(genObs)){
            System.out.println("Already registered in the list");
        }else{
            this.observers.add(genObs);
            System.out.println("New observer registered to list");
        }

    }

    @Override
    public void removeObserverFromList(GenObserver<WeatherSensorReadings> genObs) {

    }

    @Override
    public void notifyRegisteredObservers() {
        for(GenObserver<WeatherSensorReadings> genObserver : observers){
            genObserver.update(this.wsr);
        }

    }
}
