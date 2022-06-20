package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class CalcGames {
    public static void calcGame() {
        String descriptionGame = "What is the result of the expression?";
        char[] operators = {'+', '-', '*'};
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int a = (int) (Math.random() * App.MAXNUMBER);
            int b = (int) (Math.random() * App.MAXNUMBER);
            char ch = operators[(int) (Math.random() * operators.length)];
            int result = 0;
            switch (ch) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                default:
                    break;
            }
            questions[i] = a + " " + ch + " " + b + " ";
            answers[i] = String.valueOf(result);
        }
        Engine.playGame(new String[][] {questions, answers}, descriptionGame);
    }
}
