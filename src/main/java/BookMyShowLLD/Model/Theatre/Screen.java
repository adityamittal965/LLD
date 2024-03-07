package BookMyShowLLD.Model.Theatre;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Screen {
    int screenId;
    List<Seat> seats ;

    public Screen(){
        seats = new ArrayList<>() ;
    }
}
