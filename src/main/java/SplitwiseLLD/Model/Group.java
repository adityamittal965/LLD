package SplitwiseLLD.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;


@Getter
@Setter
public class Group {
    private int groupId ;
    private String name ;
    private List <User> users ;
    private List<User> takers ;
    private User giver ;
    private double amount ;
    private SplitMechanism splitMechanism ;

    private HashMap <User, Double> exactSplitAmount ;

    public Group(int groupId, String name){
        this.groupId = groupId ;
        this.name = name ;
        exactSplitAmount = new HashMap<>() ;
    }

    public void addUser(User user){
        users.add(user) ;
    }

    public void removeUser(User user){
        users.remove(user) ;
    }

    public void calculateTakers(){
        if(splitMechanism instanceof EqualSplitMechanism){
            takers = users ;
        }
        else if(splitMechanism instanceof ExactSplitMechanism){
            for(User user: exactSplitAmount.keySet()){
                takers.add(user) ;
            }
        }
    }

}
