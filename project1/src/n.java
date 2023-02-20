import java.util.Scanner;

public class n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String ans = reverseStringWordWise(input);
//        System.out.println(ans);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        int GCD =0;
//        int i =1;
//        int n;
//        if(n1>n2){
//            n = n2;
//        }else{
//            n =n1;
//        }
//        while(i<=n){
//            if(n1%i==0 && n2%i==0){
//                GCD = i;
//            }
//            i++;
//        }
        int ans = primecount(1);
        System.out.print(ans);


    }

    public static int primecount(int n){
        int ans=0;
        for(int i =2;i<=n;i++){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                ans++;
            }
        }
        return ans;
    }
}
