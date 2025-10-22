package pckg_VJ_1_Z1_b;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputPanel extends JPanel {

    private JTextField num1 ;
    private JTextField num2 ;
    private JComboBox<ALG_OPERATION> algOperationjCombo;
    private JButton calculateBtn ;
    private InputPanelListener inputPanelListener;


    public InputPanel() {

        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("Input Calculator");
        Border border = BorderFactory.createCompoundBorder(outer,inner);
        setBorder(border);

        Dimension dims = getPreferredSize();
        dims.width = 220;
        setPreferredSize(dims);

        initComps();
        layoutComps();
        activateComps();


    }

    public void setInputPanelListener(InputPanelListener inputPanelListener) {
        this.inputPanelListener = inputPanelListener;
    }

    private void initComps() {
        this.num1 = new JTextField(10);
        this.num2 = new JTextField(10);
        this.algOperationjCombo = new JComboBox<>();
        DefaultComboBoxModel<ALG_OPERATION> comboBoxModel = new DefaultComboBoxModel<>();
        for(ALG_OPERATION ao: ALG_OPERATION.values()) {
            comboBoxModel.addElement(ao);
        }

        algOperationjCombo.setModel(comboBoxModel);
        algOperationjCombo.setSelectedIndex(-1);
        calculateBtn = new JButton("Calculate");

    }


    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("First num: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(num1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Second num: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(num2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Operation : "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(algOperationjCombo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(calculateBtn, gbc);



    }


    private void activateComps() {

        calculateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                try{
                    Double fstNum = Double.parseDouble(num1.getText());
                    Double sndNum = Double.parseDouble(num2.getText());
                    ALG_OPERATION alg_operation = (ALG_OPERATION) algOperationjCombo.getSelectedItem();
                    InputPanelData inputPanelData = new InputPanelData(fstNum, sndNum, alg_operation);
                    if(inputPanelListener != null) {
                        inputPanelListener.inputPanelEventOccurred(inputPanelData);
                    }

                }catch(NumberFormatException nfe){

                    JOptionPane.showMessageDialog(InputPanel.this, nfe.getMessage(), "Exception input",JOptionPane.ERROR_MESSAGE );

                }

            }
        });


    }


}
