package LibraryManagementSystemLLD.library;

import LibraryManagementSystemLLD.book.BookCopy;
import LibraryManagementSystemLLD.dataAccessor.DBAccessor;
import LibraryManagementSystemLLD.dataAccessor.Results;
import LibraryManagementSystemLLD.dataAccessor.ResultsConverter;
import LibraryManagementSystemLLD.user.Member;

import java.util.List;

// Business Layer

/*
We can further break down Library Class into two classes, BookManager and Member Manager.
Library Class can have objects of BookManager and MemberManager i.e Library class can be composed of
BookManager and MemberManager  (Single Responsibility Principle)
 */
public class Library {

    private final DBAccessor dbAccessor ;

    public Library(DBAccessor dbAccessor){
        this.dbAccessor = dbAccessor ;
    }
    public void addBookCopy(BookCopy bookCopy){
        if(bookCopy == null)
            throw new IllegalArgumentException("bookCopy can't be null") ;
        dbAccessor.insertBookCopy(bookCopy) ;
    }

    public void deleteBookCopy(BookCopy bookCopy){
        if(bookCopy == null)
            throw new IllegalArgumentException("bookCopy can't be null") ;

        if(dbAccessor.isCopyAvailable(bookCopy))
            dbAccessor.deleteBookCopy(bookCopy);
    }

    public void blockMember(Member member){
        if(member == null)
            throw new IllegalArgumentException("bookCopy can't be null") ;
        dbAccessor.markAsBlocked(member);
    }

    public void issueBook(BookCopy bookCopy, Member member){
        if(member == null || bookCopy == null)
            throw new IllegalArgumentException("bookCopy/member can't be null") ;
        if(dbAccessor.isCopyAvailable(bookCopy))
            dbAccessor.issueBookCopyToMember(bookCopy, member);
    }

    public void submitBook(BookCopy bookCopy, Member member){
        if(member == null || bookCopy == null)
            throw new IllegalArgumentException("bookCopy/member can't be null") ;
        dbAccessor.submitBookCopyFromMember(bookCopy, member);
    }

    public Member getBorrower(BookCopy bookCopy){
        if(bookCopy == null)
            throw new IllegalArgumentException("bookCopy can't be null") ;
        Results result = dbAccessor.getBorrower(bookCopy) ;
        return ResultsConverter.convertToMember(result) ;
    }

    public List<BookCopy> getBorrowedBooks(Member member){
        if(member == null)
            throw new IllegalArgumentException("bookCopy can't be null") ;
        Results results = dbAccessor.getBorrowedBooks(member) ;
        return ResultsConverter.convertToBookCopies(results) ;
    }
}
