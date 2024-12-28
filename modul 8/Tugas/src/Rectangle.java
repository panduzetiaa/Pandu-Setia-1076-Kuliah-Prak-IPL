public class Rectangle extends Shape {
    private float width;
    private float height;
    private Point topLeft;

    public Rectangle(float width, float height, Point topLeft) {
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void draw() {
        // Implementasi metode draw
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public void erase() {
        // Implementasi metode erase
        System.out.println("Erasing a Rectangle");
    }

    @Override
    public void move() {
        // Implementasi metode move
        System.out.println("Moving a Rectangle");
    }

    @Override
    public void resize() {
        // Implementasi metode resize
        System.out.println("Resizing a Rectangle");
    }
}
