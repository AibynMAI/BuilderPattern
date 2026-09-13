package builder;

public class Main {

    public static void main(String[] args) {

        CarDirector director = new CarDirector();

        Car luxuryCar = director.buildLuxuryCar();
        Car economyCar = director.buildEconomyCar();

        System.out.println("Luxury car:");
        System.out.println(luxuryCar);

        System.out.println();

        System.out.println("Economy car:");
        System.out.println(economyCar);

        System.out.println();

        Car customCar = new LuxuryCarBuilder()
                .setColor("Blue")
                .setTransmission("Manual")
                .build();

        System.out.println("Custom car:");
        System.out.println(customCar);
    }
}