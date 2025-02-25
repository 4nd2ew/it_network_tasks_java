package easy_task_05;

public class Main {
    public static void main(String[] args) {
        int[] pole = new int[10];

        for(int i = 0; i < pole.length; i++)
            pole[i] = pole.length - i;
        for(int prvek: pole)
            System.out.println(prvek);
    }
}
