package LibraryManagementSystemLLD.searcher;

import LibraryManagementSystemLLD.book.BookCopy;
import LibraryManagementSystemLLD.dataAccessor.DBAccessor;
import LibraryManagementSystemLLD.dataAccessor.Results;
import LibraryManagementSystemLLD.dataAccessor.ResultsConverter;

import java.util.List;

public class IdBasedBookSearcher implements BookSearcher{

    private final int id ;
    private final DBAccessor dbAccessor ;

    public IdBasedBookSearcher(int id){
        this.id = id ;
        this.dbAccessor = new DBAccessor() ;
    }

    @Override
    public List<BookCopy> search() {
        Results result = dbAccessor.getBooksWithId(id) ;
        return ResultsConverter.convertToBookCopies(result) ;
    }
}
