package challenging_task_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadejte postupně koeficienty a,b,c kvadratické rovnice ax^2+bx+c=0 :");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double d = (b * b) - (4 * a * c);

        double x1 = ((-b + Math.sqrt(d)) / (2 * a));
        double x2 = ((-b - Math.sqrt(d)) / (2 * a));

        if(a == 0){
            System.out.println("Není kvadratická rovnice");
        }
        else if(d > 0){
            System.out.println("Rovnice má 2 reálné kořeny x1 = " + x1 + ", x2 = " + x2);
        }
        else if (d == 0) {
            System.out.println("Rovnice má jeden kořen x = " + x2);
        }
        else{
            System.out.println("Neexistuje řešení v oblasti reálných čísel");
        }
    }
}
