package pckg_fst_app;

public class Test {

    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation(23,1024,89);
        MobileWSApp map1 = new MobileWSApp();
        MobileWSApp map2 = new MobileWSApp();

        ws.add(map1);
        ws.add(map2);
        ws.setWSData(30, 1033, 78);
    }
}
