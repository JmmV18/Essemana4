public class DirectFlight extends Flight{
    public DirectFlight(int flightum, String destination, int hourofFlight,
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

