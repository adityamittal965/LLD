package SplitwiseLLD.Model;

public class EqualSplitMechanism implements SplitMechanism{
    Group group ;

    public EqualSplitMechanism(Group group){
        this.group = group ;
    }

    @Override
    public double getPart(User user){
        int totalUsers = group.getUsers().size() ;
        double amountSpent = group.getAmount() ;
        return amountSpent / totalUsers ;
    }
}
