
public abstract class Water extends Vehicle {
   
    protected int draft; // осадка судна (погружение) вотерлиния

    public Water(String typeOfVehicle, String brand, int maxSpeed, int quantityOfSeats, int draft) {
        super(typeOfVehicle, brand, maxSpeed, quantityOfSeats);
        this.draft = draft;
    }
    @Override
    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append(typeOfVehicle)
            .append(brand)
            .append(draft)
            .append(quantityOfSeats);
            
        return sb.toString();
    }
    @Override
    public String getEnvironment() {
        return "Water transport";
    }
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
