
public class Motocycle extends ByRoad {
    
    Boolean legStand; // подставка для ног
    
    public Motocycle(String typeOfVehicle, String brand, int maxSpeed, int quantityOfSeats, int wheelsQuantity, String drive, Boolean legStand) {
        super(typeOfVehicle, brand, maxSpeed, quantityOfSeats, wheelsQuantity, drive);
        this.legStand = legStand;
    }
    @Override
    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append( "Type: " + AnsiColours.ANSI_BLUE +typeOfVehicle + AnsiColours.ANSI_RESET)
            .append(" Brand: " + AnsiColours.ANSI_BLUE + brand + AnsiColours.ANSI_RESET)
            .append(" Drive: " + AnsiColours.ANSI_BLUE + drive + AnsiColours.ANSI_RESET)
            .append(" Quantity of seats: " + AnsiColours.ANSI_BLUE + quantityOfSeats + AnsiColours.ANSI_RESET)
            .append(" Leg stand: " + AnsiColours.ANSI_BLUE + legStand + AnsiColours.ANSI_RESET); 
        return sb.toString();
    }
}
