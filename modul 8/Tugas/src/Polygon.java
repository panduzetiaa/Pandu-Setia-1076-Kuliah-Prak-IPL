public class Polygon extends Shape {
    private int numberOfSides;
    private Point[] points;

    public Polygon(int numberOfSides, Point[] points) {
        this.numberOfSides = numberOfSides;
        this.points = points;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    @Override
    public void draw() {
        // Implementasi metode draw
        System.out.println("Drawing a Polygon");
    }

    @Override
    public void erase() {
        // Implementasi metode erase
        System.out.println("Erasing a Polygon");
    }

    @Override
    public void move() {
        // Implementasi metode move
        System.out.println("Moving a Polygon");
    }

    @Override
    public void resize() {
        // Implementasi metode resize
        System.out.println("Resizing a Polygon");
    }
}
