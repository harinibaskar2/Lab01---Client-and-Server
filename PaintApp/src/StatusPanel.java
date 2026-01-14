

import javax.swing.*;
//creates a panel with two buttons: Undo and Erase
public class StatusPanel extends JPanel
{
    public StatusPanel()
    {
        JButton undoButton = new JButton("Undo");
        JButton eraseButton = new JButton("Erase");
        add(undoButton);
        add(eraseButton);

        ActionNanny actionNanny = new ActionNanny();

        undoButton.addActionListener(actionNanny);
        eraseButton.addActionListener(actionNanny);
    }
}
