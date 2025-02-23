package advanced_task_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadejte delší slovo:");
        String firstWord = scanner.nextLine();

        System.out.println("Zadejte kratší slovo:");
        String secondWord = scanner.nextLine();

        firstWord = firstWord.trim();
        secondWord = secondWord.trim();

        int delka = firstWord.length() - secondWord.length();
        System.out.printf("Slova se liší délkou o %d znaků", delka);
    }
}
