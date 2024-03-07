package LibraryManagementSystemLLD.searcher;

import LibraryManagementSystemLLD.book.BookCopy;
import LibraryManagementSystemLLD.dataAccessor.DBAccessor;
import LibraryManagementSystemLLD.dataAccessor.Results;
import LibraryManagementSystemLLD.dataAccessor.ResultsConverter;

import java.util.List;

public class AuthorBasedBookSearcher implements BookSearcher{
    private final List <String> authors ;
    private final DBAccessor dbAccessor ;

    public AuthorBasedBookSearcher(List<String> authors){
        this.authors = authors ;
        this.dbAccessor = new DBAccessor() ;
    }

    @Override
    public List <BookCopy> search(){
        Results result = dbAccessor.getBooksWithAuthorNames(authors) ;
        return ResultsConverter.convertToBookCopies(result) ;
    }
}
