package LibraryManagementSystemLLD.searcher;

import LibraryManagementSystemLLD.dataAccessor.DBAccessor;
import LibraryManagementSystemLLD.dataAccessor.Results;
import LibraryManagementSystemLLD.dataAccessor.ResultsConverter;
import LibraryManagementSystemLLD.user.Member;

import java.util.List;

public class IdBasedMemberSearcher implements MemberSearcher{
    private static int id ;
    private final DBAccessor dbAccessor ;

    public IdBasedMemberSearcher(int id){
        this.id = id ;
        this.dbAccessor = new DBAccessor() ;
    }

    @Override
    public List<Member> search(){
        Results result = dbAccessor.getMembersWithId(id) ;
        return ResultsConverter.convertToMembers(result) ;
    }
}
