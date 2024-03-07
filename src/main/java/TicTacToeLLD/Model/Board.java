package TicTacToeLLD.Model;

import lombok.Getter;

import java.util.*;


@Getter
public class Board {
    int size ;
    PlayingPiece[][] board ;

    public Board(int size){
        this.size = size ;
        this.board = new PlayingPiece[size][size] ;
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece){
        if(board[row][column] != null)
            return false ;
        board[row][column] = playingPiece ;
        return true ;
    }

    public List<Map.Entry <Integer, Integer>> getFreeCells(){
        List <Map.Entry <Integer, Integer>> freeCells = new ArrayList<>() ;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == null) {
                    Map.Entry <Integer, Integer> freeCell = new AbstractMap.SimpleEntry<>(i, j) ;
                    freeCells.add(freeCell) ;
                }
            }
        }
        return freeCells ;
    }

    public void printBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == null)
                    System.out.print(" ") ;
                else
                    System.out.print(board[i][j].pieceType.name()) ;  // name() returns the name of the enum constant as String
                System.out.print(" | ") ;
            }
            System.out.println() ;
        }
    }

}
