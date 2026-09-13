package builder;

public class CarDirector {

    public Car buildLuxuryCar() {
        return new LuxuryCarBuilder().build();
    }

    public Car buildEconomyCar() {
        return new EconomyCarBuilder().build();
    }
}