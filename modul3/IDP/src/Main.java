interface EngineInterface {
    void start();
}

class PetrolEngine implements EngineInterface {
    @Override
    public void start() {
        System.out.println("Petrol engine starting...");
    }
}

class DieselEngine implements EngineInterface {
    @Override
    public void start() {
        System.out.println("Diesel engine starting...");
    }
}

class HybridEngine implements EngineInterface {
    @Override
    public void start() {
        System.out.println("Hybrid engine starting...");
    }
}

class Car {
    private EngineInterface engine;

    public Car(EngineInterface engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}

class Main {
    public static void main(String[] args) {
        Car fuelCar = new Car(new PetrolEngine());
        Car dieselCar = new Car(new DieselEngine());
        Car hybridCar = new Car(new HybridEngine());

        // Menghidupkan setiap mobil
        fuelCar.start();
        dieselCar.start();
        hybridCar.start();
    }
}
