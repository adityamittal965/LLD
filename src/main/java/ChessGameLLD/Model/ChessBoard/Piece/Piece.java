package ChessGameLLD.Model.ChessBoard.Piece;

import ChessGameLLD.Model.ChessBoard.Board;
import ChessGameLLD.Model.ChessBoard.Cell;
import lombok.Setter;

@Setter
public abstract class Piece {
    private boolean killed = false;
    private boolean white = false;
    private boolean castlingDone = false ;

    public Piece(boolean white) {
        this.setWhite(white);
    }

    public boolean isKilled() {
        return this.killed;
    }
    public boolean isWhite() {
        return this.white;
    }

    public boolean isCastlingDone() {
        return this.castlingDone ;
    }
    public abstract boolean canMove(Board board, Cell start, Cell end);
}
