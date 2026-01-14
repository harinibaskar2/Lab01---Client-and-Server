
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class DrawPanel extends JPanel implements MouseListener
{
    public DrawPanel()
    {
        setBackground(new Color(176, 250, 192));
    }

    public void mousePressed(MouseEvent e)
    {

   		int x = e.getX();
		int y = e.getY();
        System.out.println("Mouse pressed at: " + x + ", " + y);


    }

    public void mouseReleased(MouseEvent e)
    {
        
        int x = e.getX();
		int y = e.getY();
        System.out.println("Mouse released at: " + x + ", " + y);

    }

    public void mouseClicked(MouseEvent e) 
    {

    }


    public void mouseEntered(MouseEvent e)
    {

    }

    public void mouseExited(MouseEvent e)
    {

    }

    public void mouseDragged(MouseEvent e)
    {

    }
    
    public void mouseMoved(MouseEvent e){ 

    }

} 
