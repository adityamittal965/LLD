package SnakeAndLadderLLD.Model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Jump {
    int start ;
    int end ;

    Jump(){

    }
    Jump(int start, int end){
        this.start = start ;
        this.end = end ;
    }

}
