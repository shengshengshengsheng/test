package course;

public class Course {
    private String courseName;
    private String[] students=new String[100];
    private int numberOfStudents=0;
    public Course(String courseName)
    {
        this.courseName=courseName;
    }
    public String getCourseName()
    {
        return  courseName;
    }
    public void addStudent(String student)
    {
        students[numberOfStudents++]=student;
    }
    public void dropStudent(String student)
    {

    }
    public String[] getStudents()
    {
        return students;
    }
    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }
}
