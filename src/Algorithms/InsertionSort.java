package Algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertion(int[] arr, int n) {
        int i, j, key;
        for(i=1; i<n; i++){
            key = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {9,2,1,5,6,3,7,8,0,4};
        int[] array = insertion(arr, 10);
        System.out.println(Arrays.toString(array));
    }

}
