package lichtman.Spirograph;

public class SpirographModel {
    private final int largeRadius;
    private final int smallRadius;
    private final int penDistance;
    private final int numSteps;
    private final double anglePerStep;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SpirographModel that = (SpirographModel) o;
        return largeRadius == that.largeRadius
                && smallRadius == that.smallRadius
                && penDistance == that.penDistance
                && numSteps == that.numSteps
                && Double.compare(anglePerStep, that.anglePerStep) == 0;
    }
}
