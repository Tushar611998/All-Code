package _2_D_Arrays;

public class Test2_PrintLeadersInArray {
    public static void leaders(int[] input) {
        for(int i =0;i<input.length-1;i++){
            for(int j =i+1;j<input.length;j++){
                if(!(input[i] >= input[j])){
                    break;
                }
                if (j == input.length-1){
                    System.out.print(input[i]+" ");
                }
            }
            if (i==input.length-2){
                System.out.print(input[i+1]+" ");
            }
        }

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */

    }


}
