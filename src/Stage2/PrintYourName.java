package Stage2;

import java.util.Scanner;

public class PrintYourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = sc.next();

        System.out.println("What a great name you have, " + name + "!");
    }
}
