package LeetCode._2DArrays;

public class DigonalTraversal {
    public static int[] findDiagonalOrder(int[][] mat) {
        int i=0;
        int j =0;
        int arr[] = new int[mat.length * mat[i].length];
        int k =0;
        arr[k] = mat[i][j];
        j++;
        k++;

        while(i!=mat.length && j!=mat[i].length){
            if(j==0){

                while(i!=0 && j!=mat[i].length-1){
                    arr[k] = mat[i][j];
                    i--;
                    j++;
                    k++;
                }
                arr[k] = mat[i][j];
                if(i==0 && j!=mat[i].length-1) {
                    j++;
                    k++;
                }else{
                    i++;
                    k++;
                }

            }
            else if(i==0){

                while(j!=0 && i!=mat.length-1){
                    arr[k] = mat[i][j];
                    k++;
                    i++;
                    j--;
                }
                arr[k] = mat[i][j];
                if(j==0 && i!=mat.length-1) {
                    i++;
                    k++;
                }else{
                    j++;
                    k++;
                }
            }
            else if(j==mat[i].length-1){
                while(i!=mat.length-1 && j!=0){
                    arr[k] = mat[i][j];
                    k++;
                    i++;
                    j--;
                }
                arr[k] = mat[i][j];
                if(j==0 && i!=mat.length-1) {
                    i++;
                    k++;
                }else{
                    j++;
                    k++;
                }
            }else if(i==mat.length-1){
                while(j!=mat[i].length-1 && i!=0){
                    arr[k] = mat[i][j];
                    k++;
                    i--;
                    j++;
                }
                arr[k] = mat[i][j];
                if( j==mat[i].length-1 && i!=mat.length-1) {
                    i++;
                    k++;
                }else{
                    j++;
                    k++;
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[][]= {{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20}};
        int ans [] = findDiagonalOrder(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
