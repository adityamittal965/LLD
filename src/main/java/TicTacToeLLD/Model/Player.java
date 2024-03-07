package TicTacToeLLD.Model;


import lombok.Getter;
import lombok.Setter;

@Getter         // (Generates getters for name and playingPiece attributes)
@Setter         // Generates setters for name and playingPiece attributes
public class Player {
    String name ;
    PlayingPiece playingPiece ;

    public Player(String name, PlayingPiece playingPiece){
        this.name = name ;
        this.playingPiece = playingPiece ;
    }

}
