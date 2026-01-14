package PaintApp.src;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class ToolPanel extends JPanel
{
    public ToolPanel()
    {
        String[] colors = {"Black", "Red", "Blue", "Green", "Yellow", "Orange", "Pink"};
        //ComboBox is scroll down menu for choosing colors
        JComboBox<String> colorMenu = new JComboBox<>(colors);

        //RadioButton is empty bubble buttons
        JRadioButton rectangleRadio = new JRadioButton("Rectangle");
        JRadioButton circleRadio = new JRadioButton("Circle");
        JRadioButton arcRadio = new JRadioButton("Arc");

        //button group only makes one button available at a time
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rectangleRadio);
        buttonGroup.add(circleRadio);
        buttonGroup.add(arcRadio);

        //set layout position
        setLayout(new GridLayout(7, 1));
        add(colorMenu);
        add(rectangleRadio);
        add(circleRadio);
        add(arcRadio);

        //add actionNanny
        ActionNanny actionNanny = new ActionNanny();

        //add actionlistener for buttons
        rectangleRadio.addActionListener(actionNanny);
        circleRadio.addActionListener(actionNanny);
        arcRadio.addActionListener(actionNanny);

        colorMenu.addActionListener(actionNanny);






    }
}
