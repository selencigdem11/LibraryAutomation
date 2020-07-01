package Books;
public class Books {
    
    public static int getTotalCount() {
        return totalCount;
    }
    
    private int bookId;
    private String bookName;
    private String author;
    private String publisher;
    private int yearOfPublication;
    //private String type;
    private static int totalCount=0;

    public Books(int bookId, String bookName, String author, String publisher, int yearOfPublication) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        
        totalCount++;
    }
    

    @Override
    public String toString() {
        return "Book Id= " + bookId + "\n  |Book Name= " + bookName + "\n  |Author= " + author + "\n  |Publisher= " + publisher + "\n  |Year Of Publication= " + getYearOfPublication()  ;
    }

    /**
     * @return the bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the bookId
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @return the yearOfPublication
     */
    public int getYearOfPublication() {
        return yearOfPublication;
    }

}
