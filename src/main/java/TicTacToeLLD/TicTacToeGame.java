package TicTacToeLLD;

import TicTacToeLLD.Model.*;
import lombok.Getter;

import java.util.*;

@Getter
public class TicTacToeGame {
    Deque<Player> players ;
    Board gameBoard ;

    Player winner ;

    TicTacToeGame(){
        this.initializeGame(3);
    }
    TicTacToeGame(int size){
        this.initializeGame(size) ;
    }

    private void initializeGame(int size){

        // Initializing Deque of Players
        players = new LinkedList<>() ;
        PlayingPieceX crossPiece = new PlayingPieceX() ;
        Player player1 = new Player("player1", crossPiece) ;
        PlayingPiece noughtsPiece = new PlayingPieceO() ;
        Player player2 = new Player("player2", noughtsPiece) ;
        players.add(player1) ;
        players.add(player2) ;

        // Initializing Board
        gameBoard = new Board(size) ;
    }

    public void startGame(){
        boolean noWinner = true ;
        while(noWinner){
            // take out the player whose turn is and also put the player in the list back
            Player currPlayer = players.pollFirst() ;

            gameBoard.printBoard();

            // get free cells
            List<Map.Entry<Integer, Integer>> freeCells = gameBoard.getFreeCells() ;

            if(freeCells.isEmpty()){
                noWinner = false ;
                continue ;
            }

            // read the user input
            System.out.print("Player:" + currPlayer.getName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // place the piece

            // If chosen position is filled, currPlayer has to choose another position
            if(!gameBoard.addPiece(inputRow, inputColumn, currPlayer.getPlayingPiece())){
                System.out.println("Invalid Position, choose another position");
                players.addFirst(currPlayer) ;
                continue ;
            }

            players.offerLast(currPlayer);

            if(isThereWinner(inputRow, inputColumn, currPlayer.getPlayingPiece().getPieceType())) {
                this.winner = currPlayer ;
                break ;
            }
        }
        if(winner != null)
            System.out.println("WINNER IS: " + winner.getName()) ;
        else
            System.out.println("IT IS A TIE") ;
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType){
        boolean rowCheck = true ;
        boolean columnCheck = true ;
        boolean majorDiagonalCheck = true ;
        boolean minorDiagonalCheck = true ;

        int size = gameBoard.getSize() ;

        for(int j = 0; j < size; j++){
            if(gameBoard.getBoard()[row][j] == null || gameBoard.getBoard()[row][j].getPieceType() != pieceType)
                rowCheck = false ;
        }

        for(int i = 0; i < size; i++){
            if(gameBoard.getBoard()[i][column] == null || gameBoard.getBoard()[i][column].getPieceType() != pieceType)
                columnCheck = false ;
        }


        for(int i = 0; i < size; i++){
            if(gameBoard.getBoard()[i][i] == null || gameBoard.getBoard()[i][i].getPieceType() != pieceType)
                majorDiagonalCheck = false ;
        }

        for(int i = 0; i < size; i++){
            if(gameBoard.getBoard()[i][size-1-i] == null || gameBoard.getBoard()[i][size-1-i].getPieceType() != pieceType)
                minorDiagonalCheck = false ;
        }

        return rowCheck || columnCheck || majorDiagonalCheck || minorDiagonalCheck ;

    }
}
