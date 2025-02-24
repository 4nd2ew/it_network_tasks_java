package advanced_task_04;

public class Main {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--){
            if(i > 4){
                System.out.println(i + " zelených láhví stojí na stole a jedna láhev spadne");
            }
            else if (i > 1){
                System.out.println(i + " zelené láhve stojí na stole a jedna láhev spadne");
            }
            else{
                System.out.println(i + " zelená láhev stojí na stole a jedna láhev spadne");
            }
        }
    }
}
