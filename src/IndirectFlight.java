import java.util.LinkedList;
import java.util.List;

public class IndirectFlight extends Flight {
 private List<TripStop> tripStops;

    public IndirectFlight(int flightNum, String destination, int hourOfFlight, int embarkDoor,
                          double baseFlightCost, AirShip airShip, AirCompany airCompany) {
        super(flightNum, destination, hourOfFlight, embarkDoor, baseFlightCost, airShip, airCompany);
        this.tripStops = new LinkedList<>();
    }

    @Override
    public double getFlightCost() {
        double baseCost = getBaseFlightCost();
        double airlineProfit = baseCost * getAirCompany().getProfitTax();
        double totalRefuelFee = 0.0;
        for (TripStop stop : tripStops) {
            totalRefuelFee += stop.getRefuelFee();
        }
        return baseCost + airlineProfit + totalRefuelFee;
    }
}

