
public class Helicopter extends Flying {
    
    protected int bladesNumber; // Количество лопастей

    public Helicopter(String typeOfVehicle, String brand, int maxSpeed, int quantityOfSeats, int maxFlyingHeight, int flightDuration, String chassis, int bladesNumber) {
        super(typeOfVehicle, brand, maxSpeed, quantityOfSeats, maxFlyingHeight, flightDuration, chassis);
        this.bladesNumber = bladesNumber;
    }
    @Override
    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: " + AnsiColours.ANSI_CYAN + typeOfVehicle + AnsiColours.ANSI_RESET)
            .append(" Brand: " + AnsiColours.ANSI_CYAN + brand + AnsiColours.ANSI_RESET)
            .append(" Chassis: " + AnsiColours.ANSI_CYAN + chassis + AnsiColours.ANSI_RESET)
            .append(" Number of blades: " + AnsiColours.ANSI_CYAN + bladesNumber + AnsiColours.ANSI_RESET)
            .append(" Quantity of seats: " + AnsiColours.ANSI_CYAN + quantityOfSeats + AnsiColours.ANSI_RESET); 
        return sb.toString();
    }
}
