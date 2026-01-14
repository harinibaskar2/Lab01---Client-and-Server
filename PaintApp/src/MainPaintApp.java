package PaintApp.src;

import javax.swing.*;
import java.awt.*;

public class MainPaintApp extends JFrame
{
    public static void main(String[] args)
    {
        MainPaintApp app = new MainPaintApp();
        //sets title of window
        app.setTitle("My Paint App");
        //sets size of window
        app.setSize(800, 600);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setResizable(false);
        app.setVisible(true);
    }
    public MainPaintApp()
    {
        JPanel drawPanel = new DrawPanel();
        JPanel toolPanel = new ToolPanel();
        JPanel statusPanel = new StatusPanel();
        setLayout(new BorderLayout());

        //places panels onto JPanel
        add(toolPanel, BorderLayout.WEST);
        add(statusPanel, BorderLayout.SOUTH);
        add(drawPanel, BorderLayout.CENTER);
    }
}
