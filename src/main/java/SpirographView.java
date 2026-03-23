import javax.swing.*;
import java.awt.*;

public class SpirographView extends JComponent {
    private SpirographModel sm;
    private double x;
    private double y;

    public SpirographView () {
        sm = new SpirographModel(200, 75, 55, 8000, 0.007);
        x = (getWidth() / 2.0)- sm.getLargeR();
        y = (getHeight() / 2.0) + sm.getLargeR();
    }

    public void setSpirographModel(SpirographModel sm) {
        this.sm = sm;
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //g.translate(0, getHeight());

        g.setColor(Color.PINK);

        double radiiDif = sm.getLargeR() - sm.getSmallR();
        for (double i = 0; i < sm.getNumSteps(); i++) {
            double startX = x;
            double startY = y;
            double time = i * sm.getAnglePerStep();
            x = radiiDif * Math.cos(time) + sm.getPenD()
                    * Math.cos(radiiDif * time/sm.getSmallR());
            y = radiiDif * Math.sin(time) - sm.getPenD()
                    * Math.sin(radiiDif * time/sm.getSmallR());

            g.drawLine((int) startX, (int) -startY, (int) x, (int) -y);
        }
    }

}
