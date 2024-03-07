package LibraryManagementSystemLLD.searcher;

import LibraryManagementSystemLLD.user.Member;

import java.util.List;


/*
1. Interfaces have only abstract methods (no definition) which are public in nature by default (100% abstraction)
   i.e we need to implement all the methods of an interface in the class implementing it
2. Interface fields are public, static and final by default
3. Interfaces support multiple inheritance and hence solve the diamond problem
 */

public interface MemberSearcher {
    List<Member> search() ;
}
