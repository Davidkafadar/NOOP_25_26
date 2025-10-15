package pckg_intro;

public class SecUser <T extends SimpleUser> {

    private T secUser;

    public SecUser(T secUser) {
        this.secUser = secUser;

    }

    public void someAction() {
        secUser.performSomething();
    }


}
