
public abstract class Water extends Vehicle {
   
    protected int draft; // осадка судна (погружение) вотерлиния

    public Water(String typeOfVehicle, String brand, int maxSpeed) {
        super(typeOfVehicle, brand, maxSpeed);
    }
    
}
