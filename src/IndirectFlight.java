public class IndirectFlight extends Flight{

    public IndirectFlight(int flightum, String destination, int hourofFlight, int embarkDoor, double baseflightCost) {
        super(flightum, destination, hourofFlight, embarkDoor, baseflightCost);
    }

    @Override
    public double flightCost() {
        return 0;
    }
}

