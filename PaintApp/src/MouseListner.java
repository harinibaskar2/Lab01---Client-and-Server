import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListner implements MouseListener
{
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse Pressed: " + x + ", " + y);

      
        Sender.send(null);
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse Released:" + x + ", " + y);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
