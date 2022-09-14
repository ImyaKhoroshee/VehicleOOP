// BMW G 310 R - мотоцикл
// KAWASAKI NINJA 400 - мотоцикл
// SUZUKI SV650 ABS (SV650A)- мотоцикл
// YAMAHA XJ6 - мотоцикл
// BMW F 800 GT- мотоцикл
// HARLEY-DAVIDSON SUPERLOW- мотоцикл
// Ford Fiesta - автомобиль
// Kia Picanto- автомобиль
// Infiniti QX60- автомобиль
// Nissan Juke- автомобиль
// Audi А3- автомобиль
// Lexus ES 200- автомобиль
// Honda Talon 1000X- автомобиль
// RM 800 DUO - квадроцикл
// Stels ATV 650 Guepard ST - квадроцикл
// Yamaha YFZ450R SE - квадроцикл
// CFMOTO CFORCE 600 S EPS - квадроцикл
// Polaris Sportsman 570 - квадроцикл
// SEA-DOO PERFORMANCE RXP-X 300 - гидроцикл (очень мощный двигатель)
// YAMAHA FX CRUISER SVHO - гидроцикл (1-3 места)
// SEA-DOO SPARK TRIXX 3UP- гидроцикл (мощный, легкий, трехместный)
// GEN H-4 - вертолет (мини-вертолет без дверей без ветрового стекла, одноместный)
// Air Scooter 2  - вертолет (сверхлегкий вертолет без дверей без ветрового стекла, одноместный)
// Dynali H2S  - вертолет (стандартный, лёгкий двухместный вертолёт)
// DF Helicopters DF334  - вертолет (стандартный, лёгкий двухместный вертолёт)


public abstract class Vehicle {
    
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
    

    public Vehicle(String typeOfVehicle, String brand, int maxSpeed) { // этот конструктор б. доступен всем наследникам
        this.typeOfVehicle = typeOfVehicle;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

}
