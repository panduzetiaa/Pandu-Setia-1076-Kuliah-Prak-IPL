import java.io.*;
import java.util.Vector;

public class ListOfNumbers2 {
    private Vector<Integer> victor;
    private static final int size = 10;

    public ListOfNumbers2() {
        victor = new Vector<>(size);
        for (int i = 0; i < size; i++) {
            victor.addElement(i);
        }
        try {
            this.readList("infile.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");
        } catch (IOException e) {
            System.err.println("Error reading from file.");
        }
        try {
            this.writeList();
        } catch (IOException e) {
            System.err.println("Error writing to file.");
        }
    }

    public void readList(String fileName) throws IOException {
        String line;
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            while ((line = raf.readLine()) != null) {
                Integer i = Integer.parseInt(line);
                System.out.println(i);
                victor.addElement(i);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found.");
        } catch (IOException e) {
            System.err.println("Error reading from file.");
            throw e; // Rethrow exception to be handled by caller
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format.");
        }
    }

    public void writeList() throws IOException {
        try (PrintWriter out = new PrintWriter(new FileWriter("outfile.txt"))) {
            for (int i = 0; i < victor.size(); i++) {
                out.println("Value at: " + i + " = " + victor.elementAt(i));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds.");
        } catch (IOException e) {
            System.err.println("Error writing to file.");
            throw e; // Rethrow exception to be handled by caller
        } finally {
            System.out.println("Closing PrintWriter.");
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2();
    }
}
