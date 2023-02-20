package Maps;

import java.util.HashMap;

public class PrintIntersection {
    public static void printIntersection(int[] arr1,int[] arr2){

        HashMap<Integer,Integer> a1 = new HashMap<>();

        for(int i = 0;i<arr1.length;i++){
            if(a1.containsKey(arr1[i])){
                a1.put(arr1[i],a1.get(arr2[i])+1);
            }else{
                a1.put(arr1[i],1);

            }
        }

        for(int i =0;i<arr2.length;i++){
            if(a1.containsKey(arr2[i])){
                if(a1.get(arr2[i])!=0){
                    System.out.println(arr2[i]);
                    a1.put(arr2[i],i-1);
                }

            }
        }
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {1,3,5,6};
        printIntersection(arr1,arr2);
    }

}
