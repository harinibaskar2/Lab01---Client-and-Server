import java.awt.*;
import javax.swing.*;

public class MainPaintApp extends JFrame
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            MainPaintApp app = new MainPaintApp();
            app.setTitle("My Paint App");
            app.setSize(800, 600);
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            app.setResizable(false);
            app.setVisible(true);
        });
    }

    public MainPaintApp()
    {
        // Create panels
        DrawPanel drawPanel = new DrawPanel();
        ToolPanel toolPanel = new ToolPanel();
        StatusPanel statusPanel = new StatusPanel();

        // Attach mouse listener to draw panel
        drawPanel.addMouseListener(new PaintMouseListener());

        // Set layout and add panels
        setLayout(new BorderLayout());
        add(toolPanel, BorderLayout.WEST);
        add(statusPanel, BorderLayout.SOUTH);
        add(drawPanel, BorderLayout.CENTER);
    }
}
