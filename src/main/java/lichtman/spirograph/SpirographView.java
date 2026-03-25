package lichtman.spirograph;

import javax.swing.*;
import java.awt.*;

public class SpirographView extends JComponent {
    private SpirographModel sModel;
    private double x;
    private double y;

    public SpirographView() {
        sModel = new SpirographModel(200, 75, 55, 8000, 0.007);
        x = 0;
        y = 0;
    }

    public void setSpirographModel(SpirographModel model) {
        sModel = model;
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.translate((int) (getWidth() / 2.0), (int) (getHeight() / 2.0));

        Color drawColor = new Color(215, 167, 212);
        g.setColor(drawColor);

        double radiiDif = sModel.getLargeR() - sModel.getSmallR();
        for (double i = 0; i < sModel.getNumSteps(); i++) {
            double time = i * sModel.getAnglePerStep();
            x = radiiDif * Math.cos(time) + sModel.getPenD()
                    * Math.cos(radiiDif * time / sModel.getSmallR());
            y = radiiDif * Math.sin(time) - sModel.getPenD()
                    * Math.sin(radiiDif * time / sModel.getSmallR());
            g.drawLine((int) x, (int) -y, (int) x, (int) -y);
        }
    }

}
