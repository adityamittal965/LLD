package LibraryManagementSystemLLD.searcher;


/*
1. Interfaces have only abstract methods (no definition) which are public in nature by default (100% abstraction)
   i.e we need to implement all the methods of an interface in the class implementing it
2. Interface fields are public, static and final by default
3. Interfaces support multiple inheritance and hence solve the diamond problem
 */

import LibraryManagementSystemLLD.book.BookCopy;

import java.util.List;

/*
We are creating interface to follow Open-Closed SOLID Principle, currently we are supporting search on the basis
of book name and author names. If we want to search on basis of another criteria in future, we can do so by implementing
BookSearcher interface
 */
public interface BookSearcher {
    List<BookCopy> search() ;
}
