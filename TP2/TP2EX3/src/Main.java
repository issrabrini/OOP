public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Novel("The Lord of the Rings", "J.R.R Tolkien", 1954, 1178, "George Allen & Unwin");
        Book book2 = new Novel("The Hobbit", "J.R.R Tolkien", 1937, 310, "George Allen & Unwin");
        Book book3 = new Novel("The Silmarillion", "J.R.R Tolkien", 1977, 365, "George Allen & Unwin");
        Book book4 = new Novel("The Children of Húrin", "J.R.R Tolkien", 2007, 313, "HarperCollins");
        Book book5 = new Novel("The Fall of Gondolin", "J.R.R Tolkien", 2018, 304, "HarperCollins");
        Book book6 = new Novel("The Adventures of Tom Bombadil", "J.R.R Tolkien", 1962, 64, "George Allen & Unwin");
        Book book7 = new Novel("The Road Goes Ever On", "J.R.R Tolkien", 1967, 72, "George Allen & Unwin");
        Book book8 = new Novel("The Father Christmas Letters", "J.R.R Tolkien", 1976, 111, "George Allen & Unwin");
        Book book9 = new Novel("The Letters of J.R.R Tolkien", "J.R.R Tolkien", 1981, 480, "George Allen & Unwin");
        Book book10 = new Novel("The History of Middle-earth", "J.R.R Tolkien", 1983, 480, "George Allen & Unwin");
        Book book11 = new Novel("The Story of Kullervo", "J.R.R Tolkien", 2015, 160, "HarperCollins");
        Book book12 = new Novel("The Lay of Aotrou and Itroun", "J.R.R Tolkien", 2017, 128, "HarperCollins");
        Book book13 = new Novel("The Fall of Arthur", "J.R.R Tolkien", 2013, 240, "HarperCollins");
        Book book14 = new Novel("Beowulf: A Translation and Commentary", "J.R.R Tolkien", 2014, 448, "HarperCollins");
        Book book15 = new Novel("The Legend of Sigurd and Gudrún", "J.R.R Tolkien", 2009, 377, "HarperCollins");
        Book book16 = new Novel("The Book of Lost Tales", "J.R.R Tolkien", 1983, 297, "George Allen & Unwin");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);
        library.addBook(book12);
        library.addBook(book13);
        library.addBook(book14);
        library.addBook(book15);
        library.addBook(book16);

        Student student1 = new Student(1, "John", "1st Street", new LibraryCard(1));
        if (library.isBookAvailable(book1)) {
            student1.borrowBook(book1);
        }
        student1.returnBook(book1);

    }
}