import javax.swing.*;

public class SpirographController {
    private SpirographView sv;
    private JTextField largeRadius;
    private JTextField smallRadius;
    private JTextField penDistance;
    private JLabel numSteps;
    private JLabel anglePerStep;
    private double time;

    public SpirographController(SpirographView sv,
               JTextField largeR, JTextField smallR,
               JTextField pDistance, JLabel nSteps,
               JLabel aps) {

        largeRadius = largeR;
        smallRadius = smallR;
        penDistance = pDistance;
        numSteps = nSteps;
        anglePerStep = aps;
    }
}
