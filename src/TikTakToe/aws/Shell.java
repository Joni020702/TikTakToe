package TikTakToe.aws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shell {
    //TODO Add static attributes if needed.


    /**
     * Allows the player to play a Abalone game by commands.
     *
     * @param args Lines of user input.
     * @throws IOException when readUserInput(...) throws an IOException.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader stdin
                = new BufferedReader(new InputStreamReader(System.in));
        readUserInput(stdin);
    }

    private static void readUserInput(BufferedReader stdin) throws IOException {
        // A useful boolean to check when the player wants to quit.
        boolean quit = false;

        //TODO Implement the readUserInput method such that the player can play a game.
        // Here is a little example for a shell:
        /*
            When the program gets started the player first has to start a game.
            Use the following commands (the first letter suffices for the commands):
            PRINT           to print the current board.
            LEVEL l         set the level to l (default should be 2).
            HELP            to print a helpful text.
            MOVE x y        set your mark to field x y.
            NEW GAME        start a new game with the new level.
            SWITCH          to switch the starter.
            QUIT            to quit the game.
         */
        while(!quit) {
            if(true) { //TODO check when the player should (not) be able to type.
                System.out.print("tiktaktoe> ");
                // Read one line.
                String input = stdin.readLine();
                // No more input?
                if (input == null || input.isEmpty()) {
                    printErrorMsg("Please write a legal command.");
                    continue;
                }
                // Split input on white spaces.
                String[] tokens = input.trim().split("\\s+");
                if (tokens[0].isEmpty()) {
                    printErrorMsg("No legal command.");
                    continue;
                }
                // Handle user input.
                switch (tokens[0].toLowerCase().charAt(0)) {
                    case 'h':
                        System.out.println("This is a help message");
                        // Hint: Outsource the bodies of the switch cases into methods:
                        doSomething();
                        break;
                    case 's':
                        System.out.println("Starting player switched.");
                        break;
                    case 'q':
                        quit = true;
                        break;
                    default:
                        printErrorMsg("Unknown command.");
                }
            }
        }
    }

    private static void doSomething(){
        System.out.println("Hi :)");
    }

    private static void printErrorMsg(String error) {
        System.out.println("Error! " + error);
    }
}