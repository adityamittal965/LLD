package TicTacToeLLD.Model;


import lombok.Getter;

@Getter
public class PlayingPiece {
    PieceType pieceType ;

    public PlayingPiece(PieceType pieceType){
        this.pieceType = pieceType ;
    }

}
