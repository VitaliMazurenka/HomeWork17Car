public class Car {


    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;


    public String toString() {
        return brand + " " + "[" + licensePlate + "]" + " " + color + " " + registrationDate.toString() + " " + engine.toString();
    }

    public Car(String brand, String color, String licensePlate) {
                this.brand =brand;
                this.color = color;
                this.licensePlate = licensePlate;


}
