package TASKS;

public class T10 {
    public static void main(String[] args) {
        // Write a program to print out duplicate elements from an Array of Strings?
        String[] names = {"Maria", "Sherif", "Katerina", "Justyna", "Maria", "Sino", "Savera"};

        for (int i = 0; i < names.length; i++) {

            String array = names[i];

            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("The duplicate element is: " + names[j]);
                }
            }
        }
    }
}