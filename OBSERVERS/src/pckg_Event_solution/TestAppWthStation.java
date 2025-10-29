package pckg_Event_solution;

public class TestAppWthStation {

    public static void main(String[] args) {
        WSUpdated wsUpdated = new WSUpdated(14,1200,77);
        MobileWthAppNew mobileWthAppNew = new MobileWthAppNew();
        MobileWthAppNew mobileWthAppNew2 = new MobileWthAppNew();
        wsUpdated.registerObserver(mobileWthAppNew);
        wsUpdated.registerObserver(mobileWthAppNew2);
        wsUpdated.notifyRegisteredObservers();

    }

}
