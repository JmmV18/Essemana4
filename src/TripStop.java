public class TripStop {

    private Airport stopAirport;
    private double refuelFee;
    private boolean allowsBoarding;

    public TripStop(Airport stopAirport, double refuelFee, boolean allowsBoarding) {
        this.stopAirport = stopAirport;
        this.refuelFee = refuelFee;
        this.allowsBoarding = allowsBoarding;
    }

    public boolean doesAllowBoarding() {
        return allowsBoarding;
    }

    public double getRefuelFee() {
        return refuelFee;
    }
}
