package easy_task_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kolik ryb si dáš k večeři?");
        int pocet = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < pocet; i++){
            System.out.println("<° )))-<");
        }
    }
}
