
public abstract class Flying  extends Vehicle {
     
    protected int maxFlyingHeight; // максимальная высота полета
    protected int signalLanterns; // сигнальные фонари
    protected int doorsQuantity; // Количество дверей ??
    protected String chassis; // Шасси (полозковые или колесные)
    protected int flightDuration; // продолжительность полета
    
    public Flying(String typeOfVehicle, String brand, int maxSpeed, int maxFlyingHeight, int flightDuration) {
        super(typeOfVehicle, brand, maxSpeed);
        this.maxFlyingHeight = maxFlyingHeight;
        this.flightDuration = flightDuration;
    }

}
