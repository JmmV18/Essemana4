public abstract class Flight {
    int flightnum;
    String destination;
    int hourofFlight;
    int embarkDoor;
    double baseflightCost;

    public Flight ( int flightum, String destination, int hourofFlight, int embarkDoor, double baseflightCost){
        this.flightnum=flightum;
        this.destination=destination;
        this.hourofFlight=hourofFlight;
        this.embarkDoor=embarkDoor;
        this.baseflightCost=baseflightCost;
    }
    public abstract double flightCost();
//d
}

