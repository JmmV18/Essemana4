public abstract class Flight {
    private int flightNum;
    private String destination;
    private int hourOfFlight;
    private int embarkDoor;
    private double baseFlightCost;
    private AirShip airShip;
    private AirCompany airCompany;

    public Flight (int flightNum, String destination, int hourOfFlight, int embarkDoor,
                   double baseFlightCost, AirShip airShip, AirCompany airCompany) {
        this.flightNum = flightNum;
        this.destination = destination;
        this.hourOfFlight = hourOfFlight;
        this.embarkDoor = embarkDoor;
        this.baseFlightCost = baseFlightCost;
        this.airShip = airShip;
        this.airCompany = airCompany;
    }
    public abstract double getFlightCost();

    public int getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public int getHourOfFlight() {
        return hourOfFlight;
    }

    public int getEmbarkDoor() {
        return embarkDoor;
    }

    public double getBaseFlightCost() {
        return baseFlightCost;
    }

    public AirShip getAirShip() {
        return airShip;
    }

    public AirCompany getAirCompany() {
        return airCompany;
    }
}

