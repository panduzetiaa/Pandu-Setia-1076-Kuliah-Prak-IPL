interface VehicleInterface {
    void drive();
    void stop();
    void refuel();
}

interface DoorInterface {
    void openDoors();
}

class Motorcycle implements VehicleInterface {
    @Override
    public void drive() {
        // Implementasi metode drive untuk Motorcycle
    }

    @Override
    public void stop() {
        // Implementasi metode stop untuk Motorcycle
    }

    @Override
    public void refuel() {
        // Implementasi metode refuel untuk Motorcycle
    }
}

class Car implements VehicleInterface, DoorInterface {

    @Override
    public void drive() {
        // Implementasi metode drive untuk Car
    }

    @Override
    public void stop() {
        // Implementasi metode stop untuk Car
    }

    @Override
    public void refuel() {
        // Implementasi metode refuel untuk Car
    }

    @Override
    public void openDoors() {
        // Implementasi metode openDoors untuk Car
    }
}
