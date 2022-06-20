package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void playGame(String[][] questionsAndAnswers, String descriptionGame) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner in = new Scanner(System.in);
        String playerName = in.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(descriptionGame);

        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + questionsAndAnswers[0][i]);
            System.out.print("Your answer: ");
            String playerAnswer = in.nextLine();
            if (playerAnswer.equals(questionsAndAnswers[1][i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[1][i] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
}
