package TASKS;

public class T4 {
    public static void main(String[] args) {
           /*
        Create a 2D array of integers. Develop a program which will
        calculate the sum of even and odd numbers for that array.
         */
        int[][] numbers = {
                {11, 22, 33, 44, 55},
                {66, 77, 88, 99, 97},
                {67, 78, 89, 98, 96}
        };

        int sum = 0;

        for (int row = 0; row < numbers.length; row++) {

            for (int col = 0; col < numbers[row].length; col++) {
                sum = sum + numbers[row][col];
            }
        }
        System.out.println(sum);
    }
}
