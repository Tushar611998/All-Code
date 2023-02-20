package Maps;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class LongestConsecutiveSequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {


        HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],true);
        }
        int start =0;
        int end  =0;
        int fstart = 0;
        int fend = 0;
        int max =0;
        // int count;

        for(int i = 0;i<arr.length;i++){

            int index = arr[i];
            if(map.get(arr[i])){
                int count =1;
                start = arr[i];
                for(int j = 1;j<arr.length;j++){

                    if(map.containsKey(arr[i]+j)){
                        end = arr[i]+j;
                        count+=1;
                        map.put(arr[i]+j,false);
                        // count+=1;
                    }else{
                        end = arr[i]+j-1;
                        break;
                    }
                }
                for(int j = 1;j<arr.length;j++){
                    if(map.containsKey(arr[i]-j)){
                        start = arr[i]-j;
                        count+=1;
                        map.put(arr[i]-j,false);

                    }else{
                        start = arr[i]-j+1;
                        break;
                    }
                }

                if(count>max){
                    max = count;
                    fstart = start;
                    fend = end;
                }
            }
            map.put(arr[i],false);
        }
        ans.add(fstart);
        ans.add(fend);
        return ans;
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
    }

    public static void main(String[] args) {
        int arr[] = {2, 12, 9, 16, 10, 5 ,3, 20, 25, 11 ,1, 8, 6};
        ArrayList<Integer> ans = longestConsecutiveIncreasingSequence(arr);
        for (int i =0;i< ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
