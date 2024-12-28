public class ConsoleWindow extends Window {
    private String consoleTitle;

    // Constructor untuk menginisialisasi ConsoleWindow dengan judul
    public ConsoleWindow(String consoleTitle) {
        this.consoleTitle = consoleTitle;
    }

    // Getter untuk mendapatkan judul konsol
    public String getConsoleTitle() {
        return consoleTitle;
    }

    // Setter untuk mengatur judul konsol
    public void setConsoleTitle(String consoleTitle) {
        this.consoleTitle = consoleTitle;
    }

    // Override metode open dari Window
    @Override
    public void open() {
        super.open();
        System.out.println("Console window '" + consoleTitle + "' is now open.");
    }

    // Override metode close dari Window
    @Override
    public void close() {
        super.close();
        System.out.println("Console window '" + consoleTitle + "' is now closed.");
    }

    // Override metode display dari Window
    @Override
    public void display() {
        super.display();
        System.out.println("Displaying the console window '" + consoleTitle + "'.");
    }

    // Override metode handleEvent dari Window
    @Override
    public void handleEvent(Event event) {
        super.handleEvent(event);
        System.out.println("Console window handling event: " + event.getEventType());
    }
}
