package TASKS;

public class T7 {
    public static void main(String[] args) {
// Write a Java Program to print the first 10 numbers of Fibonacci series.
        int a=0;
        int b=1;

        for (int i = 0; i <=4; i++) {
            System.out.print(a+" ");
            System.out.print(b+" ");

            a=a+b;
            b=a+b;

        }
    }
}
