package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Diariodelasislas.");
        System.out.println("I was created in 2023.");
        System.out.println("Please, remind me your name.");

        // reading a name
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
}