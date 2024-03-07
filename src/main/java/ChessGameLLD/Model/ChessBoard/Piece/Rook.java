package ChessGameLLD.Model.ChessBoard.Piece;

import ChessGameLLD.Model.ChessBoard.Board;
import ChessGameLLD.Model.ChessBoard.Cell;

public class Rook extends Piece{
    public Rook(boolean white) {
        super(white);
    }
    @Override
    public boolean canMove(Board board, Cell start, Cell end) {
        // we can't move the piece to a box that has a piece of the same color
        if(end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }
        return true ;
    }
}
