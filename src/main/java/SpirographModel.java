public class SpirographModel {
    private int largeRadius;
    private int smallRadius;
    private int penDistance;
    private int numSteps;
    private double anglePerStep;

    public SpirographModel(int lr, int sr, int pd, int nSteps, double aps) {
        largeRadius = lr;
        smallRadius = sr;
        penDistance = pd;
        numSteps = nSteps;
        anglePerStep = aps;
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

    public int getNumSteps() {
        return numSteps;
    }

    public double getAnglePerStep() {
        return anglePerStep;
    }
}
