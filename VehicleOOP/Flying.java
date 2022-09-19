
public abstract class Flying  extends Vehicle {
     
    protected int maxFlyingHeight; // максимальная высота полета
    protected int signalLanterns; // сигнальные фонари
    protected int doorsQuantity; // Количество дверей ??
    protected String chassis; // Шасси (полозковые или колесные)
    protected int flightDuration; // продолжительность полета
    
    public Flying(String typeOfVehicle, String brand, int maxSpeed, int quantityOfSeats, int maxFlyingHeight, int flightDuration, String chassis) {
        super(typeOfVehicle, brand, maxSpeed, quantityOfSeats);
        this.maxFlyingHeight = maxFlyingHeight;
        this.flightDuration = flightDuration;
        this.chassis = chassis;
    }
    @Override
    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: " + AnsiColours.ANSI_GREEN + typeOfVehicle + AnsiColours.ANSI_RESET)
            .append(" Brand: " + AnsiColours.ANSI_GREEN + brand + AnsiColours.ANSI_RESET)
            .append(" Chassis: " + AnsiColours.ANSI_GREEN + chassis + AnsiColours.ANSI_RESET)
            .append(" Quantity of seats: " + AnsiColours.ANSI_GREEN + quantityOfSeats + AnsiColours.ANSI_RESET); 
        return sb.toString();
    }
    @Override
    public String getEnvironment() {
        return "Air transport";
    }
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
