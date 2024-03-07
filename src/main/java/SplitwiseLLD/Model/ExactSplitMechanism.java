package SplitwiseLLD.Model;

import java.util.HashMap;

public class ExactSplitMechanism implements SplitMechanism {
    Group group ;

    public ExactSplitMechanism(Group group){
        this.group = group ;
    }

    @Override
    public double getPart(User user){
        HashMap<User, Double> exactSplit = group.getExactSplitAmount() ;
        return exactSplit.get(user) ;
    }
}
