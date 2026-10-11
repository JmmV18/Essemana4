public class IndirectFlight extends Flight{

    public IndirectFlight(int flightum, String destination, int hourofFlight,
                          int embarkDoor, double baseflightCost,
                          airShip airShip, airCompany airCompany) {
        super(flightum, destination, hourofFlight, embarkDoor,
                baseflightCost, airShip,  airCompany);
    }

    @Override
    public double flightCost() {
        return 0;
    }
}

