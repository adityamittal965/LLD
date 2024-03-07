package SnakeAndLadderLLD.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cell {
    Jump jump ;

    Cell(){

    }
    Cell(Jump jump){
        this.jump = jump ;
    }
}
