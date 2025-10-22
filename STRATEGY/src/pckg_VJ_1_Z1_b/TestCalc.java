package pckg_VJ_1_Z1_b;
import javax.swing.*;

public class TestCalc {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
