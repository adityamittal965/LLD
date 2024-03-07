package LibraryManagementSystemLLD.dataAccessor;

import LibraryManagementSystemLLD.book.BookCopy;
import LibraryManagementSystemLLD.user.Member;

import java.util.List;


/*
All methods of this class will actually contain inside them SQL queries which will be responsible to make the
necessary changes in the database tables
 */
public class DBAccessor {

    public Results getBooksWithName(String bookName){
        return null ;
    }

    public Results getBooksWithId(int bookId){
        return null ;
    }

    public Results getBooksWithAuthorNames(List<String> authors){
        return null ;
    }

    public Results getMembersWithName(String memberName){
        return null ;
    }

    public Results getMembersWithId(int memberId){
        return null ;
    }


    public void insertBookCopy(BookCopy bookCopy){

    }

    public void deleteBookCopy(BookCopy bookCopy){

    }

    public void markAsBlocked(Member member){

    }

    public void issueBookCopyToMember(BookCopy bookCopy, Member member){

    }

    public void submitBookCopyFromMember(BookCopy bookCopy, Member member){

    }

    public boolean isCopyAvailable(BookCopy bookCopy){
        return true ;
    }

    public Results getBorrower(BookCopy bookCopy){
        return null ;
    }

    public Results getBorrowedBooks(Member member){
        return null ;
    }
}
