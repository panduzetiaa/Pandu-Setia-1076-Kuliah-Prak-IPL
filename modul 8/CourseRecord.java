import java.util.Enumeration;
import java.util.Vector;

public class CourseRecord {
    private Student student;
    private Vector assignments;

    // Constructor
    public CourseRecord() {
        assignments = new Vector(); // Memperbaiki penamaan variabel
    }

    // Menambahkan elemen ke CourseRecord (mungkin diperlukan logika tambahan di sini)
    public static void addElement(CourseRecord cr) {
        // Logika untuk menambahkan CourseRecord ke dalam koleksi tertentu bisa ditambahkan di sini
    }

    // Mendapatkan siswa
    public Student getStudent() {
        return student;
    }

    // Mengatur siswa
    public void setStudent(Student s) {
        student = s;
    }

    // Menambahkan penugasan
    public void addAssignment(Assignment a) {
        assignments.addElement(a);
    }

    // Mendapatkan daftar penugasan
    public Enumeration getAssignments() {
        return assignments.elements();
    }
}
