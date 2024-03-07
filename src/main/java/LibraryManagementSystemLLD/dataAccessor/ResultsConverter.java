package LibraryManagementSystemLLD.dataAccessor;

import LibraryManagementSystemLLD.book.BookCopy;
import LibraryManagementSystemLLD.user.Member;

import java.util.List;

/*
It takes in the Results object (JSON string) and converts it into the Business Object
 */
public class ResultsConverter {

    // Made the constructor private to prevent initialization of this class as the methods of this class are static
    private ResultsConverter(){

    }
    public static List <Member> convertToMembers(Results result){
        return null ;
    }

    public static List<BookCopy> convertToBookCopies(Results result){
        return null ;
    }

    public static Member convertToMember(Results result){
        return null ;
    }

    public static BookCopy convertToBookCopy(Results result){
        return null ;
    }
}
