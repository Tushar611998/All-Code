package while_LOOP;
import java.util.Scanner;

public class WhichDataTypeItIs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Noofiterations = sc.nextInt();
        long iteration1 = sc.nextLong();
        long iteration2 = sc.nextLong();
        long iteration3 = sc.nextLong();
        long iteration4 = sc.nextLong();
        long iteration5 = sc.nextLong();
        int i = 1;
        if (-128 <= iteration1 && iteration1 <= 127) {
            System.out.println("* byte");
        }
        else if (-32768<=iteration1 && iteration1<=32767){
            System.out.println("* short");
        }
        else if ((-2^31)<=iteration1 && iteration1<=(2^31-1)) {
            System.out.println("* int");
        }
        else if ((-2^63) <= iteration1 && iteration1<=(2^631)){
            System.out.println("* long");

        }
        if (-128 <= iteration2 && iteration2 <= 127) {
            System.out.println("* byte");
        }
        else if (-32768<=iteration2 && iteration2<=32767){
            System.out.println("* short");
        }
        else if ((-2^31)<=iteration2 && iteration2<=(2^31-1)) {
            System.out.println("* int");
        }
        else if ((-2^63) <= iteration2 && iteration2<=(2^631)){
            System.out.println("* long");

        }
        if (-128 <= iteration3 && iteration3 <= 127) {
            System.out.println("* byte");
        }
        else if (-32768<=iteration3 && iteration3<=32767){
            System.out.println("* short");
        }
        else if ((-2^31)<=iteration3 && iteration3<=(2^31-1)) {
            System.out.println("* int");
        }
        else if ((-2^63) <= iteration3 && iteration3<=(2^631)){
            System.out.println("* long");

        }
        if (-128 <= iteration4 && iteration4 <= 127) {
            System.out.println("* byte");
        }
        else if (-32768<=iteration4 && iteration4<=32767){
            System.out.println("* short");
        }
        else if ((-2^31)<=iteration4 && iteration4<=(2^31-1)) {
            System.out.println("* int");
        }
        else if ((-2^63) <= iteration4 && iteration4<=(2^631)){
            System.out.println("* long");

        }
        if (-128 <= iteration5 && iteration5 <= 127) {
            System.out.println("* byte");
        }
        else if (-32768<=iteration5 && iteration5<=32767){
            System.out.println("* short");
        }
        else if ((-2^31)<=iteration5 && iteration5<=(2^31-1)) {
            System.out.println("* int");
        }
        else if ((-2^63) <= iteration5 && iteration5<=(2^631)){
            System.out.println("* long");

        }








    }
}
