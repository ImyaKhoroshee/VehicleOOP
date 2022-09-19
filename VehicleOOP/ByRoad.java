
public abstract class ByRoad  extends Vehicle {
    
    protected String typeOfwheel; 
    protected String sideOfSteeringWheel; // положение руля
    protected int wheelsQuantity; // количество колес
    protected String drive; // Привод (передний/полный)
    protected int headlightQuntity; // количество фар
    protected int mileage; // Пробег
    // Бампер

    public ByRoad(String typeOfVehicle, String brand, int maxSpeed, int quantityOfSeats, int wheelsQuantity, String drive) {
        super(typeOfVehicle, brand, maxSpeed, quantityOfSeats);
        this.wheelsQuantity = wheelsQuantity;
        this.drive = drive;
    }
    @Override
    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type of vehicle: " + typeOfVehicle)
            .append(" Brand: " + brand)
            .append(" Quantity of seats: " + quantityOfSeats)
            .append(" Quantity of wheels: " + wheelsQuantity);
        return sb.toString();
    }
    @Override
    public String getEnvironment() {
        return "Road transport";
    }
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}