package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.App;

public class Prime {
    public static void prime() {
        String descriptionGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = (int) (Math.random() * App.MAXNUMBER);
            boolean isPrime = true;
            for (int j = 2; j < number / 2; j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            questions[i] = String.valueOf(number);
            answers[i] = isPrime ? "yes" : "no";
        }
        Engine.playGame(new String[][] {questions, answers}, descriptionGame);
    }
}
