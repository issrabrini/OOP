public abstract class Book {
    private String title;
    private String author;
    private int year;
    private int pages;

    private String publisher;

    public LibraryUser getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(LibraryUser borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    private LibraryUser borrowedBy;
    public Book(String title, String author, int year, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public abstract void displayInformation();
}
