public abstract class Flight {
    private int flightnum;
    private String destination;
    private int hourofFlight;
    private int embarkDoor;
    private double baseflightCost;
    private airShip airShip;
    private airCompany airCompany;

    public Flight ( int flightum, String destination, int hourofFlight, int embarkDoor,
                    double baseflightCost, airShip airShip,  airCompany airCompany) {
        this.flightnum=flightum;
        this.destination=destination;
        this.hourofFlight=hourofFlight;
        this.embarkDoor=embarkDoor;
        this.baseflightCost=baseflightCost;
        this.airShip= airShip;
        this.airCompany= airCompany;
    }
    public abstract double flightCost();
}

