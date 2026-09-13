package builder;

public interface CarBuilder {

    CarBuilder setBrand(String brand);

    CarBuilder setModel(String model);

    CarBuilder setColor(String color);

    CarBuilder setEngine(String engine);

    CarBuilder setTransmission(String transmission);

    CarBuilder setSunroof(boolean sunroof);

    Car build();
}