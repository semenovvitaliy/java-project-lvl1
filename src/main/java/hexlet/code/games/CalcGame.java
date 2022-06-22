package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {

    static final char[] OPERATORS = {'+', '-', '*'};
    static final String DESCRIPTION_GAME = "What is the result of the expression?";
    public static void start() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int a = Utils.getRandom(Engine.MAXNUMBER);
            int b = Utils.getRandom(Engine.MAXNUMBER);
            char ch = OPERATORS[Utils.getRandom(OPERATORS.length)];
            int result = calculate(a, b, ch);
            questions[i] = a + " " + ch + " " + b + " ";
            answers[i] = String.valueOf(result);
        }
        Engine.playGame(new String[][] {questions, answers}, DESCRIPTION_GAME);
    }

    public static int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            default -> System.out.println("Incorrect operand.");
        }
        return 0;
    }
}
