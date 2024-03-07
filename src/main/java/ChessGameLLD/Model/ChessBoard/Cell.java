package ChessGameLLD.Model.ChessBoard;

import ChessGameLLD.Model.ChessBoard.Piece.Piece;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cell {
    private Piece piece;
    private int x;
    private int y;

    public Cell(int x, int y, Piece piece) {
        this.setPiece(piece);
        this.setX(x);
        this.setY(y);
    }
}
