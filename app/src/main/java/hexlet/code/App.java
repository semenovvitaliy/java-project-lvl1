package hexlet.code;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
public class App {

    public static void main(String[] args) {
        int num;
        String playerName;
        do {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Parity game");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            switch (num) {
                case 1:
                    playerName = App.cli();
                    break;
                case 2:
                    App.parityTestGame();
                    break;
            }
        } while (num != 0);
    }

    public static String cli() {
        System.out.println("Welcome to the Brain Games!");
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String str = in.nextLine();
        System.out.println("Hello, " + str + "!");
        return str;
    }

    public static void parityTestGame() {
        String playerName = App.cli();
        int attempt = 1;
        boolean userNotLose = true;
        Scanner in = new Scanner(System.in);
        String userAnswer = "";
        Date date = new Date();
        int num = (int)date.getTime() % 100;
        do {
            num = num * 1247 % 98 + 1;
            System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
            System.out.println("Question: " + num);
            System.out.print("Your answer: ");
            userAnswer = in.nextLine();
            if ((userAnswer.toLowerCase().equals("yes") && num % 2 == 0) || (userAnswer.toLowerCase().equals("no") && num % 2 == 1)) {
                attempt++;
                System.out.println("Correct!");
            } else {
                userNotLose = false;
                System.out.print("'" + userAnswer + "' is wrong answer ;(. Correct answer was '");
                if (num % 2 == 0) {
                    System.out.println("yes'");
                } else {
                    System.out.println("no'");
                }
                System.out.println("Let's try again," + playerName + "!");
            }
        } while (attempt <= 3 && userNotLose);
        if (userNotLose) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
}
