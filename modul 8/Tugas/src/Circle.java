public class Circle extends Shape {
    private float radius;
    private Point center;

    public Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        // Implementasi metode draw
        System.out.println("Drawing a Circle");
    }

    @Override
    public void erase() {
        // Implementasi metode erase
        System.out.println("Erasing a Circle");
    }

    @Override
    public void move() {
        // Implementasi metode move
        System.out.println("Moving a Circle");
    }

    @Override
    public void resize() {
        // Implementasi metode resize
        System.out.println("Resizing a Circle");
    }
}
 