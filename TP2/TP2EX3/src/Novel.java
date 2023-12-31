public class Novel extends Book{
    public Novel(String title, String author, int year, int pages, String publisher) {
        super(title, author, year, pages, publisher);
    }


    @Override
    public void displayInformation() {
        System.out.println("Title: "+this.getTitle()+"Author: "+this.getAuthor()+"Year: "+this.getYear()+"Pages: "+this.getPages()+"Publisher: "+this.getPublisher());
    }
}
