package challenging_task_04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kombinace hodů dvěma šestistěnnými kostkami:");
        for(int i = 1; i < 7; i++){
            for(int j = 1; j < 7; j++){
                System.out.printf("(%d, %d) ", i, j);
            }
        }
    }
}
