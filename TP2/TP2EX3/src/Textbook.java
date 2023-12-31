public class Textbook extends Book  {
    private String subject;
    private String gradeLevel;
    public Textbook(String title, String author, int year, int pages, String publisher,String subject,String gradeLevel) {
        super(title, author, year, pages, publisher);
        this.subject=subject;
        this.gradeLevel=gradeLevel;
    }

    @Override
    public void displayInformation() {
        System.out.println("Title: "+this.getTitle()+"Author: "+this.getAuthor()+"Year: "+this.getYear()+"Pages: "+this.getPages()+"Publisher: "+this.getPublisher()+"Subject: "+this.subject+"Grade Level: "+this.gradeLevel);
    }
}
