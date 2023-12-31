public class Teacher implements LibraryUser{
    private int teacherId;
    private String teacherName;
    private String teacherAddress;
    private LibraryCard libraryCard;
    public Teacher(int teacherId, String teacherName, String teacherAddress, LibraryCard libraryCard) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherAddress = teacherAddress;
        this.libraryCard = libraryCard;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getTeacherAddress() {
        return teacherAddress;
    }
    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    @Override
    public void returnBook(Book book)
    {
        book.setBorrowedBy(null);
        System.out.println("Teacher "+this.getTeacherName()+" has returned the book "+book.getTitle());
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
                 System.out.println("Teacher " + this.getTeacherName() + " has borrowed the book " + book.getTitle());
            }
        }else{
            System.out.println("The library card is not active");
        }
    }
}
