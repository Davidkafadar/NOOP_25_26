package pckg_intro;

public class SimpleUser {

    private int id;
    private static int cntId = 100;
    private String name;


    public SimpleUser(String name) {
        this.name = name;
        this.id = cntId++;
    }

    public void performSomething(){
        System.out.println(Integer.toHexString(this.hashCode()) + " Performing something!!!");
    }
}
