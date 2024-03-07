package LibraryManagementSystemLLD.searcher;

import LibraryManagementSystemLLD.book.BookCopy;
import LibraryManagementSystemLLD.dataAccessor.DBAccessor;
import LibraryManagementSystemLLD.dataAccessor.Results;
import LibraryManagementSystemLLD.dataAccessor.ResultsConverter;

import java.util.List;

public class NameBasedBookSearcher implements BookSearcher{

    private final String bookName ;
    private final DBAccessor dbAccessor ;

    public NameBasedBookSearcher(String bookName){

        this.bookName = bookName ;
        this.dbAccessor = new DBAccessor() ;
    }
    @Override
    public List<BookCopy> search(){
        Results result = dbAccessor.getBooksWithName(bookName) ;
        return ResultsConverter.convertToBookCopies(result) ;
    }
}
