package challenging_task_05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double med = 0;

        System.out.println("Zadej počet čísel:");
        int count = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[count];

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Zadej " + (i + 1) + ". číslo:");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        int numbersCopy[] = Arrays.copyOfRange(numbers, 0, numbers.length);
        Arrays.sort(numbersCopy);
        med = numbersCopy[numbersCopy.length/2];

        for(int number: numbers){
            System.out.println(number + " se od mediánu odchyluje o " + (number - med));
        }

    }
}
