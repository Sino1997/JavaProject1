package TASKS;

public class T9 {
    public static void main(String[] args) {
        //Write a java program to find the second largest number in the array?

        int num;
        int[] numbers = {99, 88, 77, 66, 55};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {

                    num = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = num;
                }
            }
        }
        System.out.println("The second largest number is " + numbers[numbers.length - 2]);
    }
}
