package lichtman.spirograph;

public class SpirographController {
    private final SpirographView sView;

    public SpirographController(SpirographView view) {
        sView = view;
    }

    public void draw(double largeR, double smallR, double penDistance, double numSteps, double anglePerStep) {
        sView.setSpirographModel(new SpirographModel(
                largeR, smallR, penDistance, numSteps, anglePerStep));
    }
}
