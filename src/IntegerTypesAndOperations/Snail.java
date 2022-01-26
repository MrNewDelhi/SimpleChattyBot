package IntegerTypesAndOperations;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int up = sc.nextInt();
        int down = sc.nextInt();

        int steps = 1 + ((height - up) / (up-down)) + ((height - up) % (up - down));
        System.out.println(steps);
    }
}
