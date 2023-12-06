package TASKS;

public class T2 {
    public static void main(String[] args) {
          /*
        Create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array.
         */

        int numbers []= {11, 22, 33, 44};
        int sum=0;
        for (int a:numbers){
            sum+=a;
        }
        System.out.println(sum);
    }
}
