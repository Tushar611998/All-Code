package com.company;

import java.sql.Time;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class patternPractice {
    public static void main(String[] args) {
        int arr[] = { 9,8,5,6,2,1};

        for ( int i=0;i< arr.length;i++){
            int j = i;
            int temp = arr[j];
            while(j-1>=0){

                if(arr[j]<arr[j-1]){
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }
                else{
                    j--;
                }

            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}









































