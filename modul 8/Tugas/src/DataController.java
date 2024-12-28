import java.util.ArrayList;
import java.util.List;

public class DataController {
    // Atribut untuk menyimpan data yang dikelola oleh DataController
    private List<Shape> shapes;
    private DrawingContext drawingContext;

    // Constructor untuk menginisialisasi DataController
    public DataController(DrawingContext drawingContext) {
        this.shapes = new ArrayList<>();
        this.drawingContext = drawingContext;
    }

    // Metode untuk menambah Shape ke dalam data
    public void addShape(Shape shape) {
        shapes.add(shape);
        System.out.println("Shape added: " + shape);
    }

    // Metode untuk menghapus Shape dari data
    public void removeShape(Shape shape) {
        shapes.remove(shape);
        System.out.println("Shape removed: " + shape);
    }

    // Metode untuk menggambar semua Shape
    public void drawAllShapes() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    // Metode untuk menghapus semua Shape
    public void clearAllShapes() {
        shapes.clear();
        System.out.println("All shapes cleared.");
    }

    // Metode untuk mengatur DrawingContext
    public void setDrawingContext(DrawingContext drawingContext) {
        this.drawingContext = drawingContext;
    }

    // Metode untuk mendapatkan DrawingContext saat ini
    public DrawingContext getDrawingContext() {
        return drawingContext;
    }
}
