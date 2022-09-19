
public class Car extends ByRoad {

    public Car(String typeOfVehicle, String brand, int maxSpeed, int quantityOfSeats, int wheelsQuantity, String drive) {
        super(typeOfVehicle, brand, maxSpeed, quantityOfSeats, wheelsQuantity, drive);
    }
    @Override
    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: " + AnsiColours.ANSI_GREEN + typeOfVehicle + AnsiColours.ANSI_RESET)
            .append(" Brand: " + AnsiColours.ANSI_GREEN + brand + AnsiColours.ANSI_RESET)
            .append(" Drive: " + AnsiColours.ANSI_GREEN + drive + AnsiColours.ANSI_RESET)
            .append(" Quantity of seats: " + AnsiColours.ANSI_GREEN + quantityOfSeats + AnsiColours.ANSI_RESET); 
        return sb.toString();
    }
}
