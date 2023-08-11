public class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        finalPosition = computePositionOfObject(gravity, fallingTime, initialVelocity, initialPosition);

        // unmodified output is "The object's position after 10.0 seconds is 0.0m.
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }

    public static double computePositionOfObject(
            double gravity,
            double fallingTime,
            double initialVelocity,
            double initialPosition
    ) {
        double position = 0.5
                * (gravity * Math.pow(fallingTime, 2))
                + (initialVelocity * fallingTime)
                + initialPosition;

        return position;
    }
}