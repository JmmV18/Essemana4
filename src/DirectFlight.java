public class DirectFlight extends Flight {

    public DirectFlight(int flightNum, String destination, int hourOfFlight,
                        int embarkDoor, double baseFlightCost,
                        AirShip airShip, AirCompany airCompany) {

        super(flightNum, destination, hourOfFlight, embarkDoor,
                baseFlightCost, airShip, airCompany);
    }

    @Override
    public double getFlightCost() {
        double profitMarkup = getBaseFlightCost() * getAirCompany().getProfitTax();
        return getBaseFlightCost() + profitMarkup;
    }

}

