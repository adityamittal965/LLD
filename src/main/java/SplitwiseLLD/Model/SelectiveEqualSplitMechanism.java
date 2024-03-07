package SplitwiseLLD.Model;

public class SelectiveEqualSplitMechanism implements SplitMechanism {
    Group group ;

    public SelectiveEqualSplitMechanism(Group group){
        this.group = group ;
    }

    @Override
    public double getPart(User user){
        int totalTakers = group.getTakers().size() ;
        double amountSpent = group.getAmount() ;
        return amountSpent / totalTakers ;
    }
}
