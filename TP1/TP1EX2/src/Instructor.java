public class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;
    public Instructor(int instructorId, String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.instructorId=instructorId;
    }
    public int getInstructorId(){
        return instructorId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
