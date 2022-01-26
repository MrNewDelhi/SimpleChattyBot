package IntegerTypesAndOperations;

import java.util.Scanner;

public class DifferenceOfTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour1 = sc.nextInt();
        int min1 = sc.nextInt();
        int sec1 = sc.nextInt();

        int hour2 = sc.nextInt();
        int min2 = sc.nextInt();
        int sec2 = sc.nextInt();

        int hourToMin1 = hour1 * 60 + min1;
        int hourToMin2 = hour2 * 60 + min2;

        int minToSec1 = hourToMin1 * 60 + sec1;
        int minToSec2 = hourToMin2 * 60 + sec2;

        int diff = minToSec2 - minToSec1;
        System.out.println(diff);
    }
}
