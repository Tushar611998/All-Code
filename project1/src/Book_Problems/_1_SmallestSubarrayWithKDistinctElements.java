package Book_Problems;
import java.util.Scanner;
import java.util.ArrayList;

public class _1_SmallestSubarrayWithKDistinctElements {
    // given arraylist we have to find arraylist of exact k distinct elements

    public static ArrayList<Integer> smallestSubarrayWithKDistinct(ArrayList<Integer> a, int K)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        if(K==1){
            arr.add(0);
            arr2.add(arr.get(0));
            arr2.add(arr.get(arr.size()-1));
            return arr2;
        }
        for(int i = 0;i<a.size();i++){
            arr = new ArrayList<>();

            int j =i;
//            arr.add(j);
                for (; j < a.size() ; j++) {
                    int k = j + 1;

                    if (arr.size() == K-1  && a.get(j) != a.get(i)) {
                        arr.add(j);
                        arr2.add(arr.get(0));
                        arr2.add(arr.get(arr.size()-1));
                        return arr2;

                    }
                    else if (j == a.size()-1) {
                        arr = new ArrayList<>();
                        arr.add(-1);
                        return arr;
                    }else if (a.get(j) != a.get(k) && a.get(k) != a.get(i)) {
                        arr.add(j);
                    }
                     else {
                        break;
                    }
                }
        }
        if(arr.size()==K) {

            arr2.add(arr.get(0));
            arr2.add(arr.get(arr.size() - 1));
        }else{
            arr = new ArrayList<>();
            arr2.add(-1);
        }
        return arr2;        // Write your code here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();


            for (int i = 0;;i++){
                int input = sc.nextInt();
                if (input != -1) {
                    arr.add(input);
            }
                else{
                    break;
                }
        }
        for(int i =0;i<arr.size();i++){
            System.out.print(arr.get(i)+ " ");
        }
        System.out.println();
            ArrayList<Integer>ans = smallestSubarrayWithKDistinct(arr,3);
            for(int i =0;i<ans.size();i++){
                System.out.println(ans.get(i)+ " ");
            }
    }
}
