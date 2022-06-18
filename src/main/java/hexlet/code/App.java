package hexlet.code;

import hexlet.code.games.CalcGames;
import hexlet.code.games.ParityTestGame;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;
public class App {
    public static final int MAXNUMBER = 100;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        String select = in.nextLine();
        switch (select) {
            case "1" -> Cli.cli();
            case "2" -> ParityTestGame.parityTestGame();
            case "3" -> CalcGames.calcGame();
            case "4" -> Gcd.gcd();
            case "5" -> Progression.progression();
            case "6" -> Prime.prime();
            default -> {
            }
        }
    }
}
