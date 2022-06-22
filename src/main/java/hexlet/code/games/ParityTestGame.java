package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ParityTestGame {

    static final String DESCRIPTION_GAME = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num = Utils.getRandom(Engine.MAXNUMBER);
            questions[i] = String.valueOf(num);
            answers[i] = num % 2 == 0 ? "yes" : "no";
        }
        Engine.playGame(new String[][] {questions, answers}, DESCRIPTION_GAME);
    }

}
