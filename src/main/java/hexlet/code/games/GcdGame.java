package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GcdGame {

    static final String DESCRIPTION_GAME = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int a = Utils.getRandom(1, Engine.MAXNUMBER);
            int b = Utils.getRandom(1, Engine.MAXNUMBER);
            int result = getGcd(a, b);
            questions[i] = a + " " + b;
            answers[i] = String.valueOf(result);
        }
        Engine.playGame(new String[][] {questions, answers}, DESCRIPTION_GAME);
    }

    public static int getGcd(int a, int b) {
        int result = 1;
        for (int j = 2; j <= Math.min(a, b); j++) {
            if (a % j == 0 && b % j == 0) {
                result = j;
            }
        }
        return result;
    }
}
