package LibraryManagementSystemLLD.book;

public class BookCopy {
    // Composition (has-A relationship)
    private final BookDetails bookDetails ;
    private final int id ;

    public BookCopy(BookDetails bookDetails, int id){
        this.bookDetails = bookDetails ;
        this.id = id ;
    }
}
