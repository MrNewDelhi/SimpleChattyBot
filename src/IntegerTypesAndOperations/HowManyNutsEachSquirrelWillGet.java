package IntegerTypesAndOperations;

import java.util.Scanner;

public class HowManyNutsEachSquirrelWillGet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfSquirrels = sc.nextInt();
        int numberOfNuts = sc.nextInt();
        int distribution = numberOfNuts / numberOfSquirrels;
        System.out.println(distribution);
    }
}
