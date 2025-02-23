package challenging_task_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej řetězec:");
        String text = scanner.nextLine();
        text = text.toLowerCase();
        System.out.println(text.contains("itnetwork"));
    }
}
