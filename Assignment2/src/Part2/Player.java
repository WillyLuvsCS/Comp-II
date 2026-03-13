package Part2;

import Part2.BoxSymbol;
import Part2.Game;

public abstract class Player {

    protected Part2.BoxSymbol mySymbol;

    public abstract void play(Game game);

    public void startNewGame(BoxSymbol mySymbol){
        this.mySymbol = mySymbol;
    }

}
