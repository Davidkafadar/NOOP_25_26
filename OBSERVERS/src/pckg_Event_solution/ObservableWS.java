package pckg_Event_solution;

import java.util.Observer;

public interface ObservableWS<T> {

    void registerObserver(GenObserver<T> genObs);
    void removeObserverFromList(GenObserver<T> genObs);
    void notifyRegisteredObservers();
}
