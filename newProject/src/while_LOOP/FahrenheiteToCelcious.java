package while_LOOP;
import java.util.Scanner;
public class FahrenheiteToCelcious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        int C =0;

        while (S<=E){
            C = ((S-32)*5)/9;
            System.out.println(S+" "+C);

            S=S+W;
            }

        }
    }


