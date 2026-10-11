public class DirectFlight extends Flight{
    public DirectFlight(int flightum, String destination, int hourofFlight, int embarkDoor, double baseflightCost) {
        super(flightum, destination, hourofFlight, embarkDoor, baseflightCost);
    }

    @Override
    public double flightCost() {
        return 0;
    }
}

