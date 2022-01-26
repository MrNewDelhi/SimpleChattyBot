package IntegerTypesAndOperations;

// TODO : h-b-1 / a-b + 1

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int up = sc.nextInt();
        int down = sc.nextInt();

        int steps = 1 + ((height - up) / (up-down));
        if(((height - up) % (up - down)) > 0) {
            System.out.println(steps + 1);
        }else {
            System.out.println(steps);
        }
    }
}
