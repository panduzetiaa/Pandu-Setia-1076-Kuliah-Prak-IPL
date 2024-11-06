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
        // kode untuk mengendarai motor
    }

    @Override
    public void stop() {
        // kode untuk menghentikan motor
    }

    @Override
    public void refuel() {
        // kode untuk mengisi bahan bakar motor
    }
    // Tidak perlu implementasi openDoors() karena tidak diperlukan
}

class Car implements VehicleInterface, DoorInterface {
    @Override
    public void drive() {
        // kode untuk mengendarai mobil
    }

    @Override
    public void stop() {
        // kode untuk menghentikan mobil
    }

    @Override
    public void refuel() {
        // kode untuk mengisi bahan bakar mobil
    }

    @Override
    public void openDoors() {
        // kode untuk membuka pintu mobil
    }
}
