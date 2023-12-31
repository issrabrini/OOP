import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private List<Course> courses;
    public Student(int studentId,String firstName,String lastName){
        this.courses=new ArrayList<Course>();
        this.firstName=firstName;
        this.lastName=lastName;
        this.studentId=studentId;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public List<Course> getCourses(){
        return courses;
    }
    public void enroll(Course course)
    {
        courses.add(course);
    }
    public void afficher() {
        System.out.println("Student infos: ");
        System.out.println("-ID: " + studentId + "\n-Name: " + firstName + "\n-lastname: " + lastName);
        if (courses.isEmpty()) {
            System.out.println("Enrolled courses: none");
        } else {
            for (Course course : courses)
            {
                System.out.println("Course infos: ");
                System.out.println("Course name: "+course.getCourseName());
                System.out.println("Instructor infos:");
                System.out.print("instructor name: "+course.getInstructor().getFirstName()+", ");
                System.out.println(course.getInstructor().getLastName());

            }
        }
    }

}
