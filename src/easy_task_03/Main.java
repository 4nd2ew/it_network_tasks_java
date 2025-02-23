package easy_task_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadej své jméno:");
        String name = scanner.nextLine();

        if(name.length() < 3 || name.length() > 10){
            System.out.println("Máš moc krátké nebo moc dlouhé jméno!");
        }
        else{
            System.out.println("Normální jméno.");
        }
    }
}
