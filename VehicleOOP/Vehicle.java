public abstract class Vehicle  implements InterfaceVehicle {
    
    protected String typeOfVehicle; // тип ТС
    protected String brand; // марка и модель
    protected int maxSpeed; // максимальная скорость
    protected int loadCapacity; // Грузоподъемность
    protected int quantityOfSeats; // Количество посадочных мест
    protected int engineCapacity; // Мощность двигателя Лошадиные силы
    protected int weightOfVehicle; // Вес ТС
    protected int heightOfVehicle; // Высота ТС
    protected int lenghtOfVehicle; // Длина ТС
    protected int WidthOfVehicle; // Ширина ТС
    protected String bodyOfVehicle; // Кузов есть у всех (у вертолета фюзеляж) (хэч, седан)
    protected String typeOfEngine;
    protected String transmission; // коробка передач (ручка/автомат)
    protected String breakSystem;
    protected String fuelType;
    protected int fuelTankVolume;
    protected boolean windshield; // Лобовое/Ветровое стекло
    protected String shockAbsorber; // Амортизатор есть у всех
    protected String steering; // рулевое управление (руль/штурвал)
    protected boolean trunk;  // Багажный отсек - да/нет
    protected boolean audioSystem; // аудиосистема - да/нет
    protected String manufacturer;
    protected String frame; // Рама (есть у всех)
    protected int numberOfCylinders; 
    protected int yearOfIssue;
    
    public Vehicle(String typeOfVehicle, String brand, int maxSpeed, int quantityOfSeats) { 
        this.typeOfVehicle = typeOfVehicle;
        this.brand = brand;
        this.quantityOfSeats = quantityOfSeats;
        this.maxSpeed = maxSpeed;
    }
    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append(typeOfVehicle).append(brand);
        return sb.toString();
    }
    public String value() {
        return " km/h";
    }
}
