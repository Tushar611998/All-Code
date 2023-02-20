package HackerRank_Problems;
import java.util.Scanner;
public class PrintTockensInSeperateLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String [] tocken = s.trim().split("[!,?.*_'@\\ ]+");
//        for ( int i = 0;i<tocken.length;i++){
//            System.out.print(tocken[i]);
//        }

        if(tocken.length==0 ){
            System.out.println("0");
            return;
        }
        if(tocken[0].trim().length() ==0){
            System.out.println("0");
            return;
        }
        System.out.println(tocken.length);
        for(int i =0;i<tocken.length;i++){
            System.out.println(tocken[i]);
        }
    }

}
