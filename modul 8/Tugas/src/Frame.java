import java.util.ArrayList;
import java.util.List;

public class Frame {
    private String title;
    private int width;
    private int height;
    private List<Window> windows;

    // Constructor untuk menginisialisasi Frame
    public Frame(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.windows = new ArrayList<>();
    }

    // Getter untuk mendapatkan judul Frame
    public String getTitle() {
        return title;
    }

    // Setter untuk mengatur judul Frame
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter untuk mendapatkan lebar Frame
    public int getWidth() {
        return width;
    }

    // Setter untuk mengatur lebar Frame
    public void setWidth(int width) {
        this.width = width;
    }

    // Getter untuk mendapatkan tinggi Frame
    public int getHeight() {
        return height;
    }

    // Setter untuk mengatur tinggi Frame
    public void setHeight(int height) {
        this.height = height;
    }

    // Metode untuk menambah Window ke dalam Frame
    public void addWindow(Window window) {
        this.windows.add(window);
        System.out.println("Window added: " + window);
    }

    // Metode untuk menghapus Window dari Frame
    public void removeWindow(Window window) {
        this.windows.remove(window);
        System.out.println("Window removed: " + window);
    }

    // Metode untuk menampilkan semua Window dalam Frame
    public void displayWindows() {
        System.out.println("Displaying all windows in frame '" + title + "':");
        for (Window window : windows) {
            window.display();
        }
    }
}
