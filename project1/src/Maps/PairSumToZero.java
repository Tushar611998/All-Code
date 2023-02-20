package Maps;
import java.util.*;

public class PairSumToZero {
    public static int pairSumToZero(int []arr,int size){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<size;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        int pairs =0;
        for(int i =0;i<size;i++){
            if(map.containsKey(-(arr[i]))){
                pairs+=map.get(-(arr[i]))+map.get(arr[i]);
                map.put(arr[i],0);
                map.put(-(arr[i]),0);
            }
        }
        return pairs;

    }

    public static void main(String[] args) {
        int [] arr = {-2,-12,2,11,12,-2,1,-2,2,-11,12,2,6};
        int ans = pairSumToZero(arr,arr.length);
        System.out.println(ans);
    }
}
