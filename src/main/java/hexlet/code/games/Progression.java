package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void progression() {
        String descriptionGame = "What number is missing in the progression?";
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        final int minProgressionLength = 5;
        int minElementSize = 2;
        final int maxSizeElementIncrement = 4;
        final int maxDeltaProgressionLength = 7;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int progressionLength = (int) (Math.random() * maxDeltaProgressionLength) + minProgressionLength;
            int firstElement = (int) (Math.random() * maxSizeElementIncrement) + minElementSize;
            int progressionStep = (int) (Math.random() * maxSizeElementIncrement) + minElementSize;
            int[] progressionArray = new int[progressionLength];
            int hiddenElement = (int) (Math.random() * progressionLength);
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
