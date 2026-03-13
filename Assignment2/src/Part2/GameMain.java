package Part2;

import Part1.*;
import Part1.Game;
import Part1.GameState;
import Part1.User;

import java.io.Console;
import java.util.Random;

public class GameMain {

    public static final Console console = System.console();
    public static final String NEW_LINE = System.getProperty("line.separator");
    public static final Random generator = new Random();

    /**
     * @param args command line parameters
     *
     */

    public static void main(String[] args) {

        User me= new User();
        User you = new User();

        Player[] players = new Player[2];

        players[0] = you;
        players[1] = me;

        Part1.Game game;
        int lines, columns, win;

        lines = Integer.parseInt(args[0]);
        columns = Integer.parseInt(args[1]);
        win = Integer.parseInt(args[2]);


        game = new Game(lines, columns,win);
        //game = new Game();

        int turn = 0;
        players[turn%2].startNewGame(BoxSymbol.O);
        players[(turn+1)%2].startNewGame(BoxSymbol.X);
        while(game.getGameState() == GameState.PLAYING) {
            players[turn%2].play(game);
            turn++;
        }


        System.out.println(game);
        System.out.println("Result: " + game.getGameState());

    }
}