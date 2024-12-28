public class DialogBox extends Window {
    private String message;
    private String[] options;

    // Constructor untuk menginisialisasi DialogBox dengan pesan dan opsi
    public DialogBox(String message, String[] options) {
        this.message = message;
        this.options = options;
    }

    // Getter untuk mendapatkan pesan dialog
    public String getMessage() {
        return message;
    }

    // Setter untuk mengatur pesan dialog
    public void setMessage(String message) {
        this.message = message;
    }

    // Getter untuk mendapatkan opsi dialog
    public String[] getOptions() {
        return options;
    }

    // Setter untuk mengatur opsi dialog
    public void setOptions(String[] options) {
        this.options = options;
    }

    // Override metode open dari Window
    @Override
    public void open() {
        super.open();
        System.out.println("DialogBox is now open with message: " + message);
    }

    // Override metode close dari Window
    @Override
    public void close() {
        super.close();
        System.out.println("DialogBox is now closed.");
    }

    // Override metode display dari Window
    @Override
    public void display() {
        super.display();
        System.out.println("Displaying the DialogBox with message: " + message);
        System.out.println("Options:");
        for (String option : options) {
            System.out.println("- " + option);
        }
    }

    // Override metode handleEvent dari Window
    @Override
    public void handleEvent(Event event) {
        super.handleEvent(event);
        System.out.println("DialogBox handling event: " + event.getEventType());
    }
}
