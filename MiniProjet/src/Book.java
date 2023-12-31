import java.time.LocalDate;

class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isBorrowed;
    private int id;

    public Book(String title, String author, int publicationYear, int id) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }


    public int getId() {
        return id;
    }

    public void displayInformation() {
        System.out.println("Title: " + this.title + "Author: " + this.author + "Publication Year: " + this.publicationYear + "Borrowed: " + this.isBorrowed);
    }
}


