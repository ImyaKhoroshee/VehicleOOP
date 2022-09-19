import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        Aquabike saeDooP = new Aquabike("Aquabike", "SEA-DOO PERFORMANCE RXP-X 300", 80, 3, 20, ":)");
        Aquabike yamaha = new Aquabike("Aquabike", "YAMAHA FX CRUISER SVHO", 100, 3, 20, ":)");
        Aquabike saeDooS = new Aquabike("Aquabike", "SEA-DOO SPARK TRIXX 3UP", 77, 3, 25, ":)");
        Car fordFiesta = new Car("Car", "Ford Fiesta", 208, 5, 4, "Front");
        Car kiaPicanto = new Car("Car", "Kia Picanto", 155, 5, 4, "Front");
        Car infiniti = new Car("Car", "Infiniti QX60", 190, 7, 4, "Full");
        Car nissan = new Car("Car", "Nissan Juke", 170, 5, 4, "Full");
        Car audi = new Car("Car", "Audi A3", 250, 5, 4, "Front");
        Car lexus = new Car("Car", "Lexus ES 200", 210, 5, 4, "Front");
        Car honda = new Car("Car", "Honda Talon 1000X", 120, 2, 4, "Full");
        Motocycle bmwG = new Motocycle("Moto", "BMW G 310 R", 145, 2, 2, "Chain", true);
        Motocycle kawasaki = new Motocycle("Moto", "KAWASAKI NINJA 400", 188, 2, 2, "Chain", true);
        Motocycle suzuki = new Motocycle("Moto", "SUZUKI SV650 ABS (SV650A)", 203, 2, 2, "Chain", true);
        Motocycle yamahaX = new Motocycle("Moto", "YAMAHA XJ6", 207, 2, 2, "Chain", true);
        Motocycle bmwF = new Motocycle("Moto", "BMW F 800 GT", 200, 2, 2, "Chain", true);
        Motocycle harley = new Motocycle("Moto", "HARLEY-DAVIDSON SUPERLOW", 170, 2, 2, "Belt", true);
        Quadricycle rm = new Quadricycle("Quadricycle", "RM 800 DUO", 100, 2, 4, "Full");
        Quadricycle stels = new Quadricycle("Quadricycle", "Stels ATV 650 Guepard ST", 90, 2, 4, "Full");
        Quadricycle yamahaYF = new Quadricycle("Quadricycle", "Yamaha YFZ450R SE", 80, 2, 4, "Full");
        Quadricycle cfMoto = new Quadricycle("Quadricycle", "CFMOTO CFORCE 600 S EPS", 95, 1, 4, "Full");
        Quadricycle polaris = new Quadricycle("Quadricycle", "Polaris Sportsman 570", 100, 2, 4, "Full");
        Helicopter gen = new Helicopter("Helicopter", "GEN H-4", 200, 1, 3000, 30, "Skid", 2);
        Helicopter airScooter = new Helicopter("Helicopter", "Air Scooter 2", 101, 1, 2100, 120, "Floaters", 2);
        Helicopter dynali = new Helicopter("Helicopter", "Dynali H2S", 165, 2, 3650, 180, "Skid", 2);
        Helicopter df = new Helicopter("Helicopter", "DF Helicopters DF334", 148, 2, 3100, 160, "Skid", 2);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(saeDooP); 
        vehicles.add(yamaha); 
        vehicles.add(saeDooS); 
        vehicles.add(fordFiesta);
        vehicles.add(kiaPicanto);
        vehicles.add(infiniti);
        vehicles.add(nissan);
        vehicles.add(audi);
        vehicles.add(lexus);
        vehicles.add(honda);
        vehicles.add(bmwG);
        vehicles.add(kawasaki);
        vehicles.add(suzuki);
        vehicles.add(yamahaX);
        vehicles.add(bmwF);
        vehicles.add(harley);
        vehicles.add(rm);
        vehicles.add(stels);
        vehicles.add(yamahaYF);
        vehicles.add(cfMoto);
        vehicles.add(polaris);
        vehicles.add(gen);
        vehicles.add(airScooter);
        vehicles.add(dynali);
        vehicles.add(df);
        
        for (Vehicle vcls : vehicles) {
            System.out.println(vcls.info());
            System.out.println(AnsiColours.ANSI_UNDERLINE + "Max speed: " + vcls.getMaxSpeed() + vcls.value() + AnsiColours.ANSI_RESET);
            System.out.println(AnsiColours.ANSI_UNDERLINE + "The environment: " + vcls.getEnvironment() + AnsiColours.ANSI_RESET + "\n");
        } 
    }
}
