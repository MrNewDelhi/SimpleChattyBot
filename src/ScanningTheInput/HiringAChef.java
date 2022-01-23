package ScanningTheInput;

import java.util.Scanner;

public class HiringAChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int num = sc.nextInt();
        String str2 = sc.next();

        System.out.println("The form for " + str1 + " is completed. We will contact you if we need a chef who cooks " + str2 + " dishes and has " + num + " years of experience.");
    }
}
