package IntegerTypesAndOperations;

import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();

        int digit = original % 10;
        int reverse = digit;
        original = original / 10;

        digit = original % 10;
        reverse = reverse * 10 + digit;
        original = original / 10;

        digit = original % 10;
        reverse = reverse * 10 + digit;
        original = original / 10;

        System.out.println(reverse);
    }
}
