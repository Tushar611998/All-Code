package HackerRank_Problems;
import java.util.*;

public class ArrayList_Easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
        for(int i = 0;i<iterations;i++){
            int n = sc.nextInt();

            ArrayList<Integer> a = new ArrayList<>();
            for(int j =0;j<n ;j++){
                int num = sc.nextInt();
                a.add(num);
            }
            arr1.add(a);
        }
        int q = sc.nextInt();
        for(int i = 0;i<q;i++){
            int position = sc.nextInt();
            int element = sc.nextInt();
            if(position<arr1.size() && position >=0 ){
                if(element<=arr1.get(position-1).size() && element>=0) {
                    System.out.println(arr1.get(position - 1).get(element - 1));
                }
                else{
                    System.out.println("Error");

                }
            }
            else{
                System.out.println("Error");
            }

        }
    }


}
