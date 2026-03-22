public class SpirographModel {
    private int largeRadius;
    private int smallRadius;
    private int penDistance;
    private int numSteps;
    private double anglePerStep;

    public SpirographModel() {
        largeRadius = 200;
        smallRadius = 75;
        penDistance = 55;
        numSteps = 8000;
        anglePerStep = 0.007;
    }

    public int getLargeR() {
        return largeRadius;
    }

    public int getSmallR() {
        return smallRadius;
    }

    public int getPenD() {
        return penDistance;
    }
}
