package demo.avinal.gha;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(greetings(name));
        System.out.println(reversal(name));
    }

    public static String greetings(String name) {
        return "Hello I am " + name;
    }

    public static String reversal(String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
