package pckg_Feed_solution;

public class TestApp {

    public static void main(String[] args) {
        WSWithFeed wsWithFeed = new WSWithFeed(15, 1223, 56);
        MobileWSAppFeed mobileWSAppFeed1 = new MobileWSAppFeed();
        MobileWSAppFeed mobileWSAppFeed2 = new MobileWSAppFeed();

        wsWithFeed.registerObserver(mobileWSAppFeed1);
        wsWithFeed.registerObserver(mobileWSAppFeed2);
        wsWithFeed.notifyAllRegObservers();

        wsWithFeed.sensorDataChange(9,1200,89);
    }
}
