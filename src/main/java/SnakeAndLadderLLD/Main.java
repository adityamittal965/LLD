package SnakeAndLadderLLD;

    /*
    Follow Top-Down Approach, A 'Player' will roll a 'Die' and get a 'Cell' as its new position on the 'Board'.
    At that new position, he may or may not take a 'Jump' based on whether that 'Cell' has a snake or ladder or not.
    The 'SnakeAndLadderGame' continues till one of the 'Player' crosses the end position.
    */

public class Main {

    public static void main(String[] args) {
        int size = 10, numberOfSnakes = 5, numberOfLadders = 4 ;
        SnakeAndLadderGame snakeAndLadderGame = new SnakeAndLadderGame(size, numberOfSnakes, numberOfLadders) ;
        snakeAndLadderGame.startGame();
    }
}
