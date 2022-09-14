
public class Helicopter extends Flying {
    
    protected int bladesNumber; // Количество лопастей

    public Helicopter(String typeOfVehicle, String brand, int maxSpeed, int maxFlyingHeight, int flightDuration) {
        super(typeOfVehicle, brand, maxSpeed, maxFlyingHeight, flightDuration);
        
    }

    public Helicopter(String typeOfVehicle, String brand, int maxSpeed, int maxFlyingHeight, int flightDuration, int bladesNumber) {
        super(typeOfVehicle, brand, maxSpeed, maxFlyingHeight, flightDuration);
        this.bladesNumber = bladesNumber;
        
    }
    
}
