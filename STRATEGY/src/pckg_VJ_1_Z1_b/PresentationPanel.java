package pckg_VJ_1_Z1_b;
import javax.swing.*;
import java.awt.*;

public class PresentationPanel extends JPanel {

    private JTextField resultField;
    private  JTextArea allResults;
    private JScrollPane resultsScrollPane;

    public PresentationPanel() {

        initComps();
        layoutComps();



    }

    private void initComps() {

        this.resultField = new JTextField(15);
        resultField.setEditable(false);
        this.allResults = new JTextArea(10,15);
        this.resultsScrollPane = new JScrollPane(allResults, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Result: "), gbc);


        gbc.gridx = 0;
        gbc.gridy = 1;
        add(resultField, gbc);

        gbc.gridx=0;
        gbc.gridy = 2;
        add(new JLabel("All Results: "), gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(resultsScrollPane, gbc);

    }

    public void setResult(String results){
        resultField.setText(results);
    }

    public void addResultToAll(String res){
        allResults.append(res+"\n");
    }



}
