package IntegerTypesAndOperations;

import java.util.Scanner;

public class GoodRestOnVacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int durationOfDays = sc.nextInt();
        int foodCostPerDay = sc.nextInt();
        int oneWayFlight = sc.nextInt();
        int costOfOneNight = sc.nextInt();

        int finalCost = (durationOfDays-1) * costOfOneNight;
        finalCost = finalCost + (foodCostPerDay * (durationOfDays));
        finalCost = finalCost + (2 * oneWayFlight);

        System.out.println(finalCost);
    }
}
