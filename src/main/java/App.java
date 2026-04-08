public class App {
    public static void main(String[] args) {
        PricingService service = new PricingService();

        double fare = service.calculateFare(10, true, true);
        System.out.println("Final Fare: " + fare);
    }
}