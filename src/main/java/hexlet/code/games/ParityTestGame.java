package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.App;

public class ParityTestGame {
    public static void parityTestGame() {
        String descriptionGame = "Answer 'yes' if number even otherwise answer 'no'.";
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num = (int) (Math.random() * App.MAXNUMBER);
            questions[i] = String.valueOf(num);
            answers[i] = num % 2 == 0 ? "yes" : "no";
        }
        Engine.playGame(new String[][] {questions, answers}, descriptionGame);
    }

}
