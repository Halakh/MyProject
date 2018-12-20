package week6ex6;

import java.util.Optional;

public interface Player {
        Optional<Move> chooseMove();
        Boolean playAgain();


}
