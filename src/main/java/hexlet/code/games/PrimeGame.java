package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {

    static final String DESCRIPTION_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.getRandom(Engine.MAXNUMBER);
            boolean isPrime = checkPrime(number);
            questions[i] = String.valueOf(number);
            answers[i] = isPrime ? "yes" : "no";
        }
        Engine.playGame(new String[][] {questions, answers}, DESCRIPTION_GAME);
    }
    public static boolean checkPrime(int number) {
        for (int j = 2; j < number / 2; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
