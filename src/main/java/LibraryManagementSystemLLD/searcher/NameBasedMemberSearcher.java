package LibraryManagementSystemLLD.searcher;

import LibraryManagementSystemLLD.dataAccessor.DBAccessor;
import LibraryManagementSystemLLD.dataAccessor.Results;
import LibraryManagementSystemLLD.dataAccessor.ResultsConverter;
import LibraryManagementSystemLLD.user.Member;

import java.util.List;

public class NameBasedMemberSearcher implements MemberSearcher{
    public final String memberName ;
    private final DBAccessor dbAccessor ;


    public NameBasedMemberSearcher(String memberName){
        this.memberName = memberName ;
        this.dbAccessor = new DBAccessor() ;
    }

    @Override
    public List<Member> search(){
        Results result = dbAccessor.getMembersWithName(memberName) ;
        return ResultsConverter.convertToMembers(result) ;
    }
}
