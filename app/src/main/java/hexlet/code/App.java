package hexlet.code;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        int select = in.nextInt();
        switch (select) {
            case 1:
                Cli.cli();
                break;
            case 2:
                App.parityTestGame();
                break;
            case 3:
                App.calcGame();
                break;
            case 4:
                App.GCD();
                break;
            case 5:
                App.progression();
        }
    }

    public static void parityTestGame() {
        String descriptionGame = "Answer 'yes' if number even otherwise answer 'no'.";
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i=0; i < Engine.ROUNDS; i++) {
            int num = (int)(Math.random() * 100);
            questions[i] = String.valueOf(num);
            answers[i] = num % 2 == 0 ? "yes" : "no";
        }
        Engine.playGame(new String[][] {questions, answers}, descriptionGame);
    }

    public static void calcGame() {
        String descriptionGame = "What is the result of the expression?";
        char[] operators = {'+', '-', '*'};
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int a = (int)(Math.random() * 100);
            int b = (int)(Math.random() * 100);
            char ch = operators[(int)(Math.random() * 3)];
            int result = 0;
            switch (ch) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
            }
            questions[i] = a + " " + ch + " " + b + " ";
            answers[i] = String.valueOf(result);
        }
        Engine.playGame(new String[][] {questions, answers}, descriptionGame);
    }

    public static void GCD() {
        String descriptionGame = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int a = (int)(Math.random() * 100);
            int b = (int)(Math.random() * 100);
            int result = 1;
            for (int j = 2; j <= Math.min(a, b); j++) {
                if (a % j == 0 && b % j == 0) {
                    result = j;
                }
            }
            questions[i] = a + " " + b;
            answers[i] = String.valueOf(result);
        }
        Engine.playGame(new String[][] {questions, answers}, descriptionGame);
    }

    public static void progression() {
        String descriptionGame = "What number is missing in the progression?";
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int progressionLength = (int)(Math.random() * 7) + 5;
            int firstElement = (int)(Math.random() * 8) + 2;
            int progressionStep = (int)(Math.random() * 4) + 2;
            int[] progressionArray = new int[progressionLength];
            int hiddenElement = (int)(Math.random() * progressionLength);
            questions[i] = "";
            for (int j = 0; j < progressionArray.length; j++) {
                progressionArray[j] = firstElement + progressionStep * j;
                if (j != hiddenElement) {
                    questions[i] += (progressionArray[j] + " ");
                } else {
                    questions[i] += ".. ";
                }
            }
            answers[i] = String.valueOf(progressionArray[hiddenElement]);
        }
        Engine.playGame(new String[][] {questions, answers}, descriptionGame);
    }

}
