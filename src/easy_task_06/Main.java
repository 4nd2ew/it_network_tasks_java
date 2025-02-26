package easy_task_06;

public class Main {
    public static void main(String[] args) {
        System.out.println("ASCII tabulka");
        System.out.println("=============");
        for(int i = 33; i < 256; i++){
            System.out.println(i + ":" + (char)i);
        }
    }
}
