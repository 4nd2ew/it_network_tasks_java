package easy_task_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej jméno:");
        String name = scanner.nextLine();

        System.out.println("Zadej příjmení:");
        String surname = scanner.nextLine();

        System.out.println("Zadej svůj věk:");
        int age = Integer.parseInt(scanner.nextLine());

        String fullName = name + " " + surname;
        System.out.println(fullName.toUpperCase());
        System.out.printf("Za rok ti bude %d let.", age + 1);
    }
}
