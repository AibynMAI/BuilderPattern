package builder;

public abstract class AbstractCarBuilder implements CarBuilder {

    protected String brand;
    protected String model;
    protected String color;
    protected String engine;
    protected String transmission;
    protected boolean sunroof;

    @Override
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
        return this;
    }

    @Override
    public Car build() {
        validate();

        return new Car(
                brand,
                model,
                color,
                engine,
                transmission,
                sunroof
        );
    }

    private void validate() {
        if (brand == null || brand.isBlank()) {
            throw new IllegalStateException("Brand is required");
        }

        if (model == null || model.isBlank()) {
            throw new IllegalStateException("Model is required");
        }

        if (engine == null || engine.isBlank()) {
            throw new IllegalStateException("Engine is required");
        }

        if (transmission == null || transmission.isBlank()) {
            throw new IllegalStateException("Transmission is required");
        }
    }
}