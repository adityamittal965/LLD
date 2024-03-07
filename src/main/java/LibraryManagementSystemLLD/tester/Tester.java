package LibraryManagementSystemLLD.tester;

import LibraryManagementSystemLLD.auth.UserAuthenticator;
import LibraryManagementSystemLLD.book.BookCopy;
import LibraryManagementSystemLLD.book.BookDetails;
import LibraryManagementSystemLLD.dataAccessor.DBAccessor;
import LibraryManagementSystemLLD.idGenerator.IDGenerator;
import LibraryManagementSystemLLD.library.Library;
import LibraryManagementSystemLLD.searcher.*;
import LibraryManagementSystemLLD.user.Member;

import java.util.Date;
import java.util.List;

// API Layer
public class Tester {

    // Validate the parameters

    /*
    Note: In searchBooksbyBookName() method, we have
     BookSearcher bookSearcher = new NameBasedBookSearcher(bookName) ;
     and in searchBooksbyAuthorNames() method, we have
     BookSearcher bookSearcher = new AuthorBasedBookSearcher(authorNames) ;
     i.e we have new of some concrete class in both methods, this can be avoided by using Factory Design Pattern
     */

    private final Library library = new Library(new DBAccessor()) ;
    public List <BookCopy> searchBooksbyBookName(String bookName){
        if(bookName == null)
            throw new IllegalArgumentException("Book Name can't be null") ;
        BookSearcher bookSearcher = new NameBasedBookSearcher(bookName) ;
        return bookSearcher.search() ;
    }

    public List <BookCopy> searchBooksbyAuthorNames(List<String> authorNames){
        if(authorNames == null || authorNames.size() == 0)
            throw new IllegalArgumentException("Author Names can't be null or empty") ;
        BookSearcher bookSearcher = new AuthorBasedBookSearcher(authorNames) ;
        return bookSearcher.search() ;
    }

    public List <Member> searchMembersByMemberName(String memberName, String adminToken) throws IllegalAccessException{
        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbidden") ;
        }
        MemberSearcher memberSearcher = new NameBasedMemberSearcher(memberName) ;
        return memberSearcher.search() ;
    }

    public void addBook(String bookName, Date publicationDate, List <String> authors, String adminToken) throws IllegalAccessException{
        if(bookName == null || bookName.length() == 0 || authors == null || authors.size() == 0 || adminToken == null || adminToken.length() == 0){
            throw new IllegalArgumentException("bookName/authors/adminToken can't be null or empty") ;
        }
        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbidden") ;
        }
        BookCopy bookCopy = new BookCopy(new BookDetails(bookName, publicationDate, authors), IDGenerator.getUniqueId()) ;
        library.addBookCopy(bookCopy);
    }

    public void deleteBook(int bookCopyId, String adminToken) throws IllegalAccessException{
        if(bookCopyId == 0 || adminToken == null || adminToken.length() == 0){
            throw new IllegalArgumentException("bookCopyId / adminToken can't be null") ;
        }

        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbidden") ;
        }

        BookSearcher bookSearcher = new IdBasedBookSearcher(bookCopyId) ;
        // As id is unique for a book, bookCopies will have only one book
        List <BookCopy> bookCopies = bookSearcher.search() ;
        if(bookCopies == null || bookCopies.size() == 0)
            throw new RuntimeException("No book copies retrieved for given id") ;
        library.deleteBookCopy(bookCopies.get(0));
    }

    public void blockMember(int memberId, String adminToken) throws IllegalAccessException{
        if(memberId == 0 || adminToken == null || adminToken.length() == 0){
            throw new IllegalArgumentException("memberId / adminToken can't be null") ;
        }

        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbidden") ;
        }

        MemberSearcher memberSearcher = new IdBasedMemberSearcher(memberId) ;
        List <Member> members = memberSearcher.search() ;
        if(members == null || members.size() == 0)
            throw new RuntimeException("No members retrieved for given id") ;
        library.blockMember(members.get(0));
    }

    public void issueBook(int bookCopyId, int memberId, String adminToken) throws IllegalAccessException{
        if(memberId == 0 || bookCopyId == 0 || adminToken == null || adminToken.length() == 0){
            throw new IllegalArgumentException("memberId / adminToken can't be null") ;
        }

        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbidden") ;
        }

        BookSearcher bookSearcher = new IdBasedBookSearcher(bookCopyId) ;
        List <BookCopy> bookCopies = bookSearcher.search() ;
        if(bookCopies == null || bookCopies.size() == 0)
            throw new RuntimeException("No book copies retrieved for given id") ;

        MemberSearcher memberSearcher = new IdBasedMemberSearcher(memberId) ;
        List <Member> members = memberSearcher.search() ;
        if(members == null || members.size() == 0)
            throw new RuntimeException("No members retrieved for given id") ;

        library.issueBook(bookCopies.get(0), members.get(0));
    }

    public void submitBook(int bookCopyId, int memberId, String adminToken) throws IllegalAccessException{
        // similar to issueBook method
        if(memberId == 0 || bookCopyId == 0 || adminToken == null || adminToken.length() == 0){
            throw new IllegalArgumentException("memberId / adminToken can't be null") ;
        }

        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbidden") ;
        }

        BookSearcher bookSearcher = new IdBasedBookSearcher(bookCopyId) ;
        List <BookCopy> bookCopies = bookSearcher.search() ;
        if(bookCopies == null || bookCopies.size() == 0)
            throw new RuntimeException("No book copies retrieved for given id") ;

        MemberSearcher memberSearcher = new IdBasedMemberSearcher(memberId) ;
        List <Member> members = memberSearcher.search() ;
        if(members == null || members.size() == 0)
            throw new RuntimeException("No members retrieved for given id") ;

        library.submitBook(bookCopies.get(0), members.get(0));
    }

    public Member getBorrowerOfBook(int bookCopyId, String adminToken) throws IllegalAccessException{
        // similar to deleteBook method
        if(bookCopyId == 0 || adminToken == null || adminToken.length() == 0){
            throw new IllegalArgumentException("bookCopyId / adminToken can't be null") ;
        }

        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbidden") ;
        }

        BookSearcher bookSearcher = new IdBasedBookSearcher(bookCopyId) ;
        // As id is unique for a book, bookCopies will have only one book
        List <BookCopy> bookCopies = bookSearcher.search() ;
        if(bookCopies == null || bookCopies.size() == 0)
            throw new RuntimeException("No book copies retrieved for given id") ;
        return library.getBorrower(bookCopies.get(0));
    }

    public List <BookCopy> getBooksBorrowedByMember(int memberId, String adminToken) throws IllegalAccessException{
        if(memberId == 0 || adminToken == null || adminToken.length() == 0){
            throw new IllegalArgumentException("memberId / adminToken can't be null") ;
        }

        if(!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation Forbidden") ;
        }

        MemberSearcher memberSearcher = new IdBasedMemberSearcher(memberId) ;
        List <Member> members = memberSearcher.search() ;
        if(members == null || members.size() == 0)
            throw new RuntimeException("No members retrieved for given id") ;

        return library.getBorrowedBooks(members.get(0));
    }

    public static void main(String[] args){
        // Create Sample Data here and test above functions
    }
}
