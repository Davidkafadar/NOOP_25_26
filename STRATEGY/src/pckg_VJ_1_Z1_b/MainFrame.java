package pckg_VJ_1_Z1_b;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

    private InputPanel inputPanel;
    private PresentationPanel presentationPanel;
    private CalculationStrategy calculationStrategy;


    public MainFrame(){

        super("Simple Calculator");
        setSize(640, 350);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        initComps();
        layoutComps();
        activateMainFrame();


    }

    private void initComps() {
        this.inputPanel = new InputPanel();
        this.presentationPanel = new PresentationPanel();
    }


    private void layoutComps() {

        setLayout(new BorderLayout());
        add(presentationPanel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.WEST);

    }


    private void activateMainFrame() {

        inputPanel.setInputPanelListener(new InputPanelListener() {
            @Override
            public void inputPanelEventOccurred(InputPanelData ipd) {
                CalculationStrategy calculationStrategy = resolveAlgOperation(ipd.getAlgoperation());
                Double result =  calculationStrategy.performCalculation(ipd.getfstNum(), ipd.getsndNum());
                presentationPanel.setResult(result.toString());

            }
        });

    }

    private CalculationStrategy resolveAlgOperation(ALG_OPERATION alg_operation){
        switch(alg_operation.toString()){
            case "ADDITION": return new AdditionStrategy();
            case "MULTIPLICATION": return new MultiplicationStrategy() ;
            case "SUBTRACTION": return new SubtractionStrategy ();
            case "DIVISION": return new DivisionStrategy ();
            default: return null;
        }
    }

}
