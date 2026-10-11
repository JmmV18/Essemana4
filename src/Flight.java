public abstract class Flight {
    private int flightnum;
    private String destination;
    private int hourofFlight;
    private int embarkDoor;
    private double baseflightCost;
    private airShip ship;
    private airCompany company;

    public Flight ( int flightum, String destination, int hourofFlight, int embarkDoor, double baseflightCost){
        this.flightnum=flightum;
        this.destination=destination;
        this.hourofFlight=hourofFlight;
        this.embarkDoor=embarkDoor;
        this.baseflightCost=baseflightCost;
    }
    public abstract double flightCost();

}

