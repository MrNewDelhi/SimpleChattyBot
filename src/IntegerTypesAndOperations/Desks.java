package IntegerTypesAndOperations;

import java.util.Scanner;

public class Desks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int requiredFirst = (first + 1) / 2;
        int requiredSecond = (second + 1) / 2;
        int requiredThird = (third + 1) / 2;

        int required = requiredFirst + requiredThird + requiredSecond;

        System.out.println(required);
    }
}
