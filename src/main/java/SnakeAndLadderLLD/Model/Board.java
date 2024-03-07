package SnakeAndLadderLLD.Model;

import lombok.Getter;

import java.util.concurrent.ThreadLocalRandom;

@Getter
public class Board {
    int size ;
    Cell [][] board ;

    public Board(int size, int numberOfSnakes, int numberOfLadders) {
        this.size = size;
        this.board = new Cell[size][size];
        initializeCells(size);
        addSnakesLadders(board, numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int size) {

        board = new Cell[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                Cell cellObj = new Cell();
                board[i][j] = cellObj;
            }
        }
    }
    private void addSnakesLadders(Cell[][] board, int numberOfSnakes, int numberOfLadders){

        while(numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1,board.length*board.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,board.length*board.length-1);
            if(snakeTail >= snakeHead) {
                continue;
            }
            Jump snakeObj = new Jump(snakeHead, snakeTail) ;
            Cell cell = getCell(snakeHead);
            cell.setJump(snakeObj) ;
            numberOfSnakes--;
        }

        while(numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,board.length*board.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,board.length*board.length-1);
            if(ladderStart >= ladderEnd) {
                continue;
            }

            Jump ladderObj = new Jump(ladderStart, ladderEnd) ;
            Cell cell = getCell(ladderStart);
            cell.setJump(ladderObj);
            numberOfLadders--;
        }
    }

    public Cell getCell(int playerPosition) {
        int boardRow = playerPosition / board.length;
        int boardColumn = (playerPosition % board.length);
        return board[boardRow][boardColumn];
    }

}
