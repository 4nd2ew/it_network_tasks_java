package advanced_task_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej číslo k umocnění:");
        int cislo = Integer.parseInt(scanner.nextLine());
        System.out.println("Výsledek: " + (cislo * cislo));
    }
}
