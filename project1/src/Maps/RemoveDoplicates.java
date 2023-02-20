package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDoplicates {
    public static ArrayList<Integer> removeDuplicates(int[]arr){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> checked = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            if(checked.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            checked.put(arr[i], true);
        }
        return output;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,2,3,5,1000,6};
        ArrayList<Integer> ans = removeDuplicates(arr);
        for(int i =0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
