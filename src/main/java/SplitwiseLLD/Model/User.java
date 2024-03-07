package SplitwiseLLD.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String userId ;
    private String name ;
    private String email ;
    private String phone ;

    public User(String userId){
        this.userId = userId ;
    }

}
