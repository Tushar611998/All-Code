package _2_D_Arrays;
import java.util.Scanner;
public class Test2_MinLengthWordInString {
    public static String minLengthWord(String input){
        int start =0;
        int end =0;
        int count=0;
        int smallest = Integer.MAX_VALUE;
        String str = "";
        String word = "";
        for(int i =0;i<input.length();i++){

            if(input.charAt(i)==' '){
                end = i-1;
                if(count<smallest){
                    word ="";
                    smallest = count;
                    for(int j = start;j<=end;j++){
                        word = word + input.charAt(j);
                    }
                    start=i+1;

                }
                count =0;
                start = i+1;
            }
            else{
                count = count+1;
            }
        }
        if(count<smallest) {
            word = "";
            smallest = count;
            for (int j = start; j <= input.length()-1; j++) {
                word = word + input.charAt(j);
            }
        }
        str = str+word;
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String m =minLengthWord(input);
        System.out.println(m);
    }


}
