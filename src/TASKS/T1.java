package TASKS;

public class T1 {
    public static void main(String[] args) {
         /*
         Create a program that uses an array to store a list of temperatures for a week,
         and then uses a loop to find the highest and lowest temperature for the week.
         */
        int [] temp= {11, 22, -33, 44, 55, 66,77};
        int highTemp = temp[0];
        int lowTemp = temp[0];

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > highTemp) {
                highTemp = temp[i];
            }
            if (temp[i] < lowTemp) {
                lowTemp = temp[i];
            }
        }
        System.out.println("The highest temperature for the week is " + highTemp + "°C");
        System.out.println("The lowest temperature for the week is " + lowTemp + "°C");
    }
}

