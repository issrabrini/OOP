public class Main {
    public static void main(String[] args)
    {
        Student s=new Student(2200319,"issra","brini");
        Instructor i=new Instructor(1000,"Ahmed","mohsen");
        Course c1=new Course(22,"arabic",i);
        Course c2=new Course(11,"francais",i);
        s.enroll(c1);
        s.enroll(c2);
        s.afficher();
    }
}