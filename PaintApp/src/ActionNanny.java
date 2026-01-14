package PaintApp.src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionNanny implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("ActionNanny: " + e.getActionCommand());
        //cast the action command into string
        String msgAction = (String) e.getActionCommand();
        System.out.println("Sending " + msgAction + " to server");

        if (e.getSource() instanceof JComboBox) {
            JComboBox<?> comboBox = (JComboBox<?>) e.getSource();
            System.out.println("Selected: " + comboBox.getSelectedItem());
           //cast the selected item into a string
            String msgComboBox = (String) comboBox.getSelectedItem();
            System.out.println("Sending " + msgComboBox + " to client");
        }
    }
}
