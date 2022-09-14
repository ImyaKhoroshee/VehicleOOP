
public abstract class ByRoad  extends Vehicle {
    
    protected String typeOfwheel; 
    protected String sideOfSteeringWheel; // положение руля
    protected int WheelsQuantity; // количество колес
    protected String drive; // Привод (передний/полный)
    protected int headlightQuntity; // количество фар
    protected int mileage; // Пробег
    // Бампер

    public ByRoad(String typeOfVehicle, String brand, int maxSpeed) {
        super(typeOfVehicle, brand, maxSpeed);
    }

}