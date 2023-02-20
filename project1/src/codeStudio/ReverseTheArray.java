package codeStudio;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseTheArray {

    //given an array of size n and given position m after that position you have to reverse an array

    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i = m;i<arr.size();i++){
            ans.add(arr.get(i));
        }
        int j = ans.size()-1;
        for(int i =m;i<arr.size() && j>=0 ;i++){

            arr.set(i,ans.get(j));
            j--;
        }


        // Write your code here.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<n;i++){
            arr.add(sc.nextInt());
        }
        reverseArray(arr,m);

        for(int i = 0;i<n;i++){
            System.out.print(arr.get(i)+ " ");
        }

    }
}

