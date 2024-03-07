package SnakeAndLadderLLD;

import SnakeAndLadderLLD.Model.Board;
import SnakeAndLadderLLD.Model.Cell;
import SnakeAndLadderLLD.Model.Dice;
import SnakeAndLadderLLD.Model.Player;

import java.util.Deque;
import java.util.LinkedList;

public class SnakeAndLadderGame {
    Deque<Player> players ;
    Board gameBoard ;

    Player winner ;

    Dice dice ;

    SnakeAndLadderGame(int size, int numberOfSnakes, int numberOfLadders){
        this.initialize(size, numberOfSnakes, numberOfLadders, 1) ;
    }
    SnakeAndLadderGame(int size, int numberOfSnakes, int numberOfLadders, int diceCount){
        this.initialize(size, numberOfSnakes, numberOfLadders, diceCount) ;
    }

    private void initialize(int size, int numberOfSnakes, int numberOfLadders, int diceCount){
        gameBoard = new Board(size, numberOfSnakes, numberOfLadders);
        dice = new Dice(diceCount);
        winner = null;
        players = new LinkedList<>() ;
        Player player1 = new Player("player1", 0) ;
        Player player2 = new Player("player2", 0) ;
        players.add(player1) ;
        players.add(player2) ;
    }

    public void startGame(){

        while(winner == null) {

            //check whose turn now
            Player player = players.pollFirst();
            players.offerLast(player);
            System.out.println("player turn is: " + player.getId() + " current position is: " + player.getCurrPosition());

            //roll the dice
            int diceNumbers = dice.rollDice();

            //get the new position
            int playerNewPosition = player.getCurrPosition() + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            player.setCurrPosition(playerNewPosition); ;

            System.out.println("player turn is: " + player.getId() + " new Position is: " + playerNewPosition);
            //check for winning condition
            if(playerNewPosition >= gameBoard.getBoard().length * gameBoard.getBoard().length-1){
                winner = player;
            }
        }

        System.out.println("WINNER IS: " + winner.getId());
    }



    // return the position of player based on whether there is snake or ladder at given position
    private int jumpCheck (int playerNewPosition) {

        if(playerNewPosition > gameBoard.getBoard().length * gameBoard.getBoard().length-1 ){
            return playerNewPosition;
        }

        Cell cell = gameBoard.getCell(playerNewPosition);
        if(cell.getJump() != null && cell.getJump().getStart() == playerNewPosition) {
            String jumpBy = (cell.getJump().getStart() < cell.getJump().getEnd())? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.getJump().getEnd();
        }
        return playerNewPosition;
    }


}
