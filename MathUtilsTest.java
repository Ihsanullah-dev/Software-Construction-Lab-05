package Lab05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testValidAltitude() {

        double result =
                MathUtils.calculateGravitationalPotentialEnergy(10);

        assertEquals(98.1, result, 0.001);
    }

    @Test
    public void testNegativeAltitudeFailsFast() {

        assertThrows(
                IllegalArgumentException.class,
                () -> MathUtils.calculateGravitationalPotentialEnergy(-5)
        );
    }
}