import java.util.ArrayList;
import java.util.List;

public class IndirectFlight extends Flight {
    List<tripStops> tp;

    public IndirectFlight(int flightum, String destination, int hourofFlight, int embarkDoor, double baseflightCost,airShip airShip,airCompany airCompany) {
        super(flightum, destination, hourofFlight, embarkDoor, baseflightCost,airShip,airCompany);
        this.tp = new ArrayList<>();
    }

    @Override
    public double flightCost() {
        return 0;

    }
}

