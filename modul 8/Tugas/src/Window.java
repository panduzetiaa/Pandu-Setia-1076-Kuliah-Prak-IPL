public class Window {
    // Metode untuk membuka jendela
    public void open() {
        System.out.println("Window is now open.");
    }

    // Metode untuk menutup jendela
    public void close() {
        System.out.println("Window is now closed.");
    }

    // Metode untuk memindahkan jendela
    public void move() {
        System.out.println("Window is being moved.");
    }

    // Metode untuk menampilkan jendela
    public void display() {
        System.out.println("Displaying the window.");
    }

    // Metode untuk menangani event
    public void handleEvent(Event event) {
        System.out.println("Handling event: " + event.getEventType());
    }
}
