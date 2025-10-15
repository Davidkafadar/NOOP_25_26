package pckg_intro;

public class AdvanceUser extends SimpleUser {

    public AdvanceUser(String name) {
        super(name);
    }

    @Override
    public void performSomething() {
        super.performSomething();
        System.out.println("This one can do something special!");
    }
}
