package challenging_task_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.1415;
        System.out.println("Zadej poloměr kruhu (cm):");
        double polomer = Double.parseDouble(scanner.nextLine());
        double obvod = 2 * PI * polomer;
        double obsah = PI * polomer * polomer;
        System.out.println("Obvod zadaného kruhu je: " + obvod + " cm");
        System.out.println("Jeho obsah je: " + obsah + " cm^2");
    }
}
