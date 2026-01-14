import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PaintMouseListener implements MouseListener
{
    @Override
    public void mousePressed(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();

        System.out.println("Mouse Pressed: " + x + ", " + y);

        // send coordinates
        Sender.send(x, y);
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse Released: " + x + ", " + y);
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}
