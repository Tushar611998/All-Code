package HackerRank_Problems;
import java.util.Scanner;
public class SmallestAndLargestSubstring_LexicogaphicalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int a = sc.nextInt();
        int[] arr = new int[255];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]=s.charAt(i);
        }
        String smallest = "";
        String largest = "";
        for(int p=0;p<a;p++){
            smallest = smallest+s.charAt(p);
            largest = largest + s.charAt(p);
        }
//        String temp1 = "";
//        String temp2 ="";
        for (int i = 0; i < s.length() && a+i<s.length()+1; i++) {
            String temp1 = s.substring(i, a+i);
//            String temp2 =  s.substring(i+1,a+i+1);
            int k=0;
            if(arr[temp1.charAt(k)]<arr[smallest.charAt(k)]){
                smallest ="";
                smallest = smallest+temp1;
            }
            else if(arr[temp1.charAt(k)]>arr[largest.charAt(k)]) {
                largest = "";
                largest = largest + temp1;
            }
            else if (arr[temp1.charAt(k)] == arr[smallest.charAt(k)]){
                for(int p=1;p<temp1.length();p++){
                    if(arr[temp1.charAt(p)]<arr[smallest.charAt(p)]) {
                        smallest = "";
                        smallest = smallest + temp1;
                        break;
                    }
                    else if(arr[temp1.charAt(p)] == arr[smallest.charAt(p)]){
                        continue;
                    }
                    else{
                        break;
                    }
                }
            }
            else if (arr[temp1.charAt(k)] == arr[largest.charAt(k)]){
                for(int p=1;p<temp1.length();p++){
                    if(arr[temp1.charAt(p)]>arr[largest.charAt(p)]) {
                        largest = "";
                        largest = largest + temp1;
                        break;
                    }
                    else if(arr[temp1.charAt(p)] == arr[largest.charAt(p)]){
                        continue;
                    }
                    else{
                        break;
                    }
                }
            }
            else{continue;}
//            System.out.println(temp1);

        }
        System.out.println(smallest);
        System.out.println(largest);
    }

}
