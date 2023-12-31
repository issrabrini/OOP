public class Student implements LibraryUser{
    private int studentId;
    private String studentName;
    private String studentAddress;
    private LibraryCard libraryCard;
    public Student(int studentId, String studentName, String studentAddress, LibraryCard libraryCard) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.libraryCard = libraryCard;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public void returnBook(Book book)
    {
        book.setBorrowedBy(null);
        System.out.println("Student "+this.getStudentName()+" has returned the book "+book.getTitle());
    }
    @Override
    public void borrowBook(Book book)
    {
        if(libraryCard.isActive())
        {
            if(book.getBorrowedBy()!=null)
            {
                System.out.println("The book "+book.getTitle()+" is already borrowed  ");

            }else
            {
                 book.setBorrowedBy(this);
                 System.out.println("Student " + this.getStudentName() + " has borrowed the book " + book.getTitle());
            }
        }else{
            System.out.println("The library card is not active");
        }
    }
}
