import java.util.Vector;

public class Course {
    private String title;
    private Vector CourseRecords;
    Course() {
        CourseRecords=new Vector();
    }
    public String getTitle() {return title;}
    public  void setTitle(String t) {title=t;}
    public void addCourseRecord(CourseRecord cr) {
        CourseRecord.addElement(cr);
    }
    public void printCourseStudents(){
        /*
         */
    }
    public void printBestStudent(){
        /*
         */
    }
    public void printFinalExamStudents(){
        /*
         */
    }
}
