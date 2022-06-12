package hexlet.code;

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        App.cli();
    }

    public static void cli() {
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String str = in.nextLine();
        System.out.println("Hello, " + str + "!");
    }
}
