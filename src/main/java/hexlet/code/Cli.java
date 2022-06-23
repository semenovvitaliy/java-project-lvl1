package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String str = in.nextLine();
        System.out.println("Hello, " + str + "!");
        in.close();
    }
}
