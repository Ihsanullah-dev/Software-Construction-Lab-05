package Lab05;

/**
 * Utility class for mathematical calculations.
 */
public class MathUtils {

    /**
     * Calculates gravitational potential energy.
     *
     * @param altitude altitude in meters relative to sea level.
     * Requires altitude >= 0.
     * @return gravitational potential energy.
     */
    public static double calculateGravitationalPotentialEnergy(
            double altitude) {

        if (altitude < 0) {
            throw new IllegalArgumentException(
                    "Altitude cannot be negative."
            );
        }

        double mass = 1.0;
        double gravity = 9.81;

        return mass * gravity * altitude;
    }
}