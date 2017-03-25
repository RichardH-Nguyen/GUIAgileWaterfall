package com.Richard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by su7163if on 3/22/2017.
 */
public class AgileWaterfall extends JFrame{
    private JPanel rootPanel;
    private JTextField txtProjectName;
    private JCheckBox cbxQ1Yes;
    private JCheckBox cbxQ1No;
    private JCheckBox cbxQ2Yes;
    private JCheckBox cbxQ2No;
    private JCheckBox cbxQ3Yes;
    private JCheckBox cbxQ3No;
    private JCheckBox cbxQ4Yes;
    private JCheckBox cbxQ4No;
    private JCheckBox cbxQ5Yes;
    private JCheckBox cbxQ5No;
    private JCheckBox cbxQ6Yes;
    private JCheckBox cbxQ6No;
    private JButton btnCalculate;
    private JLabel lblResult;
    private JButton quitButton;
    private int agile = 0;
    private int Waterfall = 0;


    protected AgileWaterfall(){
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        ItemListener listenerYes = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBox a = (JCheckBox)e.getSource();
                if(a.isSelected()){
                    Waterfall++;
                }

            }
        };

        ItemListener listenerNo = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBox a = (JCheckBox)e.getSource();
                if(a.isSelected()){
                    agile++;
                }

            }
        };
        cbxQ1Yes.addItemListener(listenerYes);
        cbxQ2Yes.addItemListener(listenerYes);
        cbxQ3Yes.addItemListener(listenerYes);
        cbxQ4Yes.addItemListener(listenerYes);
        cbxQ5Yes.addItemListener(listenerYes);
        cbxQ6Yes.addItemListener(listenerYes);
        cbxQ1No.addItemListener(listenerNo);
        cbxQ2No.addItemListener(listenerNo);
        cbxQ3No.addItemListener(listenerNo);
        cbxQ4No.addItemListener(listenerNo);
        cbxQ5No.addItemListener(listenerNo);
        cbxQ6No.addItemListener(listenerNo);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Waterfall > agile){
                    lblResult.setText(txtProjectName.getText() + " should use waterfall.");
                }else if (agile > Waterfall){
                    lblResult.setText(txtProjectName.getText() + " should use agile.");
                }else{
                    lblResult.setText("Either can be used.");
                }
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
