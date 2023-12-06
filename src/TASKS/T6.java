package TASKS;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        // Write a java program to check whether a given number is prime or not?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = scanner.nextInt();

        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && num != i) {
                System.out.println(num + " is not a Prime number");
                break;

            } else if (i == num) {
                System.out.println(num + " is a Prime number");
            }
        }
    }
}
