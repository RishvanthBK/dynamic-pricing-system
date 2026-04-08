import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PricingServiceTest {

    PricingService service = new PricingService();

    @Test
    void testNonPeak() {
        double fare = service.calculateFare(10, false, false);
        assertEquals(150, fare);
    }

    @Test
    void testPeak() {
        double fare = service.calculateFare(10, true, false);
        assertEquals(225, fare);
    }

    @Test
    void testHighDemand() {
        double fare = service.calculateFare(10, false, true);
        assertEquals(300, fare);
    }

    @Test
    void testPeakAndHighDemand() {
        double fare = service.calculateFare(10, true, true);
        assertEquals(450, fare);
    }
}