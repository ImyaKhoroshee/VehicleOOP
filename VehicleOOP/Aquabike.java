
public class Aquabike extends Water {

    protected String waterReleaseSystem; // система выброса воды

    public Aquabike(String typeOfVehicle, String brand, int maxSpeed, int quantityOfSeats, int draft, String waterReleaseSystem) {
        super(typeOfVehicle, brand, maxSpeed, quantityOfSeats, draft);
        this.waterReleaseSystem = waterReleaseSystem;
    }
    @Override
    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type: " + AnsiColours.ANSI_RED + typeOfVehicle + AnsiColours.ANSI_RESET)
            .append(" Brand: " + AnsiColours.ANSI_RED + brand + AnsiColours.ANSI_RESET)
            .append(" Draft: " + AnsiColours.ANSI_RED + draft + AnsiColours.ANSI_RESET)
            .append(" Quantity of seats: " + AnsiColours.ANSI_RED + quantityOfSeats + AnsiColours.ANSI_RESET)
            .append(" Water release system: " + AnsiColours.ANSI_RED + waterReleaseSystem + AnsiColours.ANSI_RESET); 
        return sb.toString();
    }
}
