package advanced_task_05;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] zelenina = {"zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice"};
        Arrays.sort(zelenina);
        String[] ovoce = {"jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina"};
        Arrays.sort(ovoce);
        int pruchodu = 1;
        String odpoved;

        while(true){
            System.out.println("Zadej název libovolného ovoce nebo zeleniny:");
            odpoved = scanner.nextLine().toLowerCase().trim();
            if((Arrays.binarySearch(ovoce, odpoved)) >= 0)
                System.out.println("Zadal jsi ovoce");

            else if((Arrays.binarySearch(zelenina, odpoved)) >= 0)
                System.out.println("Zadal jsi zeleninu");

            else
                System.out.println("Tvoje slovo nemám v seznamu");

            System.out.println("Přeješ si zadat další slovo? (ano/ne)");
            if(scanner.nextLine().toLowerCase().trim().equals("ne")){
                System.out.println("Zadal jsi " + pruchodu + " slov");
                break;
            }

            else{
                pruchodu++;
            }
        }
    }
}
