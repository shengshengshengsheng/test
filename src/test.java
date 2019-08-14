import course.Course;

public class test {
    public static void main(String[] args) {
        Course course1=new Course("data Structure");
        Course course2=new Course("database Systems");
        course1.addStudent("peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne kennedy");

        course2.addStudent("peter Jones");
        course2.addStudent("Kim Smith");
        System.out.println("the number of students in course1:"+course1.getNumberOfStudents());
        String[] students=course1.getStudents();
        for(int i=0;i<course1.getNumberOfStudents();i++)
        {
            System.out.println(students[i]+", ");
        }
        System.out.println();
        System.out.print("number of students in course2 is:"+course2.getNumberOfStudents());
    }
}
