package ifElse;
import java.util.Scanner;
import java.util.Random;
public class StonePaperSisorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 for stone
        // 1 for paper
        //2 for sisor

        System.out.println("select 0 for stone, select 1 for paper, select 2 for sisor");

        int i = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (i==0 && computerInput== 2 || i ==1 && computerInput==0 || i == 2 && computerInput==1){
            System.out.println("you win");
        }
        else if (i==0 && computerInput== 0 || i ==1 && computerInput==1 || i == 2 && computerInput==2){
            System.out.println("draw");
        }
        else{
            System.out.println("computer win\n better luck next time");
        }

        if (computerInput==0){
            System.out.println("computerInput : stone");
        }
        else if (computerInput==1){
            System.out.println("computerInput : paper");
        }
        else if (computerInput==2){
            System.out.println("computerInput : sisor");
        }




    }
}
