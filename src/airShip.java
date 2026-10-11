public class airShip {

    private String fabricant;
    private String model;
    private int capacity;

    public airShip(String fabricant, String model, int capacity){
        this.capacity= capacity;
        this.model = model;
        this.fabricant = fabricant;
    }

    public String getFabricant() {
        return fabricant;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
}
