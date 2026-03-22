import javax.swing.*;
import java.awt.*;

public class SpirographView extends JComponent {
    private SpirographModel sm;
    private double x;
    private double y;
    private double time;

    public SpirographView () {
        sm = new SpirographModel();
        time = 20;
        x = getWidth() - sm.getSmallR();
        y = sm.getLargeR();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.translate(0, getHeight());

        g.setColor(Color.PINK);

        for (double i = 0; i < time; i++) {
            double radiiDif = sm.getLargeR() - sm.getSmallR();
            double startX = x;
            double startY = y;
            x = radiiDif * Math.cos(time) + sm.getPenD()
                    * Math.cos(radiiDif * time/sm.getSmallR());
            y = radiiDif * Math.sin(time) - sm.getPenD()
                    * Math.sin(radiiDif * time/sm.getSmallR());
            g.drawLine((int) startX, (int) startY, (int) x, (int) y);
        }
    }

}
