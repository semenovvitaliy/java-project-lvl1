package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {

    static final String DESCRIPTION_GAME = "What number is missing in the progression?";
    static final int MIN_PROGRESSIIO_LENGTH = 5;
    static final int MIN_ELEMENT_SIZE = 2;
    static final int MAX_SIZE_ELEMENT_INCREMENT = 6;
    static final int MAX_PROGRESSION_LENGTH = 12;

    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int progressionLength = Utils.getRandom(MIN_PROGRESSIIO_LENGTH, MAX_PROGRESSION_LENGTH);
            int firstElement = Utils.getRandom(MIN_ELEMENT_SIZE, MAX_SIZE_ELEMENT_INCREMENT);
            int progressionStep = Utils.getRandom(MIN_ELEMENT_SIZE, MAX_SIZE_ELEMENT_INCREMENT);
            int[] progressionArray = getProgression(firstElement, progressionStep, progressionLength);
            int hiddenElement = Utils.getRandom(0, progressionArray.length);
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

    public static int[] getProgression(int firstElement, int progressionStep, int progressionLength) {
        int[] progressionArray = new int[progressionLength];
        for (int j = 0; j < progressionArray.length; j++) {
            progressionArray[j] = firstElement + progressionStep * j;
        }
        return progressionArray;
    }
}
