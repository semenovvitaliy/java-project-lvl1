package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.App;

public class Gcd {
    public static void gcd() {
        String descriptionGame = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int a = (int) (Math.random() * App.MAXNUMBER);
            int b = (int) (Math.random() * App.MAXNUMBER);
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
}
