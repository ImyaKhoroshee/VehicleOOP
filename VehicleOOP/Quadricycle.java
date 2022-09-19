
public class Quadricycle extends ByRoad {

    public Quadricycle(String typeOfVehicle, String brand, int maxSpeed, int quantityOfSeats, int wheelsQuantity, String drive) {
        super(typeOfVehicle, brand, maxSpeed, quantityOfSeats, wheelsQuantity , drive);

    }
    @Override
    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: " + AnsiColours.ANSI_PURPLE + typeOfVehicle + AnsiColours.ANSI_RESET)
            .append(" Brand: " + AnsiColours.ANSI_PURPLE + brand + AnsiColours.ANSI_RESET)
            .append(" Quantity of seats: " + AnsiColours.ANSI_PURPLE + quantityOfSeats + AnsiColours.ANSI_RESET) 
            .append(" Drive: " + AnsiColours.ANSI_PURPLE + drive + AnsiColours.ANSI_RESET);
        return sb.toString();
    }
}