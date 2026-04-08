public class PricingService {

    public double calculateFare(double distance, boolean isPeak, boolean highDemand) {
        double baseFare = 50;
        double ratePerKm = 10;

        double fare = baseFare + (distance * ratePerKm);

        if (isPeak) {
            fare *= 1.5;
        }

        if (highDemand) {
            fare *= 2.0;
        }

        return fare;
    }
}