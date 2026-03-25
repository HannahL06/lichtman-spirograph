package lichtman.spirograph;

public class SpirographModel {
    private final double largeRadius;
    private final double smallRadius;
    private final double penDistance;
    private final double numSteps;
    private final double anglePerStep;

    public SpirographModel(double largeRadius, double smallRadius, double penDistance, double numSteps, double anglePerStep) {
        this.largeRadius = largeRadius;
        this.smallRadius = smallRadius;
        this.penDistance = penDistance;
        this.numSteps = numSteps;
        this.anglePerStep = anglePerStep;
    }

    public double getLargeR() {
        return largeRadius;
    }

    public double getSmallR() {
        return smallRadius;
    }

    public double getPenD() {
        return penDistance;
    }

    public double getNumSteps() {
        return numSteps;
    }

    public double getAnglePerStep() {
        return anglePerStep;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) { return false; }
        SpirographModel that = (SpirographModel) o;
        return largeRadius == that.largeRadius
                && smallRadius == that.smallRadius
                && penDistance == that.penDistance
                && numSteps == that.numSteps
                && Double.compare(anglePerStep, that.anglePerStep) == 0;
    }
}
