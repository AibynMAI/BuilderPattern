package builder;

public class Car {

    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final String transmission;
    private final boolean sunroof;

    public Car(String brand, String model, String color,
               String engine, String transmission, boolean sunroof) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
        this.sunroof = sunroof;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public boolean hasSunroof() {
        return sunroof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", sunroof=" + sunroof +
                '}';
    }
}