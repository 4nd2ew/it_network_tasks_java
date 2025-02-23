package simple_task_01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ahoj, jak se jmenuješ?");
        String jmeno = scanner.nextLine();
        System.out.println("Jaký jsi?");
        String vlastnost = scanner.nextLine();
        System.out.println(jmeno + " je " + vlastnost);
    }
}
