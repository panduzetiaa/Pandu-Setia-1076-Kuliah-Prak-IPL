import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CircleDrawer extends JPanel {
    private int mouseX = -1;
    private int mouseY = -1;

    public CircleDrawer() {
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw the rectangle
        g2d.setColor(new Color(80, 204, 55));
        g2d.fillRect(100, 0, 200, 400);

        // Draw the circles
        int numCircles = 6;
        for (int i = numCircles; i > 1; i--) {
            int radius = i * 7;
            if (mouseX > 100 && mouseX < 300) {
                g2d.setColor(Color.WHITE);
            } else {
                g2d.setColor(new Color(80, 204, 55));
            }
            if (mouseX != -1 && mouseY != -1) {
                g2d.fillOval(mouseX - radius / 2, mouseY - radius / 2, radius, radius);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Drawer");
        CircleDrawer panel = new CircleDrawer();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
