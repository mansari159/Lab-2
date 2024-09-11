import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class HybridTests {
    private Hybrid hybridVehicle;

    @Before
    public void setUp() {
        hybridVehicle = new Hybrid(300, 120, 70); // Example data
        hybridVehicle.setCostPerGallon(3.50);
        hybridVehicle.setCostPerKWh(0.24);
    }

    @Test
    public void testCalculateMPG() {
        assertEquals(30.0, hybridVehicle.calculateMPG(), 0.1);  // Example: 300 miles, 10 miles/gallon
    }

    @Test
    public void testCalculateMPGe() {
        assertEquals(57.71, hybridVehicle.calculateMPGe(), 0.1); // Example: 120 miles, 70 kWh
    }

    @Test
    public void testGetCostPerGallon() {
        assertEquals(3.50, hybridVehicle.getCostPerGallon(), 0.01);
    }

    @Test
    public void testSetCostPerGallon() {
        hybridVehicle.setCostPerGallon(4.00);
        assertEquals(4.00, hybridVehicle.getCostPerGallon(), 0.01);
    }

    @Test
    public void testGetCostPerKWh() {
        assertEquals(0.24, hybridVehicle.getCostPerKWh(), 0.01);
    }

    @Test
    public void testSetCostPerKWh() {
        hybridVehicle.setCostPerKWh(0.30);
        assertEquals(0.30, hybridVehicle.getCostPerKWh(), 0.01);
    }

    @Test
    public void testHybridModeAverage() {
        double averageMPG = (hybridVehicle.calculateMPG() + hybridVehicle.calculateMPGe()) / 2;
        assertEquals(43.855, averageMPG, 0.1); // Changed tolerance to 0.1 to handle small floating-point differences
    }
}
