// Abstraksi untuk mesin
interface EngineInterface {
    void start();
}

// Implementasi mesin bensin
class PetrolEngine implements EngineInterface {
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}

// Implementasi mesin diesel
class DieselEngine implements EngineInterface {
    @Override
    public void start() {
        System.out.println("Diesel engine started");
    }
}

// Kelas Car bergantung pada EngineInterface, bukan pada implementasi spesifik
class Car {
    private EngineInterface engine;

    // Car menerima engine melalui constructor (dependency injection)
    public Car(EngineInterface engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}

// Penggunaan
public class Main {
    public static void main(String[] args) {
        EngineInterface petrolEngine = new PetrolEngine();
        Car petrolCar = new Car(petrolEngine);
        petrolCar.start();

        EngineInterface dieselEngine = new dieselEngine();
        Car dieselCar = new Car(dieselEngine);
        dieselCar.start();
    }
}
