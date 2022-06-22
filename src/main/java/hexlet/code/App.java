package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.ParityTestGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;
public class App {
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
            case "1" -> Cli.letsMeet();
            case "2" -> ParityTestGame.start();
            case "3" -> CalcGame.start();
            case "4" -> GcdGame.start();
            case "5" -> ProgressionGame.start();
            case "6" -> PrimeGame.start();
            case "0" -> System.out.println("Goodbay!");
            default -> System.out.println("Incorrect command");
        }
        in.close();
    }
}
