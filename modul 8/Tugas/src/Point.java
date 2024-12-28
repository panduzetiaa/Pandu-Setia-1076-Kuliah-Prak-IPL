public class Point {
    private int x;
    private int y;

    // Constructor untuk menginisialisasi titik
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter untuk mendapatkan nilai x
    public int getX() {
        return x;
    }

    // Setter untuk mengatur nilai x
    public void setX(int x) {
        this.x = x;
    }

    // Getter untuk mendapatkan nilai y
    public int getY() {
        return y;
    }

    // Setter untuk mengatur nilai y
    public void setY(int y) {
        this.y = y;
    }

    // Metode untuk memindahkan titik ke lokasi baru
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Metode untuk menampilkan informasi titik
    @Override
    public String toString() {
        return "Point(" + "x=" + x + ", y=" + y + ')';
    }
}
