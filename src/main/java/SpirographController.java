import javax.swing.*;

public class SpirographController {
    private final SpirographView sv;
    private final JTextField largeRadius;
    private final JTextField smallRadius;
    private final JTextField penDistance;
    private final JTextField numSteps;
    private final JTextField anglePerStep;

    public SpirographController(SpirographView sv,
               JTextField largeR, JTextField smallR,
               JTextField pDistance, JTextField nSteps,
               JTextField aps) {
        this.sv = sv;
        largeRadius = largeR;
        smallRadius = smallR;
        penDistance = pDistance;
        numSteps = nSteps;
        anglePerStep = aps;
    }

    public void draw(int largeR, int smallR, int pd, int ns, double aps) {
        SpirographModel newSM = new SpirographModel(largeR, smallR, pd, ns, aps);
        sv.setSpirographModel(newSM);


    }
}
