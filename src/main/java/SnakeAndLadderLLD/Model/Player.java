package SnakeAndLadderLLD.Model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    String id ;
    int currPosition ;

    public Player(String id, int currPosition){
        this.id = id ;
        this.currPosition = currPosition ;
    }

}
