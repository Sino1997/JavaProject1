package TASKS;

public class T8 {
    public static void main(String[] args) {
        // Maximum and minimum number in the array?
        int[][] numbers = {
                {11, 11, 22, 33, 44},
                {22, 22, 33, 44, 44},
                {33, 71, 69, 81, 13}
        };

        int max = numbers[0][0];
        int min = numbers[0][0];

        for (int[] a : numbers) {
            for (int i : a) {
                if (i > max) {
                    max = i;
                }
                else if (i < min) {
                    min = i;
                }
            }
        }
        System.out.println("The maximum number is " + max + " and the minimum number is " + min);
    }
}
