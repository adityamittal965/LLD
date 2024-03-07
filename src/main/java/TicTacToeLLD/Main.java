package TicTacToeLLD;

public class Main {
    /*
        To add Lombok, add in build.grade:
            compileOnly 'org.projectlombok:lombok'
            annotationProcessor 'org.projectlombok:lombok'
    */

    /*
    Follow Top-Down Approach, A 'Player' will select a (row, col) from 'Board' of 'PlayingPiece' of type
    'PlayingPieceX' or 'PlayingPieceO'. If he wins, end the game, if all 'PlayingPiece' get filled, 'TicTacToeGame' is drawn
    and it ends otherwise the second player takes the chance and this repeats till the 'TicTacToeGame' ends.
    */

    public static void main(String args[]){
        int size = 3 ;
        TicTacToeGame ticTacToeGame = new TicTacToeGame(size) ;
        ticTacToeGame.startGame() ;
    }

}
