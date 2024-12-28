public class DrawingContext {
    private Point currentPoint;

    // Mengatur titik saat ini
    public void setPoint(Point point) {
        this.currentPoint = point;
    }

    // Mendapatkan titik saat ini
    public Point getPoint() {
        return currentPoint;
    }

    // Membersihkan layar
    public void clearScreen() {
        System.out.println("Screen cleared");
    }

    // Mendapatkan ukuran vertikal layar
    public int getVerticalSize() {
        // Contoh nilai untuk ukuran vertikal
        return 600; // Misalnya 600 piksel
    }

    // Mendapatkan ukuran horizontal layar
    public int getHorizontalSize() {
        // Contoh nilai untuk ukuran horizontal
        return 800; // Misalnya 800 piksel
    }
}
