package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {

    static final String DESCRIPTION_GAME = "What number is missing in the progression?";
    static final int MIN_PROGRESSIIO_LENGTH = 5;
    static final int MIN_ELEMENT_SIZE = 2;
    static final int MAX_SIZE_ELEMENT_INCREMENT = 4;
    static final int MAX_DELTA_PROGRESSION_LENGTH = 7;

    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int[] progressionArray = getProgression();
            int hiddenElement = Utils.getRandom(progressionArray.length);
            questions[i] = "";
            for (int j = 0; j < progressionArray.length; j++) {
                if (j != hiddenElement) {
                    questions[i] += (progressionArray[j] + " ");
                } else {
                    questions[i] += ".. ";
                }
            }
            answers[i] = String.valueOf(progressionArray[hiddenElement]);
        }
        Engine.playGame(new String[][] {questions, answers}, DESCRIPTION_GAME);
    }

    public static int[] getProgression() {
        int progressionLength = Utils.getRandom(MAX_DELTA_PROGRESSION_LENGTH) + MIN_PROGRESSIIO_LENGTH;
        int firstElement = Utils.getRandom(MAX_SIZE_ELEMENT_INCREMENT) + MIN_ELEMENT_SIZE;
        int progressionStep = Utils.getRandom(MAX_SIZE_ELEMENT_INCREMENT) + MIN_ELEMENT_SIZE;
        int[] progressionArray = new int[progressionLength];
        for (int j = 0; j < progressionArray.length; j++) {
            progressionArray[j] = firstElement + progressionStep * j;
        }
        return progressionArray;
    }
}
