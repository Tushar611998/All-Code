package PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class BuyTheTicket {
    public static int buyTicket(int input[], int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        int t =0;

        for(int i =0;i<input.length;i++){
            pq.add(input[i]);
            ans.add(input[i]);
        }

        while(!pq.isEmpty()){
            if(ans.get(0)==pq.element() && k==0){
                pq.remove();
                ans.remove(0);
                t+=1;
                return t;
            }else if(ans.get(0)==pq.element()){
                pq.remove();
                ans.remove(0);
                k-=1;
                t+=1;
            }else {
                if(k==0 && ans.get(0)!=pq.element()){
                    int a = ans.get(0);
                    ans.remove(0);
                    ans.add(a);
                    k = ans.size()-1;
                }else{
                    int a = ans.get(0);
                    ans.remove(0);
                    ans.add(a);
                    k = k-1;
                }
            }
        }
        return t;
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

    }

    public static void main(String[] args) {
        int arr[] = {2,3,2,2,4};
        int ans = buyTicket(arr,3);
        System.out.println(ans);
    }
}
