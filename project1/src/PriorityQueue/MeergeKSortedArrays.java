package PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MeergeKSortedArrays {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();


        for(int i=0;i<input.size();i++){
            for(int j =0;j<input.get(i).size();j++){
                pq.add(input.get(i).get(j));
            }
        }

        while(!pq.isEmpty()){
            ans.add(pq.remove());
        }

        return ans;
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

    }


}
