package LibraryManagementSystemLLD.book;

import java.util.Date;
import java.util.List;

/*
This is a data class i.e it has fields but it doesn't have any special behavior
 */
public class BookDetails {
    private final String bookName ;
    private final Date publicationDate ;
    private final List<String> authors ;

    public BookDetails(String bookName, Date publicationDate, List <String> authors){
        this.bookName = bookName ;
        this.publicationDate = publicationDate ;
        this.authors = authors ;
    }
}
