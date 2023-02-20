package Maps;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Set;

public class MaxFreqNumber {
    public static int maxFrequencyNumber(int[] arr){

        HashMap<Integer, Integer> freq = new HashMap<>();
        Arrays.sort(arr);

        for(int i =0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                int old = freq.get(arr[i]);
                freq.replace(arr[i],old,old+1);
            }else {
                freq.put(arr[i], 1);
            }
        }
        int max =0;
        int key = 0;
        Set<Integer> s = freq.keySet();
        for(Integer i : s){
            if(freq.get(i)>max){
                max = freq.get(i);
                key = i;
            }
        }
        return key;

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
    }

    public static void main(String[] args) {
        int [] arr = {2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6 };
        int ans = maxFrequencyNumber(arr);
        System.out.println(ans);
    }
}
