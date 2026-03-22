import javax.swing.*;
import java.awt.*;

public class SpirographView extends JComponent {
    private SpirographModel sm;
    private double x;
    private double y;

    public SpirographView () {
        sm = new SpirographModel(200, 75, 55, 8000, 0.007);
        x = getWidth() - sm.getSmallR();
        y = sm.getLargeR();
    }

    public void setSpirographModel(SpirographModel sm) {
        this.sm = sm;
        repaint();
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.translate(0, getHeight());

        g.setColor(Color.PINK);

        for (double i = 0; i < sm.getNumSteps(); i++) {
            double radiiDif = sm.getLargeR() - sm.getSmallR();
            double time = i * sm.getAnglePerStep();
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
